package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad1String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==6){
java.util.ArrayList<webdsl.generated.domain.ToDoList> elems0=new java.util.ArrayList<webdsl.generated.domain.ToDoList>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("ToDoList")){
elems0.add((webdsl.generated.domain.ToDoList)ent);
}
}
}
}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad1String_UUID_Placeholder_Placeholder24String_String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad1String_UUID_Placeholder_Placeholder24String_String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad1String_UUID_Placeholder_Placeholder_Placeholder_ToDoList":keyOverwrite,todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad1String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad1String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
todoListsUUID_Placeholder_Placeholder_Placeholder_ia10_=(String)args[0];
focusedListId_=(java.util.UUID)args[1];
ph_=(String)args[2];
ph2_=(String)args[3];
ph3_=(String)args[4];
tl_=(webdsl.generated.domain.ToDoList)args[5];
}
public String getUniqueName(){
return "todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad1String_UUID_Placeholder_Placeholder_Placeholder_ToDoList";
}
public String getTemplateSignature(){
return "template todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad1(todoListsUUID_Placeholder_Placeholder_Placeholder_ia10 : String, focusedListId : UUID, ph : Placeholder, ph2 : Placeholder, ph3 : Placeholder, tl : ToDoList)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String todoListsUUID_Placeholder_Placeholder_Placeholder_ia10_="";
private java.util.UUID focusedListId_=null;
private String ph_="";
private String ph2_="";
private String ph3_="";
private webdsl.generated.domain.ToDoList tl_=null;
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_4633050320"+forelementcounter))==null){
if1=webdsl.generated.functions.gentemplatepredicate_todoLists0UUID_Placeholder_Placeholder_Placeholder_.gentemplatepredicate_todoLists0UUID_Placeholder_Placeholder_Placeholder_(focusedListId_,ph_,ph2_,ph3_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_4633050320"+forelementcounter,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_4633050321"+forelementcounter))==null){
if0=webdsl.generated.functions.genactionpredicate_todoLists__0UUID_Placeholder_Placeholder_Placeholder_.genactionpredicate_todoLists__0UUID_Placeholder_Placeholder_Placeholder_(focusedListId_,ph_,ph2_,ph3_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_4633050321"+forelementcounter,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_4633050320","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"todoListsUUID_Placeholder_Placeholder_Placeholder_ia1_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad1String_UUID_Placeholder_Placeholder24String_String_UUID_Placeholder_Placeholder_Placeholder_ToDoList",getElementsContext(),new Object[]{todoListsUUID_Placeholder_Placeholder_Placeholder_ia10_,focusedListId_,ph_,ph2_,ph3_,tl_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"todoListsUUID_Placeholder_Placeholder_Placeholder_ia1\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
