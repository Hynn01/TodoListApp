package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class RDescription_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"RDescription":keyOverwrite,RDescription_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(RDescription_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
tdlistname_=(String)args[0];
tditemname_=(String)args[1];
}
public String getUniqueName(){
return "RDescription";
}
public String getTemplateSignature(){
return "page RDescription(tdlistname : String, tditemname : String)";
}
public String getElementsContext(){
if(calledName==null){
return "RDescription";
}
else {
return calledName;
}
}
private String tdlistname_="";
private String tditemname_="";
private String result11_;
public String getResult11_(){
return result11_;
}
public void setResult11_(String result11_){
this.result11_=result11_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall17958689780","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{result11_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(result11) at unknown context");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagepredicate_RDescription0String_String_.genpagepredicate_RDescription0String_String_(tdlistname_,tditemname_)){
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
ti_.setDescription(utils.JSONType.getString(o_,"description"));
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
result11_=utils.JSONType.toString(msgs_);
}
else {}
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVars(){
result11_="";
}
}
