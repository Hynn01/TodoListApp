package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class $Override$logout_s_ad0String_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"$Override$logout_s_ad0String":keyOverwrite,$Override$logout_s_ad0String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap($Override$logout_s_ad0String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
$Override$logout_logout10_=(String)args[0];
}
public String getUniqueName(){
return "$Override$logout_s_ad0String";
}
public String getTemplateSignature(){
return "template $Override$logout_s_ad0($Override$logout_logout10 : String)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String $Override$logout_logout10_="";
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=$Override$logout_logout10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.$Override$logout_logout0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=$Override$logout_logout10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.$Override$logout_logout0().run(threadLocalPageCached,getEnv(),getElementsContext(),ident);
}
break;case RENDER_PHASE:out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
if(isAjaxSubmitRequired(false)){
out.print("onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+$Override$logout_logout10_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+$Override$logout_logout10_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
utils.RenderUtils.printPageString("Log Out",out,threadLocalPageCached.isRawoutput());
}
out.print("</a>");
}
else {
out.print("onclick='javascript:serverInvoke(\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams())+"?__action__link__=1"+threadLocalPageCached.getExtraQueryArguments("&")+"\",\""+$Override$logout_logout10_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+$Override$logout_logout10_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
utils.RenderUtils.printPageString("Log Out",out,threadLocalPageCached.isRawoutput());
}
out.print("</a>");
}
break;}}
}
