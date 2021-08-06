package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_inputSecret_1_rootpc1 extends utils.RefArg{
public webdsl.generated.domain.User newuser_;
public  RefArg_inputSecret_1_rootpc1(){}
public  RefArg_inputSecret_1_rootpc1(Object newuser_){
this.newuser_=(webdsl.generated.domain.User)newuser_;
}
public webdsl.generated.domain.User set(Object obj){
newuser_.setPassword((String)org.webdsl.tools.Utils.cast(obj,String.class));
return newuser_;
}
public Object get(){
return (String)newuser_.getPassword();
}
public void load(String uuid){
if(uuid.contains(":")){
newuser_=(webdsl.generated.domain.User)utils.PageParamLoad.loadEntityFromParam(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain",uuid);
}
else {
try{
Class<?> cl=org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.User");
newuser_=(webdsl.generated.domain.User)utils.HibernateUtil.getCurrentSession().load(cl,java.util.UUID.fromString(uuid));
}
catch(ClassNotFoundException cnfe){
throw new RuntimeException(cnfe);
}
}
}
public String getUrlString(){
return newuser_.getId()+"!"+"RefArg_inputSecret_1_rootpc1";
}
public String get_WebDslEntityType(){
if(get()==null){
return "Secret";
}
else {
return ((org.webdsl.WebDSLEntity)get()).get_WebDslEntityType();
}
}
public org.webdsl.WebDSLEntity getEntity(){
return newuser_;
}
public void validate(String location,java.util.List<utils.ValidationException> exceptions){
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
newuser_.validatePassword_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
exceptions.add(new utils.ValidationException(location,v.getMessage()));
}
}
public java.util.List<String> getValidationErrors(){
java.util.List<String> result=new java.util.ArrayList<String>();
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
newuser_.validatePassword_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
result.add(v.getMessage());
}
return result;
}
public org.webdsl.lang.ReflectionProperty getReflectionProperty(){
return utils.ThreadLocalServlet.get().getReflectionEntityByName("User").getPropertyByName("password");
}
public java.util.List<Object> getAllowed(){
return getReflectionProperty().getAllowed(newuser_);
}
}
