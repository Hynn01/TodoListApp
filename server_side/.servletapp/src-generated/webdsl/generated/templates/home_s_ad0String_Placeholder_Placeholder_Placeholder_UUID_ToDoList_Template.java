package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_s_ad0String_String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_s_ad0String_String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList":keyOverwrite,home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
home_ia00_=(String)args[0];
ph3_=(String)args[1];
ph2_=(String)args[2];
ph_=(String)args[3];
newlid_=(utils.RefArg)args[4];
newtdlist_=(utils.RefArg)args[5];
}
public String getUniqueName(){
return "home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList";
}
public String getTemplateSignature(){
return "template home_s_ad0(home_ia00 : String, ph3 : Placeholder, ph2 : Placeholder, ph : Placeholder, newlid : ref UUID, newtdlist : ref ToDoList)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String home_ia00_="";
private String ph3_="";
private String ph2_="";
private String ph_="";
private utils.RefArg newlid_=null;
private utils.RefArg newtdlist_=null;
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_7518501880"+forelementcounter))==null){
if1=webdsl.generated.functions.genpagepredicate_home0_.genpagepredicate_home0_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_7518501880"+forelementcounter,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_7518501881"+forelementcounter))==null){
if0=webdsl.generated.functions.genactionpredicate_home__0_.genactionpredicate_home__0_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_7518501881"+forelementcounter,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_7518501880","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"home_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_s_ad0String_String_Placeholder_Placeholder_Placeholder_UUID_ToDoList",getElementsContext(),new Object[]{home_ia00_,ph3_,ph2_,ph_,newlid_,newtdlist_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"home_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
