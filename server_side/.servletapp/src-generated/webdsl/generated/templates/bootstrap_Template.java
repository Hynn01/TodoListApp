package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class bootstrap_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.bootstrap_ta0_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(bootstrap_ta0_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"bootstrap":keyOverwrite,bootstrap_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(bootstrap_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "bootstrap";
}
public String getTemplateSignature(){
return "template bootstrap()";
}
public String getElementsContext(){
if(calledName==null){
return "bootstrap";
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
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall3450781910","head",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"head"),new org.webdsl.lang.Environment(env).putWithcall("elements#head",new utils.TemplateCall("bootstrap_ta0",getElementsContext(),org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,attrs)),"head",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"head() at ToDoListApp.app:10/4");
}
}
}
