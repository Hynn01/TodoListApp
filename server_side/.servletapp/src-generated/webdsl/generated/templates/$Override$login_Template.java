package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class $Override$login_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.$Override$login_s_ad0String_String_Secret_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.inputSecret_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.inputString_Template.class,null,staticEnv)));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(inputString_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(inputSecret_Template.class);
utils.AbstractPageServlet.loadRefArgClasses($Override$login_s_ad0String_String_Secret_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"login":keyOverwrite,$Override$login_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap($Override$login_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "login";
}
public String getTemplateSignature(){
return "template login()";
}
public String getElementsContext(){
if(calledName==null){
return "login";
}
else {
return calledName;
}
}
private String username_;
public String getUsername_(){
return username_;
}
public void setUsername_(String username_){
this.username_=username_;
}
private String password_;
public String getPassword_(){
return password_;
}
public void setPassword_(String password_){
this.password_=password_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(RENDER_PHASE==phase){
out.print("<"+"h3");
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
utils.TemplateCall.appendWithPadding(classattrs,"center");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Login",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</"+"h3"+">");
}
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementcounter:"")+("form8287239690"+getUniqueId());
threadLocalPageCached.setFormIdent(ident);
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.setInSubmittedForm(true);
threadLocalPageCached.submittedFormId=ident;
}
java.io.StringWriter sw1=null;
java.io.StringWriter sw0=null;
if(RENDER_PHASE==phase){
threadLocalPageCached.formRequiresMultipartEnc=false;
if(threadLocalPageCached.inSubmittedForm()&&threadLocalPageCached.isValidationFormRerender()){
sw1=new java.io.StringWriter();
out=new java.io.PrintWriter(sw1);
utils.ThreadLocalOut.push(out);
}
out.print("<form name=\""+ident+"\" id=\""+ident+"\" action=\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams()+threadLocalPageCached.getExtraQueryArguments("?"))+"\" accept-charset=\"UTF-8\" method=\"POST\"");
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
utils.TemplateCall.appendWithPadding(classattrs,"center");
if(!ignorecols.contains("form")){
AttributeCollectionLookup.getAttributeCollection("form",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
sw0=new java.io.StringWriter();
out=new java.io.PrintWriter(sw0);
utils.ThreadLocalOut.push(out);
out.print(">");
out.print("<input type=\"hidden\" name=\""+ident+"\" value=\"1\" />");
out.print(threadLocalPageCached.getHiddenParams());
}
if(RENDER_PHASE==phase||threadLocalPageCached.inSubmittedForm()){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall8287239690","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Username: "},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("inputString",utils.TemplateCall.SkipElementsMarker,new Object[]{new webdsl.generated.templates.RefArg_$Override$login_Template0($Override$login_Template.this)},utils.TemplateCall.EmptyAttrs)),"labelString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Username: \") at ToDoListApp.app:60/6");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall8287239693","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Password: "},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("inputSecret",utils.TemplateCall.SkipElementsMarker,new Object[]{new webdsl.generated.templates.RefArg_$Override$login_Template1($Override$login_Template.this)},utils.TemplateCall.EmptyAttrs)),"labelString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Password: \") at ToDoListApp.app:61/6");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall8287239696","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"$Override$login_login1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("$Override$login_s_ad0String_String_Secret",getElementsContext(),new Object[]{new webdsl.generated.templates.RefArg_$Override$login_Template0($Override$login_Template.this),new webdsl.generated.templates.RefArg_$Override$login_Template1($Override$login_Template.this)},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"$Override$login_login1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
if(RENDER_PHASE==phase){
out.print("</form>");
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
if(threadLocalPageCached.formRequiresMultipartEnc){
out.write(" enctype=\"multipart/form-data\"");
}
out.write(sw0.toString());
if(threadLocalPageCached.inSubmittedForm()&&threadLocalPageCached.isValidationFormRerender()){
utils.ThreadLocalOut.pop();
if(threadLocalPageCached.submittedFormContent==null){
threadLocalPageCached.submittedFormContent=sw1.toString();
}
else {
out=utils.ThreadLocalOut.peek();
out.write(threadLocalPageCached.submittedFormContent);
}
}
threadLocalPageCached.formRequiresMultipartEnc=false;
}
threadLocalPageCached.setInSubmittedForm(false);
threadLocalPageCached.setFormIdent("");
threadLocalPageCached.leaveForm();
}
protected void initializeLocalVars(){
username_="";
password_="";
}
}
