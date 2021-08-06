package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class $Override$login_s_ad0String_String_Secret_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"$Override$login_s_ad0String_String_Secret":keyOverwrite,$Override$login_s_ad0String_String_Secret_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap($Override$login_s_ad0String_String_Secret_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
$Override$login_login10_=(String)args[0];
username_=(utils.RefArg)args[1];
password_=(utils.RefArg)args[2];
}
public String getUniqueName(){
return "$Override$login_s_ad0String_String_Secret";
}
public String getTemplateSignature(){
return "template $Override$login_s_ad0($Override$login_login10 : String, username : ref String, password : ref Secret)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String $Override$login_login10_="";
private utils.RefArg username_=null;
private utils.RefArg password_=null;
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=$Override$login_login10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.$Override$login_login0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=$Override$login_login10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.$Override$login_login0().run(threadLocalPageCached,getEnv(),getElementsContext(),(String)password_.get(),(String)username_.get(),ident);
}
break;case RENDER_PHASE:if(isAjaxSubmitRequired(false)){
out.print("<button submitid=\""+$Override$login_login10_+"\" onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+$Override$login_login10_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'");
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
utils.RenderUtils.printPageString("Confirm",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
else {
out.print("<button name=\""+$Override$login_login10_+"\"");
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
utils.RenderUtils.printPageString("Confirm",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
break;}}
}
