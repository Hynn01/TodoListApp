package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class bootstrap_ta0_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"bootstrap_ta0":keyOverwrite,bootstrap_ta0_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(bootstrap_ta0_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "bootstrap_ta0";
}
public String getTemplateSignature(){
return "template bootstrap_ta0()";
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
if(RENDER_PHASE==phase){
out.print("<!-- Required meta tags -->");
}
if(RENDER_PHASE==phase){
out.print("<"+"meta");
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
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("charset","utf-8"));
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<"+"meta");
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
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("name","viewport"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("content","width=device-width, initial-scale=1"));
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<!-- Bootstrap CSS -->");
}
if(RENDER_PHASE==phase){
out.print("<"+"link");
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
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("href","https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("rel","stylesheet"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("integrity","sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("crossorigin","anonymous"));
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<"+"link");
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
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("rel","stylesheet"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("href","https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.0/font/bootstrap-icons.css"));
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<!-- Bootstrap icon -->");
}
if(RENDER_PHASE==phase){
out.print("<"+"link");
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
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("rel","stylesheet"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("href","https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.0/font/bootstrap-icons.css"));
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<!-- Option 1: Bootstrap Bundle with Popper -->");
}
if(RENDER_PHASE==phase){
out.print("<script");
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
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("src","https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("integrity","sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("crossorigin","anonymous"));
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
out.print("</script>");
}
}
}
