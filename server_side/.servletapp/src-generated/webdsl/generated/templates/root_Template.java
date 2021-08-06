package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class root_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.root_s_ad0String_User_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.inputSecret_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.inputString_Template.class,null,staticEnv)));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputString_1_rootpc0",RefArg_inputString_1_rootpc0.class);
refargclasses.put("RefArg_inputSecret_1_rootpc1",RefArg_inputSecret_1_rootpc1.class);
utils.AbstractPageServlet.loadRefArgClasses(inputString_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(inputSecret_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(root_s_ad0String_User_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"root":keyOverwrite,root_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(root_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "root";
}
public String getTemplateSignature(){
return "page root()";
}
public String getElementsContext(){
if(calledName==null){
return "root";
}
else {
return calledName;
}
}
private webdsl.generated.domain.User newuser_;
public webdsl.generated.domain.User getNewuser_(){
return newuser_;
}
public void setNewuser_(webdsl.generated.domain.User newuser_){
this.newuser_=newuser_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(RENDER_PHASE==phase){
out.print("<"+"div");
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
utils.TemplateCall.appendWithPadding(classattrs,"rootpage clearfix");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<"+"div");
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
out.print("<"+"h2");
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
utils.TemplateCall.appendWithPadding(classattrs,"nomargin center");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Welcome to ToDoList App",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</"+"h2"+">");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_820622870","login",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"login"),new org.webdsl.lang.Environment(env).putWithcall("elements#login",utils.TemplateCall.EmptyElementsCall),"login",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"login() at ToDoListApp.app:91/4");
}
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
utils.RenderUtils.printPageString("Registration",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</"+"h3"+">");
}
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementcounter:"")+("form_820622870"+getUniqueId());
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_820622872","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Username: "},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("inputString",utils.TemplateCall.SkipElementsMarker,new Object[]{new webdsl.generated.templates.RefArg_inputString_1_rootpc0(newuser_)},utils.TemplateCall.EmptyAttrs)),"labelString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Username: \") at ToDoListApp.app:96/5");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_820622875","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Password: "},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("inputSecret",utils.TemplateCall.SkipElementsMarker,new Object[]{new webdsl.generated.templates.RefArg_inputSecret_1_rootpc1(newuser_)},utils.TemplateCall.EmptyAttrs)),"labelString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Password: \") at ToDoListApp.app:97/5");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_820622878","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"root_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("root_s_ad0String_User",getElementsContext(),new Object[]{new webdsl.generated.templates.RefArg_root_Template0(root_Template.this)},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"root_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
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
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
}
protected void initializeLocalVars(){
newuser_=webdsl.generated.domain.User._static_createEmpty_();
}
}
