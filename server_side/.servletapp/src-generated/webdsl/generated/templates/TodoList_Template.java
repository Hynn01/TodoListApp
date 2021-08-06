package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class TodoList_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"TodoList":keyOverwrite,TodoList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(TodoList_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "TodoList";
}
public String getTemplateSignature(){
return "page TodoList()";
}
public String getElementsContext(){
if(calledName==null){
return "TodoList";
}
else {
return calledName;
}
}
private String result4_;
public String getResult4_(){
return result4_;
}
public void setResult4_(String result4_){
this.result4_=result4_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall14795502000","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{result4_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(result4) at unknown context");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagepredicate_TodoList0_.genpagepredicate_TodoList0_()){
webdsl.generated.functions.mimetypeString_.mimetypeString_("application/json");
if(org.webdsl.tools.Utils.equal(utils.ThreadLocalPage.get().getRequest().getMethod(),"POST")){
String body_=utils.InputStreamReader.readBody();
com.google.gson.JsonObject o_=utils.JSONType.parseJsonObject(body_);
webdsl.generated.domain.ToDoList newtdlist_=webdsl.generated.domain.ToDoList._static_createEmpty_().ToDoList$this_().setName(utils.JSONType.getString(o_,"name")).setAuthor(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().addToTodolists(newtdlist_);
((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().save("User");
com.google.gson.JsonArray msgs_=new com.google.gson.JsonArray();
com.google.gson.JsonObject msg_=new com.google.gson.JsonObject();
utils.JSONType.put(msg_,"message","ok");
utils.JSONType.put(msgs_,msg_);
result4_=utils.JSONType.toString(msgs_);
}
else {}
if(org.webdsl.tools.Utils.equal(utils.ThreadLocalPage.get().getRequest().getMethod(),"GET")){
com.google.gson.JsonArray a_=new com.google.gson.JsonArray();
java.util.Collection<? extends webdsl.generated.domain.ToDoList> exp0=((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().getTodolists();
java.util.ArrayList<webdsl.generated.domain.ToDoList> lst0=new java.util.ArrayList<webdsl.generated.domain.ToDoList>(exp0);
int i0=-1;
for(webdsl.generated.domain.ToDoList tdlist_:lst0){
i0++;
com.google.gson.JsonObject o_=new com.google.gson.JsonObject();
utils.JSONType.put(o_,"name",tdlist_.getName());
utils.JSONType.put(a_,o_);
}
result4_=utils.JSONType.toString(a_);
}
else {}
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVars(){
result4_="";
}
}
