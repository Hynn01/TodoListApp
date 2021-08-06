package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class todoItemsString_String_Placeholder_Placeholder_s_ad2String_String_String_Placeholder_Place33String_String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_ToDoItem_Template extends utils.TemplateServlet{
private static String c$4(webdsl.generated.domain.ToDoItem ti__){
try{
Object v=ti__.getName();
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
private static String c$5(webdsl.generated.domain.ToDoItem ti__){
try{
Object v=ti__.getName();
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
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
if(i==10){
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
staticEnv.putTemplate(keyOverwrite==null?"todoItemsString_String_Placeholder_Placeholder_s_ad2String_String_String_Placeholder_Place33String_String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_ToDoItem":keyOverwrite,todoItemsString_String_Placeholder_Placeholder_s_ad2String_String_String_Placeholder_Place33String_String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_ToDoItem_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(todoItemsString_String_Placeholder_Placeholder_s_ad2String_String_String_Placeholder_Place33String_String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_ToDoItem_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
todoItemsString_String_Placeholder_Placeholder_ia35_=(String)args[0];
todoItemsString_String_Placeholder_Placeholder_ia30_=(String)args[1];
focusedListName_=(String)args[2];
focusedItemName_=(String)args[3];
ph_=(String)args[4];
ph3_=(String)args[5];
newusername_=(utils.RefArg)args[6];
newtditem_=(utils.RefArg)args[7];
tl_=(webdsl.generated.domain.ToDoList)args[8];
ti_=(webdsl.generated.domain.ToDoItem)args[9];
}
public String getUniqueName(){
return "todoItemsString_String_Placeholder_Placeholder_s_ad2String_String_String_Placeholder_Place33String_String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_ToDoItem";
}
public String getTemplateSignature(){
return "template todoItemsString_String_Placeholder_Placeholder_s_ad2String_String_String_Placeholder_Place33(todoItemsString_String_Placeholder_Placeholder_ia35 : String, todoItemsString_String_Placeholder_Placeholder_ia30 : String, focusedListName : String, focusedItemName : String, ph : Placeholder, ph3 : Placeholder, newusername : ref String, newtditem : ref ToDoItem, tl : ToDoList, ti : ToDoItem)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String todoItemsString_String_Placeholder_Placeholder_ia35_="";
private String todoItemsString_String_Placeholder_Placeholder_ia30_="";
private String focusedListName_="";
private String focusedItemName_="";
private String ph_="";
private String ph3_="";
private utils.RefArg newusername_=null;
private utils.RefArg newtditem_=null;
private webdsl.generated.domain.ToDoList tl_=null;
private webdsl.generated.domain.ToDoItem ti_=null;
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=todoItemsString_String_Placeholder_Placeholder_ia35_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.todoItemsString_String_Placeholder_Placeholder_ia3.isValidationDisabled();
}
break;case ACTION_PHASE:ident=todoItemsString_String_Placeholder_Placeholder_ia35_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.todoItemsString_String_Placeholder_Placeholder_ia3().run(threadLocalPageCached,getEnv(),getElementsContext(),ti_,tl_,ph3_,ph_,ph3_,ph_,focusedItemName_,focusedListName_,ident);
}
break;case RENDER_PHASE:out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
if(isAjaxSubmitRequired(false)){
out.print("onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+todoItemsString_String_Placeholder_Placeholder_ia35_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+todoItemsString_String_Placeholder_Placeholder_ia35_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
utils.RenderUtils.printPageString(""+"todoitem name: "+c$4(ti_),out,threadLocalPageCached.isRawoutput());
}
out.print("</a>");
}
else {
out.print("onclick='javascript:serverInvoke(\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams())+"?__action__link__=1"+threadLocalPageCached.getExtraQueryArguments("&")+"\",\""+todoItemsString_String_Placeholder_Placeholder_ia35_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+todoItemsString_String_Placeholder_Placeholder_ia35_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
utils.RenderUtils.printPageString(""+"todoitem name: "+c$5(ti_),out,threadLocalPageCached.isRawoutput());
}
out.print("</a>");
}
break;}}
}
