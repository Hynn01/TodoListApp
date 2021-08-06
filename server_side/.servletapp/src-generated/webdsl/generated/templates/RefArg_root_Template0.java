package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_root_Template0 extends utils.RefArg{
public root_Template template;
public  RefArg_root_Template0(root_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setNewuser_(webdsl.generated.domain.User._static_cast_(obj));
return this;
}
public Object get(){
return template.getNewuser_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
}
