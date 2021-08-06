package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_home_Template0 extends utils.RefArg{
public home_Template template;
public  RefArg_home_Template0(home_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setNewlid_((java.util.UUID)org.webdsl.tools.Utils.cast(obj,java.util.UUID.class));
return this;
}
public Object get(){
return template.getNewlid_();
}
}
