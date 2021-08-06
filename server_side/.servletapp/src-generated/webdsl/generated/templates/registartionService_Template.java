package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class registartionService_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"registartionService":keyOverwrite,registartionService_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(registartionService_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "registartionService";
}
public String getTemplateSignature(){
return "page registartionService()";
}
public String getElementsContext(){
if(calledName==null){
return "registartionService";
}
else {
return calledName;
}
}
private String result2_;
public String getResult2_(){
return result2_;
}
public void setResult2_(String result2_){
this.result2_=result2_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_10048467650","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{result2_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(result2) at unknown context");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
webdsl.generated.functions.mimetypeString_.mimetypeString_("application/json");
String body_=utils.InputStreamReader.readBody();
com.google.gson.JsonObject o_=utils.JSONType.parseJsonObject(body_);
webdsl.generated.domain.User._static_createEmpty_().User$this_().setUsername(utils.JSONType.getString(o_,"username")).setPassword(org.webdsl.tools.Utils.secretDigest((String)org.webdsl.tools.Utils.cast(utils.JSONType.getString(o_,"password"),String.class))).save("User");
com.google.gson.JsonObject msg_=new com.google.gson.JsonObject();
utils.JSONType.put(msg_,"message","ok");
result2_=utils.JSONType.toString(msg_);
}
protected void initializeLocalVars(){
result2_="";
}
}
