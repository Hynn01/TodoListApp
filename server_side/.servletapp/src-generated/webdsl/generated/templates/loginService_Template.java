package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class loginService_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"loginService":keyOverwrite,loginService_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(loginService_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "loginService";
}
public String getTemplateSignature(){
return "page loginService()";
}
public String getElementsContext(){
if(calledName==null){
return "loginService";
}
else {
return calledName;
}
}
private String result0_;
public String getResult0_(){
return result0_;
}
public void setResult0_(String result0_){
this.result0_=result0_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall6339011570","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{result0_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(result0) at unknown context");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
webdsl.generated.functions.mimetypeString_.mimetypeString_("application/json");
String body_=utils.InputStreamReader.readBody();
com.google.gson.JsonObject o_=utils.JSONType.parseJsonObject(body_);
String username_=utils.JSONType.getString(o_,"username");
String password_=(String)org.webdsl.tools.Utils.cast(utils.JSONType.getString(o_,"password"),String.class);
com.google.gson.JsonObject msg_=new com.google.gson.JsonObject();
if(webdsl.generated.functions.authenticateString_Secret_.authenticateString_Secret_(username_,password_)){
utils.JSONType.put(msg_,"message","ok");
}
else {
utils.JSONType.put(msg_,"message","failed");
}
result0_=utils.JSONType.toString(msg_);
}
protected void initializeLocalVars(){
result0_="";
}
}
