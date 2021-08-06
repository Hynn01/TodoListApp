package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad3String_UUID_Placeholder_Placeholder24String_String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template extends utils.TemplateServlet{
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
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad3String_UUID_Placeholder_Placeholder24String_String_UUID_Placeholder_Placeholder_Placeholder_ToDoList":keyOverwrite,todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad3String_UUID_Placeholder_Placeholder24String_String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad3String_UUID_Placeholder_Placeholder24String_String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
todoListsUUID_Placeholder_Placeholder_Placeholder_ia35_=(String)args[0];
todoListsUUID_Placeholder_Placeholder_Placeholder_ia30_=(String)args[1];
focusedListId_=(java.util.UUID)args[2];
ph_=(String)args[3];
ph2_=(String)args[4];
ph3_=(String)args[5];
tl_=(webdsl.generated.domain.ToDoList)args[6];
}
public String getUniqueName(){
return "todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad3String_UUID_Placeholder_Placeholder24String_String_UUID_Placeholder_Placeholder_Placeholder_ToDoList";
}
public String getTemplateSignature(){
return "template todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad3String_UUID_Placeholder_Placeholder24(todoListsUUID_Placeholder_Placeholder_Placeholder_ia35 : String, todoListsUUID_Placeholder_Placeholder_Placeholder_ia30 : String, focusedListId : UUID, ph : Placeholder, ph2 : Placeholder, ph3 : Placeholder, tl : ToDoList)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String todoListsUUID_Placeholder_Placeholder_Placeholder_ia35_="";
private String todoListsUUID_Placeholder_Placeholder_Placeholder_ia30_="";
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
switch(phase){case DATABIND_PHASE:ident=todoListsUUID_Placeholder_Placeholder_Placeholder_ia35_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.todoListsUUID_Placeholder_Placeholder_Placeholder_ia3.isValidationDisabled();
}
break;case ACTION_PHASE:ident=todoListsUUID_Placeholder_Placeholder_Placeholder_ia35_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.todoListsUUID_Placeholder_Placeholder_Placeholder_ia3().run(threadLocalPageCached,getEnv(),getElementsContext(),tl_,ph3_,ph2_,ph_,focusedListId_,ident);
}
break;case RENDER_PHASE:out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
if(isAjaxSubmitRequired(false)){
out.print("onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+todoListsUUID_Placeholder_Placeholder_Placeholder_ia35_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+todoListsUUID_Placeholder_Placeholder_Placeholder_ia35_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
if(!ignorecols.contains("submitlink")){
AttributeCollectionLookup.getAttributeCollection("submitlink",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("delete",out,threadLocalPageCached.isRawoutput());
}
out.print("</a>");
}
else {
out.print("onclick='javascript:serverInvoke(\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams())+"?__action__link__=1"+threadLocalPageCached.getExtraQueryArguments("&")+"\",\""+todoListsUUID_Placeholder_Placeholder_Placeholder_ia35_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+todoListsUUID_Placeholder_Placeholder_Placeholder_ia35_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
if(!ignorecols.contains("submitlink")){
AttributeCollectionLookup.getAttributeCollection("submitlink",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("delete",out,threadLocalPageCached.isRawoutput());
}
out.print("</a>");
}
break;}}
}
