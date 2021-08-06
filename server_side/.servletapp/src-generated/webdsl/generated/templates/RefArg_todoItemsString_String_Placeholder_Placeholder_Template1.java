package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_todoItemsString_String_Placeholder_Placeholder_Template1 extends utils.RefArg{
public todoItemsString_String_Placeholder_Placeholder_Template template;
public  RefArg_todoItemsString_String_Placeholder_Placeholder_Template1(todoItemsString_String_Placeholder_Placeholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setNewtditem_(webdsl.generated.domain.ToDoItem._static_cast_(obj));
return this;
}
public Object get(){
return template.getNewtditem_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.ToDoItem.$static$all_();
}
}
