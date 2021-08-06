package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class todoListsUUID_Placeholder_Placeholder_Placeholder_Template extends utils.TemplateServlet{
public void prefetchFor_1639922030(java.util.List<webdsl.generated.domain.ToDoList> list,boolean early){
if(early){}
else {}
}
public void prefetchFor_1639922031(java.util.List<webdsl.generated.domain.ToDoList> list,boolean early){
if(early){}
else {}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad3String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad2String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad1String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad0String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class,null,staticEnv))));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad0String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad1String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad2String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad3String_UUID_Placeholder_Placeholder_Placeholder_ToDoList_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"todoListsUUID_Placeholder_Placeholder_Placeholder":keyOverwrite,todoListsUUID_Placeholder_Placeholder_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(todoListsUUID_Placeholder_Placeholder_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
focusedListId_=(java.util.UUID)args[0];
ph_=(String)args[1];
ph2_=(String)args[2];
ph3_=(String)args[3];
}
public String getUniqueName(){
return "todoListsUUID_Placeholder_Placeholder_Placeholder";
}
public String getTemplateSignature(){
return "ajaxtemplate todoLists(focusedListId : UUID, ph : Placeholder, ph2 : Placeholder, ph3 : Placeholder)";
}
protected boolean isAjaxTemplate(){
return true;
}
public String getElementsContext(){
if(calledName==null){
return "todoListsUUID_Placeholder_Placeholder_Placeholder";
}
else {
return calledName;
}
}
private java.util.UUID focusedListId_=null;
private String ph_="";
private String ph2_="";
private String ph3_="";
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if2=null;
if(RENDER_PHASE==phase||(if2=(Boolean)getTemplatecalls().get("if_903280910"+forelementcounter))==null){
if2=webdsl.generated.functions.gentemplatepredicate_todoLists0UUID_Placeholder_Placeholder_Placeholder_.gentemplatepredicate_todoLists0UUID_Placeholder_Placeholder_Placeholder_(focusedListId_,ph_,ph2_,ph3_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_903280910"+forelementcounter,if2);
}
}
if(if2){
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<webdsl.generated.domain.ToDoList> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.ToDoList>)getTemplatecalls().get("for_903280910"+forelementcounter))==null){
java.util.Collection<? extends webdsl.generated.domain.ToDoList> expr0=((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().getTodolists();
java.util.ArrayList<webdsl.generated.domain.ToDoList> list1=new java.util.ArrayList<webdsl.generated.domain.ToDoList>(expr0);
prefetchFor_1639922030(list1,true);
prefetchFor_1639922030(list1,false);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for_903280910"+forelementcounter,forcol0);
}
}
int i0=-1;
for(webdsl.generated.domain.ToDoList tl_:forcol0){
i0++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(tl_)){
org.webdsl.WebDSLEntity temp0=(org.webdsl.WebDSLEntity)(Object)tl_;
forelementcounter=temp0.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp0.getId());
}
else forelementcounter=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementcounter);
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_903280911"+forelementcounter))==null){
if0=webdsl.generated.functions.mayViewListUser_ToDoList_.mayViewListUser_ToDoList_(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(),tl_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_903280911"+forelementcounter,if0);
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
utils.TemplateCall.appendWithPadding(classattrs,org.webdsl.tools.Utils.equal(tl_.getId(),focusedListId_)?"row focus":"row");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_903280910","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"todoListsUUID_Placeholder_Placeholder_Placeholder_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad0String_UUID_Placeholder_Placeholder_Placeholder_ToDoList",getElementsContext(),new Object[]{focusedListId_,ph_,ph2_,ph3_,tl_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"todoListsUUID_Placeholder_Placeholder_Placeholder_ia0\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_903280913","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"todoListsUUID_Placeholder_Placeholder_Placeholder_ia1_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad1String_UUID_Placeholder_Placeholder_Placeholder_ToDoList",getElementsContext(),new Object[]{focusedListId_,ph_,ph2_,ph3_,tl_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"todoListsUUID_Placeholder_Placeholder_Placeholder_ia1\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
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
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_903280916","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Shared To Do Lists"},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(\"Shared To Do Lists\") at ToDoListApp.app:147/28");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
inForLoop=true;
forLoopCounter++;
int separatorindex1=0;
java.util.List<webdsl.generated.domain.ToDoList> forcol1=null;
if(RENDER_PHASE==phase||(forcol1=(java.util.List<webdsl.generated.domain.ToDoList>)getTemplatecalls().get("for_903280911"+forelementcounter))==null){
java.util.Collection<? extends webdsl.generated.domain.ToDoList> expr1=((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().getSharedTodolists();
java.util.ArrayList<webdsl.generated.domain.ToDoList> list2=new java.util.ArrayList<webdsl.generated.domain.ToDoList>(expr1);
prefetchFor_1639922031(list2,true);
prefetchFor_1639922031(list2,false);
forcol1=list2;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for_903280911"+forelementcounter,forcol1);
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
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_903280912"+forelementcounter))==null){
if1=webdsl.generated.functions.mayViewListUser_ToDoList_.mayViewListUser_ToDoList_(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(),tl_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_903280912"+forelementcounter,if1);
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
utils.TemplateCall.appendWithPadding(classattrs,org.webdsl.tools.Utils.equal(tl_.getId(),focusedListId_)?"row focus":"row");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_903280918","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"todoListsUUID_Placeholder_Placeholder_Placeholder_ia2_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad2String_UUID_Placeholder_Placeholder_Placeholder_ToDoList",getElementsContext(),new Object[]{focusedListId_,ph_,ph2_,ph3_,tl_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"todoListsUUID_Placeholder_Placeholder_Placeholder_ia2\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_9032809111","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"todoListsUUID_Placeholder_Placeholder_Placeholder_ia3_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("todoListsUUID_Placeholder_Placeholder_Placeholder_s_ad3String_UUID_Placeholder_Placeholder_Placeholder_ToDoList",getElementsContext(),new Object[]{focusedListId_,ph_,ph2_,ph3_,tl_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"todoListsUUID_Placeholder_Placeholder_Placeholder_ia3\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
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
}
}
