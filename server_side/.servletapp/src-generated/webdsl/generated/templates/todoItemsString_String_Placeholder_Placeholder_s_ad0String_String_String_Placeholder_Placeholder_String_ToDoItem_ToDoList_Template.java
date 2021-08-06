package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==8){
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Place30String_String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Place30String_String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList":keyOverwrite,todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
todoItemsString_String_Placeholder_Placeholder_ia00_=(String)args[0];
focusedListName_=(String)args[1];
focusedItemName_=(String)args[2];
ph_=(String)args[3];
ph3_=(String)args[4];
newusername_=(utils.RefArg)args[5];
newtditem_=(utils.RefArg)args[6];
tl_=(webdsl.generated.domain.ToDoList)args[7];
}
public String getUniqueName(){
return "todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList";
}
public String getTemplateSignature(){
return "template todoItemsString_String_Placeholder_Placeholder_s_ad0(todoItemsString_String_Placeholder_Placeholder_ia00 : String, focusedListName : String, focusedItemName : String, ph : Placeholder, ph3 : Placeholder, newusername : ref String, newtditem : ref ToDoItem, tl : ToDoList)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String todoItemsString_String_Placeholder_Placeholder_ia00_="";
private String focusedListName_="";
private String focusedItemName_="";
private String ph_="";
private String ph3_="";
private utils.RefArg newusername_=null;
private utils.RefArg newtditem_=null;
private webdsl.generated.domain.ToDoList tl_=null;
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if5306480460"+forelementcounter))==null){
if1=webdsl.generated.functions.gentemplatepredicate_todoItems0String_String_Placeholder_Placeholder_.gentemplatepredicate_todoItems0String_String_Placeholder_Placeholder_(focusedListName_,focusedItemName_,ph_,ph3_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if5306480460"+forelementcounter,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if5306480461"+forelementcounter))==null){
if0=webdsl.generated.functions.genactionpredicate_todoItems__0String_String_Placeholder_Placeholder_.genactionpredicate_todoItems__0String_String_Placeholder_Placeholder_(focusedListName_,focusedItemName_,ph_,ph3_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if5306480461"+forelementcounter,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall5306480460","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"todoItemsString_String_Placeholder_Placeholder_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Place30String_String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList",getElementsContext(),new Object[]{todoItemsString_String_Placeholder_Placeholder_ia00_,focusedListName_,focusedItemName_,ph_,ph3_,newusername_,newtditem_,tl_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"todoItemsString_String_Placeholder_Placeholder_ia0\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
