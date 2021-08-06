package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class getRDescription_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"getRDescription":keyOverwrite,getRDescription_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(getRDescription_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "getRDescription";
}
public String getTemplateSignature(){
return "page getRDescription()";
}
public String getElementsContext(){
if(calledName==null){
return "getRDescription";
}
else {
return calledName;
}
}
private String result12_;
public String getResult12_(){
return result12_;
}
public void setResult12_(String result12_){
this.result12_=result12_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall13260088140","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{result12_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(result12) at unknown context");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagepredicate_getRDescription0_.genpagepredicate_getRDescription0_()){
webdsl.generated.functions.mimetypeString_.mimetypeString_("application/json");
if(org.webdsl.tools.Utils.equal(utils.ThreadLocalPage.get().getRequest().getMethod(),"POST")){
String body_=utils.InputStreamReader.readBody();
com.google.gson.JsonObject o_=utils.JSONType.parseJsonObject(body_);
com.google.gson.JsonObject o2_=new com.google.gson.JsonObject();
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
utils.JSONType.put(o2_,"description",ti_.getDescription());
}
else {}
}
}
else {}
}
result12_=utils.JSONType.toString(o2_);
}
else {}
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVars(){
result12_="";
}
}
