package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class deleteTodoList_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"deleteTodoList":keyOverwrite,deleteTodoList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(deleteTodoList_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "deleteTodoList";
}
public String getTemplateSignature(){
return "page deleteTodoList()";
}
public String getElementsContext(){
if(calledName==null){
return "deleteTodoList";
}
else {
return calledName;
}
}
private String result5_;
public String getResult5_(){
return result5_;
}
public void setResult5_(String result5_){
this.result5_=result5_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_13287210620","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{result5_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(result5) at unknown context");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagepredicate_deleteTodoList0_.genpagepredicate_deleteTodoList0_()){
webdsl.generated.functions.mimetypeString_.mimetypeString_("application/json");
if(org.webdsl.tools.Utils.equal(utils.ThreadLocalPage.get().getRequest().getMethod(),"POST")){
String body_=utils.InputStreamReader.readBody();
com.google.gson.JsonObject o_=utils.JSONType.parseJsonObject(body_);
java.util.Collection<? extends webdsl.generated.domain.ToDoList> exp0=((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().getTodolists();
java.util.ArrayList<webdsl.generated.domain.ToDoList> lst0=new java.util.ArrayList<webdsl.generated.domain.ToDoList>(exp0);
int i0=-1;
for(webdsl.generated.domain.ToDoList tl_:lst0){
i0++;
if(org.webdsl.tools.Utils.equal(tl_.getName(),utils.JSONType.getString(o_,"tdlistname"))){
((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().removeFromTodolists(tl_);
}
else {}
}
((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().save("User");
com.google.gson.JsonArray msgs_=new com.google.gson.JsonArray();
com.google.gson.JsonObject msg_=new com.google.gson.JsonObject();
utils.JSONType.put(msg_,"message","ok");
utils.JSONType.put(msgs_,msg_);
result5_=utils.JSONType.toString(msgs_);
}
else {}
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVars(){
result5_="";
}
}
