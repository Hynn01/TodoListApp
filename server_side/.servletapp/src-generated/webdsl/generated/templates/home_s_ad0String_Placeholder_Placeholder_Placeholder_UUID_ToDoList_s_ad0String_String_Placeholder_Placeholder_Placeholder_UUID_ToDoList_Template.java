package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_s_ad0String_String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_s_ad0String_String_Placeholder_Placeholder_Placeholder_UUID_ToDoList":keyOverwrite,home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_s_ad0String_String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_s_ad0String_String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
home_ia05_=(String)args[0];
home_ia00_=(String)args[1];
ph3_=(String)args[2];
ph2_=(String)args[3];
ph_=(String)args[4];
newlid_=(utils.RefArg)args[5];
newtdlist_=(utils.RefArg)args[6];
}
public String getUniqueName(){
return "home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_s_ad0String_String_Placeholder_Placeholder_Placeholder_UUID_ToDoList";
}
public String getTemplateSignature(){
return "template home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_s_ad0(home_ia05 : String, home_ia00 : String, ph3 : Placeholder, ph2 : Placeholder, ph : Placeholder, newlid : ref UUID, newtdlist : ref ToDoList)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String home_ia05_="";
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
switch(phase){case DATABIND_PHASE:ident=home_ia05_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.home_ia0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=home_ia05_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.home_ia0().run(threadLocalPageCached,getEnv(),getElementsContext(),(webdsl.generated.domain.ToDoList)newtdlist_.get(),ident);
}
break;case RENDER_PHASE:if(isAjaxSubmitRequired(false)){
out.print("<button submitid=\""+home_ia05_+"\" onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+home_ia05_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'");
{
StringBuilder classattrs=new StringBuilder();
StringBuilder styleattrs=new StringBuilder();
java.util.List<String> ignore=new java.util.ArrayList<String>();
java.util.List<String> ignorecols=new java.util.ArrayList<String>();
utils.TemplateCall.getDynamicIgnoredAttributes(attrs,ignore);
for(String attrcolname:utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs)){
if(!ignorecols.contains(attrcolname)){
AttributeCollectionLookup.getAttributeCollection(attrcolname,classattrs,styleattrs,ignore,ignorecols,out);
}
}
utils.TemplateCall.appendWithPadding(classattrs,"col-sm");
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("add",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
else {
out.print("<button name=\""+home_ia05_+"\"");
{
StringBuilder classattrs=new StringBuilder();
StringBuilder styleattrs=new StringBuilder();
java.util.List<String> ignore=new java.util.ArrayList<String>();
java.util.List<String> ignorecols=new java.util.ArrayList<String>();
utils.TemplateCall.getDynamicIgnoredAttributes(attrs,ignore);
for(String attrcolname:utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs)){
if(!ignorecols.contains(attrcolname)){
AttributeCollectionLookup.getAttributeCollection(attrcolname,classattrs,styleattrs,ignore,ignorecols,out);
}
}
utils.TemplateCall.appendWithPadding(classattrs,"col-sm");
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("add",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
break;}}
}
