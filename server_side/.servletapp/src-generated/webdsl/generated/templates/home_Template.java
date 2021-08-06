package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class home_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputString_1_homepc0",RefArg_inputString_1_homepc0.class);
utils.AbstractPageServlet.loadRefArgClasses(home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"home":keyOverwrite,home_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(home_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "home";
}
public String getTemplateSignature(){
return "page home()";
}
public String getElementsContext(){
if(calledName==null){
return "home";
}
else {
return calledName;
}
}
private String ph3_=null;
public String getPh3_(){
return ph3_;
}
public void setPh3_(String ph3_){
this.ph3_=ph3_;
}
private String ph2_=null;
public String getPh2_(){
return ph2_;
}
public void setPh2_(String ph2_){
this.ph2_=ph2_;
}
private String ph_=null;
public String getPh_(){
return ph_;
}
public void setPh_(String ph_){
this.ph_=ph_;
}
private java.util.UUID newlid_;
public java.util.UUID getNewlid_(){
return newlid_;
}
public void setNewlid_(java.util.UUID newlid_){
this.newlid_=newlid_;
}
private webdsl.generated.domain.ToDoList newtdlist_;
public webdsl.generated.domain.ToDoList getNewtdlist_(){
return newtdlist_;
}
public void setNewtdlist_(webdsl.generated.domain.ToDoList newtdlist_){
this.newtdlist_=newtdlist_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_8191342030","bootstrap",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"bootstrap"),new org.webdsl.lang.Environment(env).putWithcall("elements#bootstrap",utils.TemplateCall.EmptyElementsCall),"bootstrap",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"bootstrap() at ToDoListApp.app:269/3");
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
utils.TemplateCall.appendWithPadding(classattrs,"container-fluid");
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
utils.TemplateCall.appendWithPadding(classattrs,"row page");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-sm-3 col-left col-border");
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
utils.TemplateCall.appendWithPadding(classattrs,"row");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-sm");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_8191342032","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Username: "+((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().getUsername()},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(\"Username: \" + session.securityContext.principal.username) at ToDoListApp.app:281/7");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-sm");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_8191342034","logout",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"logout"),new org.webdsl.lang.Environment(env).putWithcall("elements#logout",utils.TemplateCall.EmptyElementsCall),"logout",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"logout() at ToDoListApp.app:284/7");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
utils.TemplateCall.appendWithPadding(classattrs,"row title");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("To Do Lists",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementcounter:"")+("form_8191342030"+getUniqueId());
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
utils.TemplateCall.appendWithPadding(classattrs,"row");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control col-sm");
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_8191342036","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputString_1_homepc0(newtdlist_)},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(newtdlist.name) at ToDoListApp.app:293/6");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_8191342038","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"home_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("home_s_ad0String_Placeholder_Placeholder_Placeholder_UUID_ToDoList",getElementsContext(),new Object[]{ph3_,ph2_,ph_,new webdsl.generated.templates.RefArg_home_Template0(home_Template.this),new webdsl.generated.templates.RefArg_home_Template1(home_Template.this)},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"home_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
java.io.StringWriter tmpstringwriter0=null;
if(RENDER_PHASE==phase){
out.print("<"+"div"+" id=\""+utils.URLFilter.filter(""+ph_)+"\" class=\"webdsl-placeholder\">");
tmpstringwriter0=new java.io.StringWriter();
out=new java.io.PrintWriter(tmpstringwriter0);
utils.ThreadLocalOut.push(out);
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_81913420311","todoListsUUID_Placeholder_Placeholder_Placeholder",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{newlid_,ph_,ph2_,ph3_},"todoListsUUID_Placeholder_Placeholder_Placeholder"),new org.webdsl.lang.Environment(env).putWithcall("elements#todoListsUUID_Placeholder_Placeholder_Placeholder",utils.TemplateCall.EmptyElementsCall),"todoListsUUID_Placeholder_Placeholder_Placeholder",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"todoListsUUID_Placeholder_Placeholder_Placeholder(newlid, ph, ph2, ph3) at ToDoListApp.app:302/22");
}
if(RENDER_PHASE==phase){
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
String tmpstring0=tmpstringwriter0.toString();
out.write(tmpstring0);
threadLocalPageCached.addReRenderPlaceholdersContent(utils.URLFilter.filter(""+ph_),tmpstring0);
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-sm-5 col-border");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
java.io.StringWriter tmpstringwriter1=null;
if(RENDER_PHASE==phase){
out.print("<"+"div"+" id=\""+utils.URLFilter.filter(""+ph2_)+"\" class=\"webdsl-placeholder\">");
tmpstringwriter1=new java.io.StringWriter();
out=new java.io.PrintWriter(tmpstringwriter1);
utils.ThreadLocalOut.push(out);
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_81913420313","todoItemsString_String_Placeholder_Placeholder",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{((webdsl.generated.domain.ToDoList)utils.ThreadLocalPage.getEnv().getGlobalVariable("globalflist")).getName(),"",ph2_,ph3_},"todoItemsString_String_Placeholder_Placeholder"),new org.webdsl.lang.Environment(env).putWithcall("elements#todoItemsString_String_Placeholder_Placeholder",utils.TemplateCall.EmptyElementsCall),"todoItemsString_String_Placeholder_Placeholder",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"todoItemsString_String_Placeholder_Placeholder(global.globalflist.name, \"\", ph2, ph3) at ToDoListApp.app:308/23");
}
if(RENDER_PHASE==phase){
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
String tmpstring1=tmpstringwriter1.toString();
out.write(tmpstring1);
threadLocalPageCached.addReRenderPlaceholdersContent(utils.URLFilter.filter(""+ph2_),tmpstring1);
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-sm-4 col-border");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
java.io.StringWriter tmpstringwriter2=null;
if(RENDER_PHASE==phase){
out.print("<"+"div"+" id=\""+utils.URLFilter.filter(""+ph3_)+"\" class=\"webdsl-placeholder\">");
tmpstringwriter2=new java.io.StringWriter();
out=new java.io.PrintWriter(tmpstringwriter2);
utils.ThreadLocalOut.push(out);
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_81913420315","descriptionString_String_Placeholder",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"","",ph3_},"descriptionString_String_Placeholder"),new org.webdsl.lang.Environment(env).putWithcall("elements#descriptionString_String_Placeholder",utils.TemplateCall.EmptyElementsCall),"descriptionString_String_Placeholder",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"descriptionString_String_Placeholder(\"\", \"\", ph3) at ToDoListApp.app:313/23");
}
if(RENDER_PHASE==phase){
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
String tmpstring2=tmpstringwriter2.toString();
out.write(tmpstring2);
threadLocalPageCached.addReRenderPlaceholdersContent(utils.URLFilter.filter(""+ph3_),tmpstring2);
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagepredicate_home0_.genpagepredicate_home0_()){}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVarsOnce(){
ph3_="ph3_"+utils.TemplateServlet.getCurrentTemplate().getUniqueId();
ph2_="ph2_"+utils.TemplateServlet.getCurrentTemplate().getUniqueId();
ph_="ph_"+utils.TemplateServlet.getCurrentTemplate().getUniqueId();
}
protected void initializeLocalVars(){
newlid_=null;
newtdlist_=webdsl.generated.domain.ToDoList._static_createEmpty_();
}
}
