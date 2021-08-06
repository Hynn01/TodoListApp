package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList_ToDoItem_Template extends utils.TemplateServlet{
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
if(i==7){
java.util.ArrayList<webdsl.generated.domain.ToDoItem> elems1=new java.util.ArrayList<webdsl.generated.domain.ToDoItem>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("ToDoItem")){
elems1.add((webdsl.generated.domain.ToDoItem)ent);
}
}
}
}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList27String_String_String_String_Placeholder_String_ToDoList_ToDoItem_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList27String_String_String_String_Placeholder_String_ToDoList_ToDoItem_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList_ToDoItem":keyOverwrite,descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList_ToDoItem_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList_ToDoItem_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
descriptionString_String_Placeholder_ia00_=(String)args[0];
focusedListName_=(String)args[1];
focusedItemName_=(String)args[2];
ph_=(String)args[3];
newdescription_=(utils.RefArg)args[4];
tl_=(webdsl.generated.domain.ToDoList)args[5];
ti_=(webdsl.generated.domain.ToDoItem)args[6];
}
public String getUniqueName(){
return "descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList_ToDoItem";
}
public String getTemplateSignature(){
return "template descriptionString_String_Placeholder_s_ad0(descriptionString_String_Placeholder_ia00 : String, focusedListName : String, focusedItemName : String, ph : Placeholder, newdescription : ref String, tl : ToDoList, ti : ToDoItem)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String descriptionString_String_Placeholder_ia00_="";
private String focusedListName_="";
private String focusedItemName_="";
private String ph_="";
private utils.RefArg newdescription_=null;
private webdsl.generated.domain.ToDoList tl_=null;
private webdsl.generated.domain.ToDoItem ti_=null;
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if12996941490"+forelementcounter))==null){
if1=webdsl.generated.functions.gentemplatepredicate_description0String_String_Placeholder_.gentemplatepredicate_description0String_String_Placeholder_(focusedListName_,focusedItemName_,ph_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if12996941490"+forelementcounter,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if12996941491"+forelementcounter))==null){
if0=webdsl.generated.functions.genactionpredicate_description__0String_String_Placeholder_.genactionpredicate_description__0String_String_Placeholder_(focusedListName_,focusedItemName_,ph_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if12996941491"+forelementcounter,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall12996941490","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"descriptionString_String_Placeholder_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList27String_String_String_String_Placeholder_String_ToDoList_ToDoItem",getElementsContext(),new Object[]{descriptionString_String_Placeholder_ia00_,focusedListName_,focusedItemName_,ph_,newdescription_,tl_,ti_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"descriptionString_String_Placeholder_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
