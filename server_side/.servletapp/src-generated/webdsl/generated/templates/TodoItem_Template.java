package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class TodoItem_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"TodoItem":keyOverwrite,TodoItem_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(TodoItem_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
tdlistname_=(String)args[0];
}
public String getUniqueName(){
return "TodoItem";
}
public String getTemplateSignature(){
return "page TodoItem(tdlistname : String)";
}
public String getElementsContext(){
if(calledName==null){
return "TodoItem";
}
else {
return calledName;
}
}
private String tdlistname_="";
private String result6_;
public String getResult6_(){
return result6_;
}
public void setResult6_(String result6_){
this.result6_=result6_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall12835423420","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{result6_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(result6) at unknown context");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagepredicate_TodoItem0String_.genpagepredicate_TodoItem0String_(tdlistname_)){
webdsl.generated.functions.mimetypeString_.mimetypeString_("application/json");
if(org.webdsl.tools.Utils.equal(utils.ThreadLocalPage.get().getRequest().getMethod(),"POST")){
String body_=utils.InputStreamReader.readBody();
com.google.gson.JsonObject o_=utils.JSONType.parseJsonObject(body_);
webdsl.generated.domain.ToDoItem newtditem_=webdsl.generated.domain.ToDoItem._static_createEmpty_().ToDoItem$this_().setName(utils.JSONType.getString(o_,"tditemname")).setDuedate(utils.DateType.today()).setStatus(false).setDescription("");
java.util.Collection<? extends webdsl.generated.domain.ToDoList> exp0=((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().getTodolists();
java.util.ArrayList<webdsl.generated.domain.ToDoList> lst0=new java.util.ArrayList<webdsl.generated.domain.ToDoList>(exp0);
int i0=-1;
for(webdsl.generated.domain.ToDoList tl_:lst0){
i0++;
if(org.webdsl.tools.Utils.equal(tl_.getName(),utils.JSONType.getString(o_,"tdlistname"))){
tl_.addToTodoitems(newtditem_);
}
else {}
}
((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().save("User");
com.google.gson.JsonArray msgs_=new com.google.gson.JsonArray();
com.google.gson.JsonObject msg_=new com.google.gson.JsonObject();
utils.JSONType.put(msg_,"message","ok");
utils.JSONType.put(msgs_,msg_);
result6_=utils.JSONType.toString(msgs_);
}
else {}
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVars(){
result6_="";
}
}
