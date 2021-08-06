application ToDoListApp

imports services

var globalflist :=ToDoList{}
var globalfitem :=ToDoItem{}

template bootstrap {
  // https://getbootstrap.com/docs/5.0/getting-started/introduction/#starter-template
  head {
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.0/font/bootstrap-icons.css">
   
    <!-- Bootstrap icon --> 	
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.0/font/bootstrap-icons.css">	
    
    <!-- Option 1: Bootstrap Bundle with Popper -->
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>	

    //<title>"demo"</title>
  }
}


entity User{
	username :: String (searchable)
	password :: Secret
	//email :: Email
	todolists : List<ToDoList> 
	sharedTodolists : List<ToDoList> := [l | l in (from ToDoList) where this in l.allowedUsers]
}


entity ToDoList{
	name :: String
	author : User
	allowedUsers : List<User>
	todoitems : List<ToDoItem>
}

entity ToDoItem{
	name :: String
	duedate :: Date
	priority :: Int
	description :: String
	tag :: String
	status :: Bool //finish or not
}

define override login(){
  var username := ""
  var password : Secret := ""
  h3[class="center"]{ "Login" }
  form[class="center"]{ 
    label("Username: "){ input(username) }
    label("Password: "){ input(password) }
    //captcha()
    submit login() {"Confirm"}
  }
  action login(){
    validate(authenticate(username,password), 
      "The login credentials are not valid.");
    //message("You are now logged in.");
    return home();
  }
}

define override logout(){
  //"Logged in as " output(securityContext.principal)
  form{
    submitlink logout() {"Log Out"}
  }
  action logout(){
    securityContext.principal := null;
    return root();
  }
}


page root(){ 
	
	var newuser := User{}
	<div class="rootpage clearfix">
	<div class="center">
		h2[class="nomargin center"]{"Welcome to ToDoList App"}
		login()
		
		h3[class="center"]{ "Registration" }
		
		form[class="center"] {
			label("Username: "){input( newuser.username )}
			label("Password: "){input( newuser.password )}
			submit action{
			  newuser.password := newuser.password.digest();
			  newuser.save();
			}{ "Confirm" }
		}
	</div>
	</div>

}


principal is User with credentials username, password

access control rules
  rule page root{ true }
  rule page home{ loggedIn() } 
  //rule page home{ true } 
  rule ajaxtemplate todoLists(focusedListId : UUID, ph : Placeholder,ph2 : Placeholder,ph3 : Placeholder) { loggedIn() }
  rule ajaxtemplate todoItems(focusedListName : String, focusedItemName : String, ph : Placeholder ,ph3 : Placeholder) { loggedIn() }
  rule ajaxtemplate description(focusedListName : String,focusedItemName : String, ph : Placeholder) { loggedIn() }

section home

htmlwrapper {
  iAlarm       i[class="bi bi-alarm"]
  iAlarmFill   i[class="bi bi-alarm-fill"]
  iAlignBottom i[class="bi bi-align-bottom"]
  iCheckList   i[class="card-checklist"]
}

predicate mayViewList(u:User,l:ToDoList){
	l.author == principal || u in l.allowedUsers
}

ajax template todoLists(focusedListId : UUID, ph : Placeholder, ph2 : Placeholder,ph3 : Placeholder) {
	for(tl in securityContext.principal.todolists) {
	  	if(mayViewList(securityContext.principal,tl)){
		    div [class=if (tl.id == focusedListId) "row focus" else "row"] {
		      div [class="col-sm"] { submitlink action {
		      	 globalflist.name:=tl.name;
		      	 replace(ph, todoLists(tl.id, ph,ph2,ph3)); 
		      	 replace(ph2, todoItems(globalflist.name,"", ph2,ph3));
		     } {div{div{iCheckList} div{output("todolist name: ~tl.name")}} } }
		      div [class="col-sm"] { submitlink action { securityContext.principal.todolists.remove(tl); } { "delete" }  }
		    }  		
	  	}
	  }
	  
	 
	  <div class="row title">output("Shared To Do Lists")</div>
	  for(tl in securityContext.principal.sharedTodolists) {
	  	if(mayViewList(securityContext.principal,tl)){
		    div [class=if (tl.id == focusedListId) "row focus" else "row"] {
		      div [class="col-sm"] { submitlink action { globalflist.name:=tl.name;replace(ph, todoLists(tl.id, ph,ph2,ph3)); } { "todolist name: ~tl.name" } }
		      div [class="col-sm"] { submitlink action { securityContext.principal.todolists.remove(tl); } { "delete" }  }
		    }  		
	  	}
	  } 
	  
}

ajax template todoItems(focusedListName : String, focusedItemName : String, ph : Placeholder,ph3 : Placeholder){
		var newusername : String
		var newtditem := ToDoItem{}
	
		if(focusedListName == null){
			<div>output("No Selected To Do List")</div>
		}else{
			for(tl in securityContext.principal.todolists) {
				if(tl.name==focusedListName){
			
			div{iCheckList}
			<div>output("ListName:"+tl.name)</div>
			
			form{
				<div class="row">
					<div class="col-sm">
						input(newusername)[ class= "form-control" ]
					</div>
					<div class="col-sm">
						submit action{

							log("searchUser("+ newusername +").length:"+searchUser(newusername).length);
						
							for(u:User in searchUser(newusername)){
									tl.allowedUsers.add(u);
							}
							
							securityContext.principal.save();	
						}{ "share to user" }
					</div>
				</div>
			}
		
			
			for(u in tl.allowedUsers){
				<div class="row">
					<div class="col-sm"> output("allowedUser name:"+u.username) </div>
					<div class="col-sm">label("delete")[onclick:=action{tl.allowedUsers.remove(u);}]</div>
					//div[class="col-sm"]{
				      //submit action{ ti.delete(); }{ "delete" }
				    //}
				</div>
			}
			
			form{
				<div class="row">
					<div class="col-sm">
						input(newtditem.name)[ class= "form-control" ]
					</div>
					<div class="col-sm">
						submit action{
							tl.todoitems.add(newtditem);
							//curtdlist.todoitems.add(newtditem);
							securityContext.principal.save();	
						}{ "add a todoitem" }
					</div>
				</div>
			}
			
		
			for(ti in tl.todoitems){
				div [class=if (ti.name == focusedItemName) "row focus" else "row"] {
			      div [class="col-sm"] { submitlink action { replace(ph, todoItems(tl.name, ti.name, ph,ph3)); replace(ph3, description(tl.name, ti.name, ph3));} { "todoitem name: ~ti.name" } }
			      div [class="col-sm"] { submitlink action { tl.todoitems.remove(ti); } { "delete" }  }
			    }
			}
			
		}	
		}
		}	
}

ajax template description(focusedListName : String,focusedItemName : String, ph : Placeholder){
	var newdescription : String
		
	if(globalflist.id == null){
		<div>output("No Description")</div>
	}else{
		for(tl in securityContext.principal.todolists){
			if(tl.name==focusedListName){
				for(ti in tl.todoitems){
					if(ti.name==focusedItemName){
						label("Description")
						form{
							<div class="row">
								<div class="col-sm">
									input(newdescription)[ class= "form-control" ]
								</div>
								<div class="col-sm">
									submit action{
										ti.description := newdescription;
										securityContext.principal.save();	
									}{ "edit the description" }
								</div>
							</div>
						}
						<div class="row">
							<div>output(ti.description)</div>
						</div>						
					}
				}
			}
		}

	}	
}


page home{
	
	bootstrap
	
	var newlid:UUID
	var newtdlist := ToDoList{}

	<div class="container-fluid">
		<div class="row page">
		
		// left page
		<div class="col-sm-3 col-left col-border">
			<div class="row">
				<div class="col-sm">
					output("Username: "+securityContext.principal.username)
				</div>
				<div class="col-sm">
					logout()
				</div>
			</div>
			
			<div class="row title">"To Do Lists"</div>
			
	
			form{
				<div class="row">
				input(newtdlist.name)[ class= "form-control col-sm" ]
				submit action{
					newtdlist.author:=securityContext.principal;
					securityContext.principal.todolists.add(newtdlist);
			     	securityContext.principal.save();
			    }[class="col-sm"] { "add" }
			    </div>
			}
			
			placeholder ph { todoLists(newlid, ph,ph2,ph3) }
			
		</div>
		
		// middle page
		<div class="col-sm-5 col-border">
			placeholder ph2 { todoItems(globalflist.name,"", ph2,ph3) }
		</div>
		
		//right page
		<div class="col-sm-4 col-border">
			placeholder ph3 { description("","", ph3)}
		</div>
		
		</div>
	</div>		
	
}


/*
template toggleVisibility( initialText: String ){
  <a onclick="$( '#" + id + "' ).show(); $(this).hide();">
    output( initialText )
  </a>
  <div id=id style="display:none;">
    elements
  </div>
}
*/


