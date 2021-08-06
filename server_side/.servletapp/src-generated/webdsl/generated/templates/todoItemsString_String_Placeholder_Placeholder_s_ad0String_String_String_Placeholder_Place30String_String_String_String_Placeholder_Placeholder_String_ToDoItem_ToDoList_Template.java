package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Place30String_String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==9){
java.util.ArrayList<webdsl.generated.domain.ToDoList> elems0=new java.util.ArrayList<webdsl.generated.domain.ToDoList>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("ToDoList")){
elems0.add((webdsl.generated.domain.ToDoList)ent);
}
}
}
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Place30String_String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList":keyOverwrite,todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Place30String_String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Place30String_String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
todoItemsString_String_Placeholder_Placeholder_ia05_=(String)args[0];
todoItemsString_String_Placeholder_Placeholder_ia00_=(String)args[1];
focusedListName_=(String)args[2];
focusedItemName_=(String)args[3];
ph_=(String)args[4];
ph3_=(String)args[5];
newusername_=(utils.RefArg)args[6];
newtditem_=(utils.RefArg)args[7];
tl_=(webdsl.generated.domain.ToDoList)args[8];
}
public String getUniqueName(){
return "todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Place30String_String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList";
}
public String getTemplateSignature(){
return "template todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Place30(todoItemsString_String_Placeholder_Placeholder_ia05 : String, todoItemsString_String_Placeholder_Placeholder_ia00 : String, focusedListName : String, focusedItemName : String, ph : Placeholder, ph3 : Placeholder, newusername : ref String, newtditem : ref ToDoItem, tl : ToDoList)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String todoItemsString_String_Placeholder_Placeholder_ia05_="";
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
switch(phase){case DATABIND_PHASE:ident=todoItemsString_String_Placeholder_Placeholder_ia05_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.todoItemsString_String_Placeholder_Placeholder_ia0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=todoItemsString_String_Placeholder_Placeholder_ia05_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.todoItemsString_String_Placeholder_Placeholder_ia0().run(threadLocalPageCached,getEnv(),getElementsContext(),tl_,(String)newusername_.get(),ph3_,ph_,focusedItemName_,focusedListName_,ident);
}
break;case RENDER_PHASE:if(isAjaxSubmitRequired(false)){
out.print("<button submitid=\""+todoItemsString_String_Placeholder_Placeholder_ia05_+"\" onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+todoItemsString_String_Placeholder_Placeholder_ia05_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'");
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
utils.RenderUtils.printPageString("share to user",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
else {
out.print("<button name=\""+todoItemsString_String_Placeholder_Placeholder_ia05_+"\"");
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
utils.RenderUtils.printPageString("share to user",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
break;}}
}
