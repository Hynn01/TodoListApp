package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class iCheckList_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"iCheckList":keyOverwrite,iCheckList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(iCheckList_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "iCheckList";
}
public String getTemplateSignature(){
return "template iCheckList()";
}
public String getElementsContext(){
if(calledName==null){
return "iCheckList";
}
else {
return calledName;
}
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
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
utils.TemplateCall.handleAttrsAtHtmlElement(attrs,classattrs,styleattrs,ignore,out);
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
utils.TemplateCall elems=env.getElementscall("elements#"+getElementsContext());
java.util.Map<String,String> attrsmapout=elems.attrs;
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_14433975610",elems.name,env.addExtraLocalTemplateArgumentsToArguments(elems.args,elems.name),new org.webdsl.lang.Environment(env),elems.parentName,attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"elements()");
}
if(RENDER_PHASE==phase){
out.print("</"+"i"+">");
}
}
}
