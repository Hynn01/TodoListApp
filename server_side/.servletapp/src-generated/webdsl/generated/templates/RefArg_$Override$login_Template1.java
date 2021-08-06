package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_$Override$login_Template1 extends utils.RefArg{
public $Override$login_Template template;
public  RefArg_$Override$login_Template1($Override$login_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setPassword_((String)org.webdsl.tools.Utils.cast(obj,String.class));
return this;
}
public Object get(){
return template.getPassword_();
}
}
