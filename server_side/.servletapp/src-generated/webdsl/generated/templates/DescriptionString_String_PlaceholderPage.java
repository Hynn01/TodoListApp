package webdsl.generated.templates;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressWarnings("all")public class DescriptionString_String_PlaceholderPage extends utils.PageServlet{
public String getPageName(){
return "descriptionString_String_Placeholder";
}
public String getHiddenParams(){
java.lang.StringBuilder hiddens=new java.lang.StringBuilder(512);
hiddenParams(hiddens);
return hiddens.toString();
}
public String getUrlQueryParams(){
java.lang.StringBuilder params=new java.lang.StringBuilder(512);
urlQueryParams(params);
return params.toString();
}
public String getHiddenPostParamsJson(){
java.lang.StringBuilder hiddens=new java.lang.StringBuilder(512);
hiddenPostParamsJson(hiddens);
return hiddens.toString();
}
public void initVarsAndArgs(){
utils.GlobalVariables.initGlobalVars(envGlobalAndSession,utils.HibernateUtil.getCurrentSession());
initialize();
conversion();
loadArguments();
Object[] args=new Object[]{focusedListName_,focusedItemName_,ph_};
this.args=args;
}
protected void initTemplateClass(){
templateservlet=new descriptionString_String_Placeholder_Template();
}
protected void redirectHttpHttps(){}
protected void addPrincipalToRequestLog(org.webdsl.WebDSLEntity rle){
((webdsl.generated.domain.RequestLogEntry)rle).setPrincipalNoEventsOrValidation(((webdsl.generated.domain.SecurityContext)envGlobalAndSession.getSessionVariable("securityContext")).getPrincipal());
}
protected org.webdsl.WebDSLEntity getRequestLogEntry(){
return ((utils.DispatchServletHelper)utils.ThreadLocalServlet.get()).getRequestLogEntry();
}
protected void addLogSqlToSessionMessages(){
if(this.isLogSqlEnabled()){
if(logSqlCheckAccess()){
((webdsl.generated.domain.SessionManager)utils.ThreadLocalServlet.get().getSessionManager()).setLogsqlMessageNoEventsOrValidation(utils.HibernateLog.printHibernateLog(this,"action"));
}
else {
((webdsl.generated.domain.SessionManager)utils.ThreadLocalServlet.get().getSessionManager()).setLogsqlMessageNoEventsOrValidation("Access to SQL logs was denied.");
}
}
}
protected void initializeBasics(utils.AbstractPageServlet ps,Object[] args){
initTemplateClass();
this.envGlobalAndSession=ps.envGlobalAndSession;
this.request=ps.getRequest();
this.response=ps.getResponse();
this.parammap=java.util.Collections.<String,String>emptyMap();
this.parammapvalues=java.util.Collections.<String,java.util.List<String>>emptyMap();
this.fileUploads=java.util.Collections.<String,java.util.List<utils.File>>emptyMap();
org.hibernate.Session hibSession=utils.HibernateUtil.getCurrentSession();
utils.ThreadLocalServlet.get().loadSessionManager(utils.HibernateUtil.getCurrentSession());
focusedListName_=(String)args[0];
focusedItemName_=(String)args[1];
ph_=(String)args[2];
initialize();
}
protected String[] getUsedSessionEntityJoins(){
return null;
}
protected void renderDebugJsVar(java.io.PrintWriter sout){
sout.println("<script type=\"text/javascript\">var show_webdsl_debug=false;</script>");
}
protected boolean isTemplate(){
return true;
}
public String getUniqueName(){
return "descriptionString_String_Placeholder";
}
protected void increaseStatReadOnly(){
renderReadOnly.incrementAndGet();
}
protected void increaseStatReadOnlyFromCache(){
renderReadOnlyFromCache.incrementAndGet();
}
protected void increaseStatUpdate(){
renderWithUpdates.incrementAndGet();
}
protected void increaseStatActionFail(){
actionFailed.incrementAndGet();
}
protected void increaseStatActionReadOnly(){
actionSuccessReadOnly.incrementAndGet();
}
protected void increaseStatActionUpdate(){
actionSuccessWithUpdates.incrementAndGet();
}
public static AtomicInteger renderReadOnly=new AtomicInteger();
public static AtomicInteger renderReadOnlyFromCache=new AtomicInteger();
public static AtomicInteger renderWithUpdates=new AtomicInteger();
public static AtomicInteger actionFailed=new AtomicInteger();
public static AtomicInteger actionSuccessReadOnly=new AtomicInteger();
public static AtomicInteger actionSuccessWithUpdates=new AtomicInteger();
private String focusedListName_;
private String focusedItemName_;
private String ph_;
public void hiddenPostParamsJson(java.lang.StringBuilder combinedparams){
combinedparams.append("{\"name\":\"").append("focusedListName").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(focusedListName_.toString())).append("\"},");
combinedparams.append("{\"name\":\"").append("focusedItemName").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(focusedItemName_.toString())).append("\"},");
combinedparams.append("{\"name\":\"").append("ph").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(ph_.toString())).append("\"},");
}
public void urlQueryParams(java.lang.StringBuilder combinedparams){
combinedparams.append("focusedListName").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(focusedListName_.toString()))).append("&");
combinedparams.append("focusedItemName").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(focusedItemName_.toString()))).append("&");
combinedparams.append("ph").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(ph_.toString()))).append("&");
}
public void hiddenParams(java.lang.StringBuilder combinedparams){
combinedparams.append("<input type=\"hidden\" name=\"").append("focusedListName").append("\" value=\"").append(utils.HTMLFilter.filter(focusedListName_.toString())).append("\" />");
combinedparams.append("<input type=\"hidden\" name=\"").append("focusedItemName").append("\" value=\"").append(utils.HTMLFilter.filter(focusedItemName_.toString())).append("\" />");
combinedparams.append("<input type=\"hidden\" name=\"").append("ph").append("\" value=\"").append(utils.HTMLFilter.filter(ph_.toString())).append("\" />");
}
protected void loadArguments(){
if(focusedListName_==null){
focusedListName_="";
}
if(focusedItemName_==null){
focusedItemName_="";
}
if(ph_==null){
ph_="";
}
}
protected void conversion(){
if(parammap.get("focusedListName")!=null){
focusedListName_=parammap.get("focusedListName");
}
if(parammap.get("focusedItemName")!=null){
focusedItemName_=parammap.get("focusedItemName");
}
if(parammap.get("ph")!=null){
ph_=parammap.get("ph");
}
}
protected void initialize(){
webdsl.generated.domain.SessionManager sesm$securityContext=(webdsl.generated.domain.SessionManager)utils.ThreadLocalServlet.get().getSessionManager();
if(sesm$securityContext.getSecurityContext()==null){
webdsl.generated.domain.SecurityContext ent=webdsl.generated.domain.SecurityContext._static_createEmpty_();
ent.SecurityContext_();
sesm$securityContext.setSecurityContextNoEventsOrValidation(ent);
utils.HibernateUtil.getCurrentSession().save(sesm$securityContext.getSecurityContext());
}
envGlobalAndSession.putSessionVariable("securityContext",sesm$securityContext.getSecurityContext());
}
}
