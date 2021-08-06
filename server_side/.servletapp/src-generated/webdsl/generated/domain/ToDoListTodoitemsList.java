package webdsl.generated.domain;
@SuppressWarnings("unchecked")public class ToDoListTodoitemsList extends utils.OwnedList<webdsl.generated.domain.ToDoItem>{
public  ToDoListTodoitemsList(){
super();
}
public  ToDoListTodoitemsList(int anticipatedSize){
super(anticipatedSize);
}
public  ToDoListTodoitemsList(java.util.List<webdsl.generated.domain.ToDoItem> list){
super(list);
}
public  ToDoListTodoitemsList(Object owner){
super(owner);
}
public  ToDoListTodoitemsList(Object owner,int anticipatedSize){
super(owner,anticipatedSize);
}
public  ToDoListTodoitemsList(Object owner,java.util.List<webdsl.generated.domain.ToDoItem> list){
super(owner,list);
}
@Override public boolean addAll(java.util.Collection<? extends webdsl.generated.domain.ToDoItem> col){
if(!doEvents){
return super.addAll(col);
}
else if(this.owner==null){
return super.addAll(col);
}
else if(!beingSet&&doEvents){
java.util.Iterator<? extends webdsl.generated.domain.ToDoItem> it=col.iterator();
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
@Override public boolean add(webdsl.generated.domain.ToDoItem item){
if(!doEvents){
return super.add(item);
}
else if(this.owner==null){
return super.add(item);
}
else if(item!=null&&!beingSet&&doEvents){
ToDoList owner=(ToDoList)this.owner;
owner.setChanged("todoitems");
beingSet=true;
webdsl.generated.domain.ToDoItem oldthing=webdsl.generated.domain.ToDoItem._static_createEmpty_();
boolean result=super.add(item);
owner.addToTodoitemsToDoItem_(item);
beingSet=false;
return result;
}
return false;
}
@Override public webdsl.generated.domain.ToDoItem set(int index,webdsl.generated.domain.ToDoItem newitem){
if(!doEvents){
return super.set(index,newitem);
}
else if(this.owner==null){
return super.set(index,newitem);
}
else if(newitem!=null&&!beingSet&&doEvents&&index>=0&&index<size()){
beingSet=true;
ToDoList owner=(ToDoList)this.owner;
owner.setChanged("todoitems");
webdsl.generated.domain.ToDoItem olditem=get(index);
super.set(index,newitem);
webdsl.generated.domain.ToDoItem item=olditem;
if(!contains(item)){
owner.removeFromTodoitemsToDoItem_(item);
}
item=newitem;
owner.addToTodoitemsToDoItem_(item);
beingSet=false;
return olditem;
}
return null;
}
@Override public void add(int index,webdsl.generated.domain.ToDoItem item){
if(!doEvents){
super.add(index,item);
}
else if(this.owner==null){
super.add(index,item);
}
else if(item!=null&&!beingSet){
ToDoList owner=(ToDoList)this.owner;
owner.setChanged("todoitems");
beingSet=true;
webdsl.generated.domain.ToDoItem oldthing=webdsl.generated.domain.ToDoItem._static_createEmpty_();
super.add(index,item);
owner.addToTodoitemsToDoItem_(item);
beingSet=false;
}
}
@Override public webdsl.generated.domain.ToDoItem remove(int index){
if(!doEvents){
return super.remove(index);
}
else if(this.owner==null){
return super.remove(index);
}
else if(index>=0&&index<size()&&!beingSet&&doEvents){
beingSet=true;
ToDoList owner=(ToDoList)this.owner;
owner.setChanged("todoitems");
webdsl.generated.domain.ToDoItem item=super.remove(index);
if(!contains(item)){
owner.removeFromTodoitemsToDoItem_(item);
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
else if(obj!=null&&!beingSet&&doEvents&&obj instanceof webdsl.generated.domain.ToDoItem){
webdsl.generated.domain.ToDoItem item=(webdsl.generated.domain.ToDoItem)obj;
beingSet=true;
ToDoList owner=(ToDoList)this.owner;
owner.setChanged("todoitems");
boolean result=super.remove(item);
if(!contains(item)){
owner.removeFromTodoitemsToDoItem_(item);
}
beingSet=false;
return result;
}
return false;
}
}
