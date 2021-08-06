package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class logoutService_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"logoutService":keyOverwrite,logoutService_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(logoutService_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "logoutService";
}
public String getTemplateSignature(){
return "page logoutService()";
}
public String getElementsContext(){
if(calledName==null){
return "logoutService";
}
else {
return calledName;
}
}
private String result1_;
public String getResult1_(){
return result1_;
}
public void setResult1_(String result1_){
this.result1_=result1_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall15769044070","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{result1_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(result1) at unknown context");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagepredicate_logoutService0_.genpagepredicate_logoutService0_()){
webdsl.generated.functions.mimetypeString_.mimetypeString_("application/json");
((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).setPrincipal(null);
com.google.gson.JsonObject msg_=new com.google.gson.JsonObject();
if(org.webdsl.tools.Utils.equal(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(),null)){
utils.JSONType.put(msg_,"message","ok");
}
else {
utils.JSONType.put(msg_,"message","failed");
}
result1_=utils.JSONType.toString(msg_);
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVars(){
result1_="";
}
}
