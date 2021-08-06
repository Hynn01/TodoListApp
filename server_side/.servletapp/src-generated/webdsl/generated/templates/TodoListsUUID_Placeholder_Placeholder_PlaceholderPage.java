package webdsl.generated.templates;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressWarnings("all")public class TodoListsUUID_Placeholder_Placeholder_PlaceholderPage extends utils.PageServlet{
public String getPageName(){
return "todoListsUUID_Placeholder_Placeholder_Placeholder";
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
Object[] args=new Object[]{focusedListId_,ph_,ph2_,ph3_};
this.args=args;
}
protected void initTemplateClass(){
templateservlet=new todoListsUUID_Placeholder_Placeholder_Placeholder_Template();
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
focusedListId_=(java.util.UUID)args[0];
ph_=(String)args[1];
ph2_=(String)args[2];
ph3_=(String)args[3];
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
return "todoListsUUID_Placeholder_Placeholder_Placeholder";
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
private java.util.UUID focusedListId_;
private String ph_;
private String ph2_;
private String ph3_;
public void hiddenPostParamsJson(java.lang.StringBuilder combinedparams){
combinedparams.append("{\"name\":\"").append("focusedListId").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(focusedListId_.toString())).append("\"},");
combinedparams.append("{\"name\":\"").append("ph").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(ph_.toString())).append("\"},");
combinedparams.append("{\"name\":\"").append("ph2").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(ph2_.toString())).append("\"},");
combinedparams.append("{\"name\":\"").append("ph3").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(ph3_.toString())).append("\"},");
}
public void urlQueryParams(java.lang.StringBuilder combinedparams){
combinedparams.append("focusedListId").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(focusedListId_.toString()))).append("&");
combinedparams.append("ph").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(ph_.toString()))).append("&");
combinedparams.append("ph2").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(ph2_.toString()))).append("&");
combinedparams.append("ph3").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(ph3_.toString()))).append("&");
}
public void hiddenParams(java.lang.StringBuilder combinedparams){
combinedparams.append("<input type=\"hidden\" name=\"").append("focusedListId").append("\" value=\"").append(utils.HTMLFilter.filter(focusedListId_.toString())).append("\" />");
combinedparams.append("<input type=\"hidden\" name=\"").append("ph").append("\" value=\"").append(utils.HTMLFilter.filter(ph_.toString())).append("\" />");
combinedparams.append("<input type=\"hidden\" name=\"").append("ph2").append("\" value=\"").append(utils.HTMLFilter.filter(ph2_.toString())).append("\" />");
combinedparams.append("<input type=\"hidden\" name=\"").append("ph3").append("\" value=\"").append(utils.HTMLFilter.filter(ph3_.toString())).append("\" />");
}
protected void loadArguments(){
if(focusedListId_==null){
focusedListId_=null;
}
if(ph_==null){
ph_="";
}
if(ph2_==null){
ph2_="";
}
if(ph3_==null){
ph3_="";
}
}
protected void conversion(){
if(parammap.get("focusedListId")!=null){
try{
focusedListId_=java.util.UUID.fromString(parammap.get("focusedListId"));
}
catch(IllegalArgumentException nfe){
org.webdsl.logging.Logger.error(nfe.getMessage());
}
}
if(parammap.get("ph")!=null){
ph_=parammap.get("ph");
}
if(parammap.get("ph2")!=null){
ph2_=parammap.get("ph2");
}
if(parammap.get("ph3")!=null){
ph3_=parammap.get("ph3");
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
