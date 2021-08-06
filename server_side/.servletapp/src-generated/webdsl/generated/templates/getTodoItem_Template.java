package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class getTodoItem_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"getTodoItem":keyOverwrite,getTodoItem_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(getTodoItem_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "getTodoItem";
}
public String getTemplateSignature(){
return "page getTodoItem()";
}
public String getElementsContext(){
if(calledName==null){
return "getTodoItem";
}
else {
return calledName;
}
}
private String result7_;
public String getResult7_(){
return result7_;
}
public void setResult7_(String result7_){
this.result7_=result7_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall3185197090","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{result7_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(result7) at unknown context");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagepredicate_getTodoItem0_.genpagepredicate_getTodoItem0_()){
webdsl.generated.functions.mimetypeString_.mimetypeString_("application/json");
if(org.webdsl.tools.Utils.equal(utils.ThreadLocalPage.get().getRequest().getMethod(),"POST")){
String body_=utils.InputStreamReader.readBody();
com.google.gson.JsonObject o_=utils.JSONType.parseJsonObject(body_);
com.google.gson.JsonArray res_=new com.google.gson.JsonArray();
java.util.Collection<? extends webdsl.generated.domain.ToDoList> exp0=((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().getTodolists();
java.util.ArrayList<webdsl.generated.domain.ToDoList> lst0=new java.util.ArrayList<webdsl.generated.domain.ToDoList>(exp0);
int i1=-1;
for(webdsl.generated.domain.ToDoList tl_:lst0){
i1++;
if(org.webdsl.tools.Utils.equal(tl_.getName(),utils.JSONType.getString(o_,"tdlistname"))){
java.util.Collection<? extends webdsl.generated.domain.ToDoItem> exp1=tl_.getTodoitems();
java.util.ArrayList<webdsl.generated.domain.ToDoItem> lst1=new java.util.ArrayList<webdsl.generated.domain.ToDoItem>(exp1);
int i0=-1;
for(webdsl.generated.domain.ToDoItem tditem_:lst1){
i0++;
com.google.gson.JsonObject o2_=new com.google.gson.JsonObject();
utils.JSONType.put(o2_,"name",tditem_.getName());
utils.JSONType.put(o2_,"status",tditem_.getStatus());
utils.JSONType.put(o2_,"year",utils.DateType.getYear(tditem_.getDuedate()));
utils.JSONType.put(o2_,"month",utils.DateType.getMonth(tditem_.getDuedate()));
utils.JSONType.put(o2_,"day",utils.DateType.getDay(tditem_.getDuedate()));
utils.JSONType.put(res_,o2_);
}
}
else {}
}
result7_=utils.JSONType.toString(res_);
}
else {}
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVars(){
result7_="";
}
}
