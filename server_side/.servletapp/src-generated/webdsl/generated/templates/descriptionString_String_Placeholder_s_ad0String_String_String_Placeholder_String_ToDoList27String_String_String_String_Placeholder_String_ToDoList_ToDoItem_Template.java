package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList27String_String_String_String_Placeholder_String_ToDoList_ToDoItem_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==7){
java.util.ArrayList<webdsl.generated.domain.ToDoList> elems0=new java.util.ArrayList<webdsl.generated.domain.ToDoList>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("ToDoList")){
elems0.add((webdsl.generated.domain.ToDoList)ent);
}
}
}
if(i==8){
java.util.ArrayList<webdsl.generated.domain.ToDoItem> elems1=new java.util.ArrayList<webdsl.generated.domain.ToDoItem>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("ToDoItem")){
elems1.add((webdsl.generated.domain.ToDoItem)ent);
}
}
}
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList27String_String_String_String_Placeholder_String_ToDoList_ToDoItem":keyOverwrite,descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList27String_String_String_String_Placeholder_String_ToDoList_ToDoItem_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList27String_String_String_String_Placeholder_String_ToDoList_ToDoItem_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
descriptionString_String_Placeholder_ia05_=(String)args[0];
descriptionString_String_Placeholder_ia00_=(String)args[1];
focusedListName_=(String)args[2];
focusedItemName_=(String)args[3];
ph_=(String)args[4];
newdescription_=(utils.RefArg)args[5];
tl_=(webdsl.generated.domain.ToDoList)args[6];
ti_=(webdsl.generated.domain.ToDoItem)args[7];
}
public String getUniqueName(){
return "descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList27String_String_String_String_Placeholder_String_ToDoList_ToDoItem";
}
public String getTemplateSignature(){
return "template descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList27(descriptionString_String_Placeholder_ia05 : String, descriptionString_String_Placeholder_ia00 : String, focusedListName : String, focusedItemName : String, ph : Placeholder, newdescription : ref String, tl : ToDoList, ti : ToDoItem)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String descriptionString_String_Placeholder_ia05_="";
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
switch(phase){case DATABIND_PHASE:ident=descriptionString_String_Placeholder_ia05_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.descriptionString_String_Placeholder_ia0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=descriptionString_String_Placeholder_ia05_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.descriptionString_String_Placeholder_ia0().run(threadLocalPageCached,getEnv(),getElementsContext(),ti_,(String)newdescription_.get(),ph_,focusedItemName_,focusedListName_,ident);
}
break;case RENDER_PHASE:if(isAjaxSubmitRequired(false)){
out.print("<button submitid=\""+descriptionString_String_Placeholder_ia05_+"\" onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+descriptionString_String_Placeholder_ia05_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'");
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
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("edit the description",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
else {
out.print("<button name=\""+descriptionString_String_Placeholder_ia05_+"\"");
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
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("edit the description",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
break;}}
}
