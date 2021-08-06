package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_inputString_1_homepc0 extends utils.RefArg{
public webdsl.generated.domain.ToDoList newtdlist_;
public  RefArg_inputString_1_homepc0(){}
public  RefArg_inputString_1_homepc0(Object newtdlist_){
this.newtdlist_=(webdsl.generated.domain.ToDoList)newtdlist_;
}
public webdsl.generated.domain.ToDoList set(Object obj){
newtdlist_.setName((String)org.webdsl.tools.Utils.cast(obj,String.class));
return newtdlist_;
}
public Object get(){
return (String)newtdlist_.getName();
}
public void load(String uuid){
if(uuid.contains(":")){
newtdlist_=(webdsl.generated.domain.ToDoList)utils.PageParamLoad.loadEntityFromParam(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain",uuid);
}
else {
try{
Class<?> cl=org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.ToDoList");
newtdlist_=(webdsl.generated.domain.ToDoList)utils.HibernateUtil.getCurrentSession().load(cl,java.util.UUID.fromString(uuid));
}
catch(ClassNotFoundException cnfe){
throw new RuntimeException(cnfe);
}
}
}
public String getUrlString(){
return newtdlist_.getId()+"!"+"RefArg_inputString_1_homepc0";
}
public String get_WebDslEntityType(){
if(get()==null){
return "String";
}
else {
return ((org.webdsl.WebDSLEntity)get()).get_WebDslEntityType();
}
}
public org.webdsl.WebDSLEntity getEntity(){
return newtdlist_;
}
public void validate(String location,java.util.List<utils.ValidationException> exceptions){
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
newtdlist_.validateName_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
exceptions.add(new utils.ValidationException(location,v.getMessage()));
}
}
public java.util.List<String> getValidationErrors(){
java.util.List<String> result=new java.util.ArrayList<String>();
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
newtdlist_.validateName_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
result.add(v.getMessage());
}
return result;
}
public org.webdsl.lang.ReflectionProperty getReflectionProperty(){
return utils.ThreadLocalServlet.get().getReflectionEntityByName("ToDoList").getPropertyByName("name");
}
public java.util.List<Object> getAllowed(){
return getReflectionProperty().getAllowed(newtdlist_);
}
}
