package webdsl.generated.domain;
@SuppressWarnings("unchecked")public class UserTodolistsList extends utils.OwnedList<webdsl.generated.domain.ToDoList>{
public  UserTodolistsList(){
super();
}
public  UserTodolistsList(int anticipatedSize){
super(anticipatedSize);
}
public  UserTodolistsList(java.util.List<webdsl.generated.domain.ToDoList> list){
super(list);
}
public  UserTodolistsList(Object owner){
super(owner);
}
public  UserTodolistsList(Object owner,int anticipatedSize){
super(owner,anticipatedSize);
}
public  UserTodolistsList(Object owner,java.util.List<webdsl.generated.domain.ToDoList> list){
super(owner,list);
}
@Override public boolean addAll(java.util.Collection<? extends webdsl.generated.domain.ToDoList> col){
if(!doEvents){
return super.addAll(col);
}
else if(this.owner==null){
return super.addAll(col);
}
else if(!beingSet&&doEvents){
java.util.Iterator<? extends webdsl.generated.domain.ToDoList> it=col.iterator();
while(it.hasNext()){
add(it.next());
}
return true;
}
return super.addAll(col);
}
@Override public void clear(){
if(!doEvents){
super.clear();
}
else if(this.owner==null){
super.clear();
}
else if(!beingSet&&doEvents){
while(!isEmpty()){
remove(iterator().next());
}
}
}
@Override public boolean add(webdsl.generated.domain.ToDoList item){
if(!doEvents){
return super.add(item);
}
else if(this.owner==null){
return super.add(item);
}
else if(item!=null&&!beingSet&&doEvents){
User owner=(User)this.owner;
owner.setChanged("todolists");
beingSet=true;
webdsl.generated.domain.ToDoList oldthing=webdsl.generated.domain.ToDoList._static_createEmpty_();
boolean result=super.add(item);
owner.addToTodolistsToDoList_(item);
beingSet=false;
return result;
}
return false;
}
@Override public webdsl.generated.domain.ToDoList set(int index,webdsl.generated.domain.ToDoList newitem){
if(!doEvents){
return super.set(index,newitem);
}
else if(this.owner==null){
return super.set(index,newitem);
}
else if(newitem!=null&&!beingSet&&doEvents&&index>=0&&index<size()){
beingSet=true;
User owner=(User)this.owner;
owner.setChanged("todolists");
webdsl.generated.domain.ToDoList olditem=get(index);
super.set(index,newitem);
webdsl.generated.domain.ToDoList item=olditem;
if(!contains(item)){
owner.removeFromTodolistsToDoList_(item);
}
item=newitem;
owner.addToTodolistsToDoList_(item);
beingSet=false;
return olditem;
}
return null;
}
@Override public void add(int index,webdsl.generated.domain.ToDoList item){
if(!doEvents){
super.add(index,item);
}
else if(this.owner==null){
super.add(index,item);
}
else if(item!=null&&!beingSet){
User owner=(User)this.owner;
owner.setChanged("todolists");
beingSet=true;
webdsl.generated.domain.ToDoList oldthing=webdsl.generated.domain.ToDoList._static_createEmpty_();
super.add(index,item);
owner.addToTodolistsToDoList_(item);
beingSet=false;
}
}
@Override public webdsl.generated.domain.ToDoList remove(int index){
if(!doEvents){
return super.remove(index);
}
else if(this.owner==null){
return super.remove(index);
}
else if(index>=0&&index<size()&&!beingSet&&doEvents){
beingSet=true;
User owner=(User)this.owner;
owner.setChanged("todolists");
webdsl.generated.domain.ToDoList item=super.remove(index);
if(!contains(item)){
owner.removeFromTodolistsToDoList_(item);
}
beingSet=false;
return item;
}
return null;
}
@Override public boolean remove(Object obj){
if(!doEvents){
return super.remove(obj);
}
else if(this.owner==null){
return super.remove(obj);
}
else if(obj!=null&&!beingSet&&doEvents&&obj instanceof webdsl.generated.domain.ToDoList){
webdsl.generated.domain.ToDoList item=(webdsl.generated.domain.ToDoList)obj;
beingSet=true;
User owner=(User)this.owner;
owner.setChanged("todolists");
boolean result=super.remove(item);
if(!contains(item)){
owner.removeFromTodolistsToDoList_(item);
}
beingSet=false;
return result;
}
return false;
}
}
