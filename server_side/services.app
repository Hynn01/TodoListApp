module services

service loginService(){
	
	var body :=readRequestBody();
	var o := JSONObject(body);
	var username := o.getString( "username" ) ;
	var password : Secret := o.getString( "password" ) as Secret ;
	var msg := JSONObject();
	
	if(authenticate(username,password)){
		msg.put( "message", "ok" );
	}else{
		msg.put( "message", "failed" );
	}
	
    return msg;
}

service logoutService(){
	
	securityContext.principal := null;
	var msg := JSONObject();
	
	if(securityContext.principal==null){
		msg.put( "message", "ok" );
	}else{
		msg.put( "message", "failed" );
	}
	
    return msg;
}


service registartionService(){
	var body :=readRequestBody();
	var o := JSONObject(body);
	User{
		username := o.getString( "username" )
		password := (o.getString( "password" ) as Secret).digest()
    }.save();
   
    var msg := JSONObject();
    msg.put( "message", "ok" );
    return msg;
}

service User(){
	if( getHttpMethod() == "GET" ){
	    var o := JSONObject();
	    o.put( "username", securityContext.principal.username );
		return o;
	}
}

service TodoList(){
  
  if( getHttpMethod() == "POST" ){
    var body := readRequestBody();
    var o := JSONObject( body );
    
    var newtdlist := ToDoList{	
      name := o.getString( "name" )   
      author:=securityContext.principal	
    };
	securityContext.principal.todolists.add(newtdlist);
	securityContext.principal.save();    
    var msgs := JSONArray();
    var msg := JSONObject();
    msg.put( "message", "ok" );
    msgs.put( msg );
    return msgs;
  }
  
  if(getHttpMethod()=="GET"){
	  var a := JSONArray();
	  for( tdlist in securityContext.principal.todolists ){
	    var o := JSONObject();
	    o.put( "name", tdlist.name );
	    a.put( o );
	  }
	  return a;  	
  }
  
  
}

service deleteTodoList(){
	
	if(getHttpMethod()=="POST"){
	    var body := readRequestBody();
	    var o := JSONObject( body );	
		
	    for(tl in securityContext.principal.todolists){
	    	if(tl.name==o.getString("tdlistname")){
	    		securityContext.principal.todolists.remove(tl);
	    	}
	    }
		securityContext.principal.save();    
	    var msgs := JSONArray();
	    var msg := JSONObject();
	    msg.put( "message", "ok" );
	    msgs.put( msg );
	    return msgs; 			
	}
		

}


service TodoItem(tdlistname:String){
	
	if(getHttpMethod()=="POST"){
	    var body := readRequestBody();
	    var o := JSONObject( body );
	    
	    var newtditem := ToDoItem{	
	      name := o.getString( "tditemname" )
	      duedate := today()
	      status := false
	      description:=""
	    };
	    
	    for(tl in securityContext.principal.todolists){
	    	if(tl.name==o.getString("tdlistname")){
	    		tl.todoitems.add(newtditem);
	    	}
	    }
		securityContext.principal.save();    
	    var msgs := JSONArray();
	    var msg := JSONObject();
	    msg.put( "message", "ok" );
	    msgs.put( msg );
	    return msgs;		
	}
	
	/*
	if(getHttpMethod()=="GET"){

		log("getTodoItems tdlistname:"+tdlistname);
		
		var res := JSONArray();
	
		for(tl in securityContext.principal.todolists) {
			if(tl.name==tdlistname){
				for( tditem in tl.todoitems ){
					var o2 := JSONObject();
					o2.put( "name", tditem.name );
					o2.put("status",tditem.status);
					o2.put("year",tditem.duedate.getYear());
					o2.put("month",tditem.duedate.getMonth());
					o2.put("day",tditem.duedate.getDay());
					res.put( o2 );
				}
			}	
		}
		return res;	
			
	}*/
	
}


service getTodoItem(){
	if(getHttpMethod()=="POST"){

	    var body := readRequestBody();
	    var o := JSONObject( body );
		
		var res := JSONArray();
	
		for(tl in securityContext.principal.todolists) {
			if(tl.name==o.getString("tdlistname")){
				for( tditem in tl.todoitems ){
					var o2 := JSONObject();
					o2.put( "name", tditem.name );
					o2.put("status",tditem.status);
					o2.put("year",tditem.duedate.getYear());
					o2.put("month",tditem.duedate.getMonth());
					o2.put("day",tditem.duedate.getDay());
					res.put( o2 );
				}
			}	
		}
		return res;	
			
	}	
}

service deleteTodoItem(){
	
	if(getHttpMethod()=="POST"){
	    var body := readRequestBody();
	    var o := JSONObject( body );
	    
	    for(tl in securityContext.principal.todolists){
	    	if(tl.name==o.getString("tdlistname")){
	    		for(ti in tl.todoitems){
	    			if(ti.name==o.getString("tditemname")){
	    				tl.todoitems.remove(ti);
	    			}
	    			
	    		}
	    		
	    	}
	    }
		securityContext.principal.save();    
	    var msgs := JSONArray();
	    var msg := JSONObject();
	    msg.put( "message", "ok" );
	    msgs.put( msg );
	    return msgs;
    }	
}

service Date(){
	if(getHttpMethod()=="POST"){
	    var body := readRequestBody();
	    var o := JSONObject( body );
	    
	    for(tl in securityContext.principal.todolists){
	    	if(tl.name==o.getString("tdlistname")){
	    		for(ti in tl.todoitems){
	    			if(ti.name==o.getString("tditemname")){
	    				ti.duedate:=Date(o.getString("date"));
	    			}
	    			
	    		}
	    		
	    	}
	    }
		securityContext.principal.save();    
	    var msgs := JSONArray();
	    var msg := JSONObject();
	    msg.put( "message", "ok" );
	    msgs.put( msg );
	    return msgs;		
	}
}

service Status(){
	if(getHttpMethod()=="POST"){
	    var body := readRequestBody();
	    var o := JSONObject( body );
	    
	    for(tl in securityContext.principal.todolists){
	    	if(tl.name==o.getString("tdlistname")){
	    		for(ti in tl.todoitems){
	    			if(ti.name==o.getString("tditemname")){
	    				ti.status:=o.getBoolean("status");
	    			}
	    			
	    		}
	    		
	    	}
	    }
		securityContext.principal.save();    
	    var msgs := JSONArray();
	    var msg := JSONObject();
	    msg.put( "message", "ok" );
	    msgs.put( msg );
	    return msgs;		
	}
}

service RDescription(tdlistname:String,tditemname:String){
	
	if(getHttpMethod()=="POST"){
	    var body := readRequestBody();
	    var o := JSONObject( body );
	    
	    for(tl in securityContext.principal.todolists){
	    	if(tl.name==o.getString("tdlistname")){
	    		for(ti in tl.todoitems){
	    			if(ti.name==o.getString( "tditemname" )){
	    				ti.description:=o.getString( "description" );
	    			}
	    		}
	    	}
	    }
		securityContext.principal.save();    
	    var msgs := JSONArray();
	    var msg := JSONObject();
	    msg.put( "message", "ok" );
	    msgs.put( msg );
	    return msgs;		
	}

    /*
    if(getHttpMethod()=="GET"){
    	
    	log("tdlistname:"+tdlistname);
    	log("tditemname:"+tditemname);

		var o2 := JSONObject();
	
		for(tl in securityContext.principal.todolists) {
			if(tl.name==tdlistname){
				for( ti in tl.todoitems ){
					if(ti.name==tditemname){
						o2.put( "description", ti.description );				
					}
				}
			}	
		}
		
	  return o2;		
	}
	*/	
}

service getRDescription(){
    if(getHttpMethod()=="POST"){
    	
    	var body := readRequestBody();
	    var o := JSONObject( body );	

		var o2 := JSONObject();
	
		for(tl in securityContext.principal.todolists) {
			if(tl.name==o.getString("tdlistname")){
				for( ti in tl.todoitems ){
					if(ti.name==o.getString("tditemname")){
						o2.put( "description", ti.description );				
					}
				}
			}	
		}
		
	  return o2;		
	}		
}


access control rules
  rule page loginService(){true}
  rule page registartionService(){true}  
  rule page logoutService(){loggedIn()}
  rule page User(){loggedIn()}  
  rule page TodoList(){loggedIn()}
  rule page TodoItem(tdlistname:String){loggedIn()}
  rule page RDescription(tdlistname:String,tditemname:String){loggedIn()}
  rule page Date(){loggedIn()}
  rule page Status(){loggedIn()}
  rule page deleteTodoItem(){loggedIn()}
  rule page deleteTodoList(){loggedIn()}
  rule page getRDescription(){loggedIn()}
  rule page getTodoItem(){loggedIn()}



