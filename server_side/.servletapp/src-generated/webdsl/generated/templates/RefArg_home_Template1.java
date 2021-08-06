package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_home_Template1 extends utils.RefArg{
public home_Template template;
public  RefArg_home_Template1(home_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setNewtdlist_(webdsl.generated.domain.ToDoList._static_cast_(obj));
return this;
}
public Object get(){
return template.getNewtdlist_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.ToDoList.$static$all_();
}
}
