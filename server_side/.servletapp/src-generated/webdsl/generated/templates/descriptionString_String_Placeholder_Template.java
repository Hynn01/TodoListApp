package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class descriptionString_String_Placeholder_Template extends utils.TemplateServlet{
public void prefetchFor9967169080(java.util.List<webdsl.generated.domain.ToDoList> list,boolean early){
if(early){}
else {}
}
public void prefetchFor9967169081(java.util.List<webdsl.generated.domain.ToDoItem> list,boolean early){
if(early){}
else {}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList_ToDoItem_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList_ToDoItem_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"descriptionString_String_Placeholder":keyOverwrite,descriptionString_String_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(descriptionString_String_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
focusedListName_=(String)args[0];
focusedItemName_=(String)args[1];
ph_=(String)args[2];
}
public String getUniqueName(){
return "descriptionString_String_Placeholder";
}
public String getTemplateSignature(){
return "ajaxtemplate description(focusedListName : String, focusedItemName : String, ph : Placeholder)";
}
protected boolean isAjaxTemplate(){
return true;
}
public String getElementsContext(){
if(calledName==null){
return "descriptionString_String_Placeholder";
}
else {
return calledName;
}
}
private String focusedListName_="";
private String focusedItemName_="";
private String ph_="";
private String newdescription_;
public String getNewdescription_(){
return newdescription_;
}
public void setNewdescription_(String newdescription_){
this.newdescription_=newdescription_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if3=null;
if(RENDER_PHASE==phase||(if3=(Boolean)getTemplatecalls().get("if_17961402820"+forelementcounter))==null){
if3=webdsl.generated.functions.gentemplatepredicate_description0String_String_Placeholder_.gentemplatepredicate_description0String_String_Placeholder_(focusedListName_,focusedItemName_,ph_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_17961402820"+forelementcounter,if3);
}
}
if(if3){
Boolean if2=null;
if(RENDER_PHASE==phase||(if2=(Boolean)getTemplatecalls().get("if_17961402821"+forelementcounter))==null){
if2=org.webdsl.tools.Utils.equal(((webdsl.generated.domain.ToDoList)utils.ThreadLocalPage.getEnv().getGlobalVariable("globalflist")).getId(),null);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_17961402821"+forelementcounter,if2);
}
}
if(if2){
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
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_17961402820","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"No Description"},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(\"No Description\") at ToDoListApp.app:235/9");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
else {
inForLoop=true;
forLoopCounter++;
int separatorindex1=0;
java.util.List<webdsl.generated.domain.ToDoList> forcol1=null;
if(RENDER_PHASE==phase||(forcol1=(java.util.List<webdsl.generated.domain.ToDoList>)getTemplatecalls().get("for_17961402820"+forelementcounter))==null){
java.util.Collection<? extends webdsl.generated.domain.ToDoList> expr1=((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().getTodolists();
java.util.ArrayList<webdsl.generated.domain.ToDoList> list2=new java.util.ArrayList<webdsl.generated.domain.ToDoList>(expr1);
prefetchFor9967169080(list2,true);
prefetchFor9967169080(list2,false);
forcol1=list2;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for_17961402820"+forelementcounter,forcol1);
}
}
int i1=-1;
for(webdsl.generated.domain.ToDoList tl_:forcol1){
i1++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(tl_)){
org.webdsl.WebDSLEntity temp1=(org.webdsl.WebDSLEntity)(Object)tl_;
forelementcounter=temp1.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp1.getId());
}
else forelementcounter=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementcounter);
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_17961402822"+forelementcounter))==null){
if1=org.webdsl.tools.Utils.equal(tl_.getName(),focusedListName_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_17961402822"+forelementcounter,if1);
}
}
if(if1){
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<webdsl.generated.domain.ToDoItem> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.ToDoItem>)getTemplatecalls().get("for_17961402821"+forelementcounter))==null){
java.util.Collection<? extends webdsl.generated.domain.ToDoItem> expr0=tl_.getTodoitems();
java.util.ArrayList<webdsl.generated.domain.ToDoItem> list1=new java.util.ArrayList<webdsl.generated.domain.ToDoItem>(expr0);
prefetchFor9967169081(list1,true);
prefetchFor9967169081(list1,false);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for_17961402821"+forelementcounter,forcol0);
}
}
int i0=-1;
for(webdsl.generated.domain.ToDoItem ti_:forcol0){
i0++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(ti_)){
org.webdsl.WebDSLEntity temp0=(org.webdsl.WebDSLEntity)(Object)ti_;
forelementcounter=temp0.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp0.getId());
}
else forelementcounter=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementcounter);
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_17961402823"+forelementcounter))==null){
if0=org.webdsl.tools.Utils.equal(ti_.getName(),focusedItemName_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_17961402823"+forelementcounter,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_17961402822","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Description"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",utils.TemplateCall.EmptyElementsCall),"labelString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Description\") at ToDoListApp.app:241/8");
}
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementcounter:"")+("form_17961402820"+getUniqueId());
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
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_17961402824","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_descriptionString_String_Placeholder_Template0(descriptionString_String_Placeholder_Template.this)},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(newdescription) at ToDoListApp.app:245/11");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_17961402826","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"descriptionString_String_Placeholder_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("descriptionString_String_Placeholder_s_ad0String_String_String_Placeholder_String_ToDoList_ToDoItem",getElementsContext(),new Object[]{focusedListName_,focusedItemName_,ph_,new webdsl.generated.templates.RefArg_descriptionString_String_Placeholder_Template0(descriptionString_String_Placeholder_Template.this),tl_,ti_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"descriptionString_String_Placeholder_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_17961402829","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{ti_.getDescription()},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(ti.description) at ToDoListApp.app:256/14");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
threadLocalPageCached.leaveTemplateContext();
}
forLoopCounter--;
if(forLoopCounter==0){
inForLoop=false;
forelementcounter="0";
fallbackcounter=0;
}
}
threadLocalPageCached.leaveTemplateContext();
}
forLoopCounter--;
if(forLoopCounter==0){
inForLoop=false;
forelementcounter="0";
fallbackcounter=0;
}
}
}
}
protected void initializeLocalVars(){
newdescription_="";
}
}
