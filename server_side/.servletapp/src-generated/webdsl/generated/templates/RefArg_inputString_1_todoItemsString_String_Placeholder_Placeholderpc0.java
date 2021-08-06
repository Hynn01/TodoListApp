package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_inputString_1_todoItemsString_String_Placeholder_Placeholderpc0 extends utils.RefArg{
public webdsl.generated.domain.ToDoItem newtditem_;
public  RefArg_inputString_1_todoItemsString_String_Placeholder_Placeholderpc0(){}
public  RefArg_inputString_1_todoItemsString_String_Placeholder_Placeholderpc0(Object newtditem_){
this.newtditem_=(webdsl.generated.domain.ToDoItem)newtditem_;
}
public webdsl.generated.domain.ToDoItem set(Object obj){
newtditem_.setName((String)org.webdsl.tools.Utils.cast(obj,String.class));
return newtditem_;
}
public Object get(){
return (String)newtditem_.getName();
}
public void load(String uuid){
if(uuid.contains(":")){
newtditem_=(webdsl.generated.domain.ToDoItem)utils.PageParamLoad.loadEntityFromParam(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain",uuid);
}
else {
try{
Class<?> cl=org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.ToDoItem");
newtditem_=(webdsl.generated.domain.ToDoItem)utils.HibernateUtil.getCurrentSession().load(cl,java.util.UUID.fromString(uuid));
}
catch(ClassNotFoundException cnfe){
throw new RuntimeException(cnfe);
}
}
}
public String getUrlString(){
return newtditem_.getId()+"!"+"RefArg_inputString_1_todoItemsString_String_Placeholder_Placeholderpc0";
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
return newtditem_;
}
public void validate(String location,java.util.List<utils.ValidationException> exceptions){
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
newtditem_.validateName_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
exceptions.add(new utils.ValidationException(location,v.getMessage()));
}
}
public java.util.List<String> getValidationErrors(){
java.util.List<String> result=new java.util.ArrayList<String>();
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
newtditem_.validateName_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
result.add(v.getMessage());
}
return result;
}
public org.webdsl.lang.ReflectionProperty getReflectionProperty(){
return utils.ThreadLocalServlet.get().getReflectionEntityByName("ToDoItem").getPropertyByName("name");
}
public java.util.List<Object> getAllowed(){
return getReflectionProperty().getAllowed(newtditem_);
}
}
