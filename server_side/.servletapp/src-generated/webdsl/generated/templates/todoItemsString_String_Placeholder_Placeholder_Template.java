package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class todoItemsString_String_Placeholder_Placeholder_Template extends utils.TemplateServlet{
public void prefetchFor1130347170(java.util.List<webdsl.generated.domain.ToDoList> list,boolean early){
if(early){}
else {}
}
public void prefetchFor1130347171(java.util.List<webdsl.generated.domain.User> list,boolean early){
if(early){}
else {}
}
public void prefetchFor1130347172(java.util.List<webdsl.generated.domain.ToDoItem> list,boolean early){
if(early){}
else {}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.todoItemsString_String_Placeholder_Placeholder_s_ad3String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_ToDoItem_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.todoItemsString_String_Placeholder_Placeholder_s_ad2String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_ToDoItem_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.todoItemsString_String_Placeholder_Placeholder_s_ad1String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_Template.class,null,staticEnv))));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputString_1_todoItemsString_String_Placeholder_Placeholderpc0",RefArg_inputString_1_todoItemsString_String_Placeholder_Placeholderpc0.class);
utils.AbstractPageServlet.loadRefArgClasses(todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(todoItemsString_String_Placeholder_Placeholder_s_ad1String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(todoItemsString_String_Placeholder_Placeholder_s_ad2String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_ToDoItem_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(todoItemsString_String_Placeholder_Placeholder_s_ad3String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_ToDoItem_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"todoItemsString_String_Placeholder_Placeholder":keyOverwrite,todoItemsString_String_Placeholder_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(todoItemsString_String_Placeholder_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
focusedListName_=(String)args[0];
focusedItemName_=(String)args[1];
ph_=(String)args[2];
ph3_=(String)args[3];
}
public String getUniqueName(){
return "todoItemsString_String_Placeholder_Placeholder";
}
public String getTemplateSignature(){
return "ajaxtemplate todoItems(focusedListName : String, focusedItemName : String, ph : Placeholder, ph3 : Placeholder)";
}
protected boolean isAjaxTemplate(){
return true;
}
public String getElementsContext(){
if(calledName==null){
return "todoItemsString_String_Placeholder_Placeholder";
}
else {
return calledName;
}
}
private String focusedListName_="";
private String focusedItemName_="";
private String ph_="";
private String ph3_="";
private String newusername_;
public String getNewusername_(){
return newusername_;
}
public void setNewusername_(String newusername_){
this.newusername_=newusername_;
}
private webdsl.generated.domain.ToDoItem newtditem_;
public webdsl.generated.domain.ToDoItem getNewtditem_(){
return newtditem_;
}
public void setNewtditem_(webdsl.generated.domain.ToDoItem newtditem_){
this.newtditem_=newtditem_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if2=null;
if(RENDER_PHASE==phase||(if2=(Boolean)getTemplatecalls().get("if15399086280"+forelementcounter))==null){
if2=webdsl.generated.functions.gentemplatepredicate_todoItems0String_String_Placeholder_Placeholder_.gentemplatepredicate_todoItems0String_String_Placeholder_Placeholder_(focusedListName_,focusedItemName_,ph_,ph3_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if15399086280"+forelementcounter,if2);
}
}
if(if2){
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if15399086281"+forelementcounter))==null){
if1=org.webdsl.tools.Utils.equal(focusedListName_,null);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if15399086281"+forelementcounter,if1);
}
}
if(if1){
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall15399086280","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"No Selected To Do List"},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(\"No Selected To Do List\") at ToDoListApp.app:164/10");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
else {
inForLoop=true;
forLoopCounter++;
int separatorindex2=0;
java.util.List<webdsl.generated.domain.ToDoList> forcol2=null;
if(RENDER_PHASE==phase||(forcol2=(java.util.List<webdsl.generated.domain.ToDoList>)getTemplatecalls().get("for15399086280"+forelementcounter))==null){
java.util.Collection<? extends webdsl.generated.domain.ToDoList> expr2=((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().getTodolists();
java.util.ArrayList<webdsl.generated.domain.ToDoList> list3=new java.util.ArrayList<webdsl.generated.domain.ToDoList>(expr2);
prefetchFor1130347170(list3,true);
prefetchFor1130347170(list3,false);
forcol2=list3;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for15399086280"+forelementcounter,forcol2);
}
}
int i2=-1;
for(webdsl.generated.domain.ToDoList tl_:forcol2){
i2++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(tl_)){
org.webdsl.WebDSLEntity temp2=(org.webdsl.WebDSLEntity)(Object)tl_;
forelementcounter=temp2.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp2.getId());
}
else forelementcounter=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementcounter);
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if15399086282"+forelementcounter))==null){
if0=org.webdsl.tools.Utils.equal(tl_.getName(),focusedListName_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if15399086282"+forelementcounter,if0);
}
}
if(if0){
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
if(RENDER_PHASE==phase){
out.print("<"+"i");
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
utils.TemplateCall.appendWithPadding(classattrs,"card-checklist");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("</"+"i"+">");
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
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall15399086282","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"ListName:"+tl_.getName()},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(\"ListName:\" + tl.name) at ToDoListApp.app:170/10");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementcounter:"")+("form15399086280"+getUniqueId());
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall15399086284","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_todoItemsString_String_Placeholder_Placeholder_Template0(todoItemsString_String_Placeholder_Placeholder_Template.this)},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(newusername) at ToDoListApp.app:175/8");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall15399086286","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"todoItemsString_String_Placeholder_Placeholder_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("todoItemsString_String_Placeholder_Placeholder_s_ad0String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList",getElementsContext(),new Object[]{focusedListName_,focusedItemName_,ph_,ph3_,new webdsl.generated.templates.RefArg_todoItemsString_String_Placeholder_Placeholder_Template0(todoItemsString_String_Placeholder_Placeholder_Template.this),new webdsl.generated.templates.RefArg_todoItemsString_String_Placeholder_Placeholder_Template1(todoItemsString_String_Placeholder_Placeholder_Template.this),tl_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"todoItemsString_String_Placeholder_Placeholder_ia0\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
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
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<webdsl.generated.domain.User> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.User>)getTemplatecalls().get("for15399086281"+forelementcounter))==null){
java.util.Collection<? extends webdsl.generated.domain.User> expr0=tl_.getAllowedUsers();
java.util.ArrayList<webdsl.generated.domain.User> list1=new java.util.ArrayList<webdsl.generated.domain.User>(expr0);
prefetchFor1130347171(list1,true);
prefetchFor1130347171(list1,false);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for15399086281"+forelementcounter,forcol0);
}
}
int i0=-1;
for(webdsl.generated.domain.User u_:forcol0){
i0++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(u_)){
org.webdsl.WebDSLEntity temp0=(org.webdsl.WebDSLEntity)(Object)u_;
forelementcounter=temp0.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp0.getId());
}
else forelementcounter=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementcounter);
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall15399086289","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"allowedUser name:"+u_.getUsername()},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(\"allowedUser name:\" + u.username) at ToDoListApp.app:195/28");
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
if(DATABIND_PHASE==phase){
String actionid0=(inForLoop?forelementcounter:"")+("action15399086280"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid0)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.todoItemsString_String_Placeholder_Placeholder_ia1.isValidationDisabled();
}
}
if(ACTION_PHASE==phase){
String actionid1=(inForLoop?forelementcounter:"")+("action15399086280"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid1)!=null){
threadLocalPageCached.enableAjaxActionExecuted();
new webdsl.generated.actions.todoItemsString_String_Placeholder_Placeholder_ia1().run(threadLocalPageCached,getEnv(),getElementsContext(),u_,tl_,ph3_,ph_,focusedItemName_,focusedListName_,ident);
return;}
}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"onclick","serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+"\",\""+((inForLoop?forelementcounter:"")+("action15399086280"+getUniqueId()))+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"false"+",\""+threadLocalPageCached.placeholderId+"\");");
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall153990862811","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"delete"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",utils.TemplateCall.EmptyElementsCall),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"delete\") at ToDoListApp.app:196/27");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
threadLocalPageCached.leaveTemplateContext();
}
forLoopCounter--;
if(forLoopCounter==0){
inForLoop=false;
forelementcounter="0";
fallbackcounter=0;
}
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementcounter:"")+("form15399086281"+getUniqueId());
threadLocalPageCached.setFormIdent(ident);
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.setInSubmittedForm(true);
threadLocalPageCached.submittedFormId=ident;
}
java.io.StringWriter sw3=null;
java.io.StringWriter sw2=null;
if(RENDER_PHASE==phase){
threadLocalPageCached.formRequiresMultipartEnc=false;
if(threadLocalPageCached.inSubmittedForm()&&threadLocalPageCached.isValidationFormRerender()){
sw3=new java.io.StringWriter();
out=new java.io.PrintWriter(sw3);
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
sw2=new java.io.StringWriter();
out=new java.io.PrintWriter(sw2);
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall153990862813","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputString_1_todoItemsString_String_Placeholder_Placeholderpc0(newtditem_)},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(newtditem.name) at ToDoListApp.app:206/8");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall153990862815","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"todoItemsString_String_Placeholder_Placeholder_ia2_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("todoItemsString_String_Placeholder_Placeholder_s_ad1String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList",getElementsContext(),new Object[]{focusedListName_,focusedItemName_,ph_,ph3_,new webdsl.generated.templates.RefArg_todoItemsString_String_Placeholder_Placeholder_Template0(todoItemsString_String_Placeholder_Placeholder_Template.this),new webdsl.generated.templates.RefArg_todoItemsString_String_Placeholder_Placeholder_Template1(todoItemsString_String_Placeholder_Placeholder_Template.this),tl_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"todoItemsString_String_Placeholder_Placeholder_ia2\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
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
out.write(sw2.toString());
if(threadLocalPageCached.inSubmittedForm()&&threadLocalPageCached.isValidationFormRerender()){
utils.ThreadLocalOut.pop();
if(threadLocalPageCached.submittedFormContent==null){
threadLocalPageCached.submittedFormContent=sw3.toString();
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
inForLoop=true;
forLoopCounter++;
int separatorindex1=0;
java.util.List<webdsl.generated.domain.ToDoItem> forcol1=null;
if(RENDER_PHASE==phase||(forcol1=(java.util.List<webdsl.generated.domain.ToDoItem>)getTemplatecalls().get("for15399086282"+forelementcounter))==null){
java.util.Collection<? extends webdsl.generated.domain.ToDoItem> expr1=tl_.getTodoitems();
java.util.ArrayList<webdsl.generated.domain.ToDoItem> list2=new java.util.ArrayList<webdsl.generated.domain.ToDoItem>(expr1);
prefetchFor1130347172(list2,true);
prefetchFor1130347172(list2,false);
forcol1=list2;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for15399086282"+forelementcounter,forcol1);
}
}
int i1=-1;
for(webdsl.generated.domain.ToDoItem ti_:forcol1){
i1++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(ti_)){
org.webdsl.WebDSLEntity temp1=(org.webdsl.WebDSLEntity)(Object)ti_;
forelementcounter=temp1.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp1.getId());
}
else forelementcounter=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementcounter);
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
utils.TemplateCall.appendWithPadding(classattrs,org.webdsl.tools.Utils.equal(ti_.getName(),focusedItemName_)?"row focus":"row");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall153990862818","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"todoItemsString_String_Placeholder_Placeholder_ia3_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("todoItemsString_String_Placeholder_Placeholder_s_ad2String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_ToDoItem",getElementsContext(),new Object[]{focusedListName_,focusedItemName_,ph_,ph3_,new webdsl.generated.templates.RefArg_todoItemsString_String_Placeholder_Placeholder_Template0(todoItemsString_String_Placeholder_Placeholder_Template.this),new webdsl.generated.templates.RefArg_todoItemsString_String_Placeholder_Placeholder_Template1(todoItemsString_String_Placeholder_Placeholder_Template.this),tl_,ti_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"todoItemsString_String_Placeholder_Placeholder_ia3\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall153990862821","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"todoItemsString_String_Placeholder_Placeholder_ia4_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("todoItemsString_String_Placeholder_Placeholder_s_ad3String_String_String_Placeholder_Placeholder_String_ToDoItem_ToDoList_ToDoItem",getElementsContext(),new Object[]{focusedListName_,focusedItemName_,ph_,ph3_,new webdsl.generated.templates.RefArg_todoItemsString_String_Placeholder_Placeholder_Template0(todoItemsString_String_Placeholder_Placeholder_Template.this),new webdsl.generated.templates.RefArg_todoItemsString_String_Placeholder_Placeholder_Template1(todoItemsString_String_Placeholder_Placeholder_Template.this),tl_,ti_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"todoItemsString_String_Placeholder_Placeholder_ia4\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
newusername_="";
newtditem_=webdsl.generated.domain.ToDoItem._static_createEmpty_();
}
}
