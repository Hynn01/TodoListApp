package webdsl.generated.actions;
public class todoListsUUID_Placeholder_Placeholder_Placeholder_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.ToDoList tl__arg,final String ph3__arg,final String ph2__arg,final String ph__arg,final String ph3_arg,final String ph2_arg,final String ph_arg,final java.util.UUID focusedListId_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.ToDoList tl__=null;
tl__=tl__arg;
String ph3__=null;
ph3__=ph3__arg;
String ph2__=null;
ph2__=ph2__arg;
String ph__=null;
ph__=ph__arg;
String ph3_=null;
ph3_=ph3_arg;
String ph2_=null;
ph2_=ph2_arg;
String ph_=null;
ph_=ph_arg;
java.util.UUID focusedListId_=null;
focusedListId_=focusedListId_arg;
if(webdsl.generated.functions.genactionpredicate_todoLists__0UUID_Placeholder_Placeholder_Placeholder_.genactionpredicate_todoLists__0UUID_Placeholder_Placeholder_Placeholder_(focusedListId_,ph_,ph2_,ph3_)){
((webdsl.generated.domain.ToDoList)utils.ThreadLocalPage.getEnv().getGlobalVariable("globalflist")).setName(tl__.getName());
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
java.io.StringWriter s1=new java.io.StringWriter();
java.io.PrintWriter out1=new java.io.PrintWriter(s1);
utils.ThreadLocalOut.push(out1);
Object[] args1=new Object[]{tl__.getId(),ph__,ph2__,ph3__};
try{
((utils.PageServlet)utils.DispatchServletHelper.pages.get("todoListsUUID_Placeholder_Placeholder_Placeholder").getPageClass().newInstance()).serveAsAjaxResponse(args1,utils.TemplateCall.None,utils.URLFilter.filter(ph__));
}
catch(Exception iae){
org.webdsl.logging.Logger.error("Problem in template servlet template lookup for Ajax: "+iae.getMessage()+" template :"+"todoListsUUID_Placeholder_Placeholder_Placeholder");
}
utils.ThreadLocalOut.popChecked(out1);
utils.ThreadLocalOut.peek().print("{ \"action\": \""+"replace"+"\", \"id\": \""+utils.URLFilter.filter(ph__)+"\", \"value\" : \""+org.apache.commons.lang3.StringEscapeUtils.escapeJava(s1.toString())+"\"},");
utils.ThreadLocalPage.get().actionHasAjaxPageUpdates=true;
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
java.io.StringWriter s2=new java.io.StringWriter();
java.io.PrintWriter out2=new java.io.PrintWriter(s2);
utils.ThreadLocalOut.push(out2);
Object[] args2=new Object[]{((webdsl.generated.domain.ToDoList)utils.ThreadLocalPage.getEnv().getGlobalVariable("globalflist")).getName(),"",ph2__,ph3__};
try{
((utils.PageServlet)utils.DispatchServletHelper.pages.get("todoItemsString_String_Placeholder_Placeholder").getPageClass().newInstance()).serveAsAjaxResponse(args2,utils.TemplateCall.None,utils.URLFilter.filter(ph2__));
}
catch(Exception iae){
org.webdsl.logging.Logger.error("Problem in template servlet template lookup for Ajax: "+iae.getMessage()+" template :"+"todoItemsString_String_Placeholder_Placeholder");
}
utils.ThreadLocalOut.popChecked(out2);
utils.ThreadLocalOut.peek().print("{ \"action\": \""+"replace"+"\", \"id\": \""+utils.URLFilter.filter(ph2__)+"\", \"value\" : \""+org.apache.commons.lang3.StringEscapeUtils.escapeJava(s2.toString())+"\"},");
utils.ThreadLocalPage.get().actionHasAjaxPageUpdates=true;
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
