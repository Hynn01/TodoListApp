package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class deleteTodoItem_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"deleteTodoItem":keyOverwrite,deleteTodoItem_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(deleteTodoItem_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "deleteTodoItem";
}
public String getTemplateSignature(){
return "page deleteTodoItem()";
}
public String getElementsContext(){
if(calledName==null){
return "deleteTodoItem";
}
else {
return calledName;
}
}
private String result8_;
public String getResult8_(){
return result8_;
}
public void setResult8_(String result8_){
this.result8_=result8_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_15247289200","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{result8_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(result8) at unknown context");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagepredicate_deleteTodoItem0_.genpagepredicate_deleteTodoItem0_()){
webdsl.generated.functions.mimetypeString_.mimetypeString_("application/json");
if(org.webdsl.tools.Utils.equal(utils.ThreadLocalPage.get().getRequest().getMethod(),"POST")){
String body_=utils.InputStreamReader.readBody();
com.google.gson.JsonObject o_=utils.JSONType.parseJsonObject(body_);
java.util.Collection<? extends webdsl.generated.domain.ToDoList> exp0=((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().getTodolists();
java.util.ArrayList<webdsl.generated.domain.ToDoList> lst0=new java.util.ArrayList<webdsl.generated.domain.ToDoList>(exp0);
int i1=-1;
for(webdsl.generated.domain.ToDoList tl_:lst0){
i1++;
if(org.webdsl.tools.Utils.equal(tl_.getName(),utils.JSONType.getString(o_,"tdlistname"))){
java.util.Collection<? extends webdsl.generated.domain.ToDoItem> exp1=tl_.getTodoitems();
java.util.ArrayList<webdsl.generated.domain.ToDoItem> lst1=new java.util.ArrayList<webdsl.generated.domain.ToDoItem>(exp1);
int i0=-1;
for(webdsl.generated.domain.ToDoItem ti_:lst1){
i0++;
if(org.webdsl.tools.Utils.equal(ti_.getName(),utils.JSONType.getString(o_,"tditemname"))){
tl_.removeFromTodoitems(ti_);
}
else {}
}
}
else {}
}
((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().save("User");
com.google.gson.JsonArray msgs_=new com.google.gson.JsonArray();
com.google.gson.JsonObject msg_=new com.google.gson.JsonObject();
utils.JSONType.put(msg_,"message","ok");
utils.JSONType.put(msgs_,msg_);
result8_=utils.JSONType.toString(msgs_);
}
else {}
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVars(){
result8_="";
}
}
