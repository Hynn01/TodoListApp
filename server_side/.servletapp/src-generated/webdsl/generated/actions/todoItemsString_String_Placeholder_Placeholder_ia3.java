package webdsl.generated.actions;
public class todoItemsString_String_Placeholder_Placeholder_ia3 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.ToDoItem ti__arg,final webdsl.generated.domain.ToDoList tl__arg,final String ph3__arg,final String ph__arg,final String ph3_arg,final String ph_arg,final String focusedItemName_arg,final String focusedListName_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.ToDoItem ti__=null;
ti__=ti__arg;
webdsl.generated.domain.ToDoList tl__=null;
tl__=tl__arg;
String ph3__=null;
ph3__=ph3__arg;
String ph__=null;
ph__=ph__arg;
String ph3_=null;
ph3_=ph3_arg;
String ph_=null;
ph_=ph_arg;
String focusedItemName_=null;
focusedItemName_=focusedItemName_arg;
String focusedListName_=null;
focusedListName_=focusedListName_arg;
if(webdsl.generated.functions.genactionpredicate_todoItems__0String_String_Placeholder_Placeholder_.genactionpredicate_todoItems__0String_String_Placeholder_Placeholder_(focusedListName_,focusedItemName_,ph_,ph3_)){
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
java.io.StringWriter s0=new java.io.StringWriter();
java.io.PrintWriter out0=new java.io.PrintWriter(s0);
utils.ThreadLocalOut.push(out0);
Object[] args0=new Object[]{tl__.getName(),ti__.getName(),ph__,ph3__};
try{
((utils.PageServlet)utils.DispatchServletHelper.pages.get("todoItemsString_String_Placeholder_Placeholder").getPageClass().newInstance()).serveAsAjaxResponse(args0,utils.TemplateCall.None,utils.URLFilter.filter(ph__));
}
catch(Exception iae){
org.webdsl.logging.Logger.error("Problem in template servlet template lookup for Ajax: "+iae.getMessage()+" template :"+"todoItemsString_String_Placeholder_Placeholder");
}
utils.ThreadLocalOut.popChecked(out0);
utils.ThreadLocalOut.peek().print("{ \"action\": \""+"replace"+"\", \"id\": \""+utils.URLFilter.filter(ph__)+"\", \"value\" : \""+org.apache.commons.lang3.StringEscapeUtils.escapeJava(s0.toString())+"\"},");
utils.ThreadLocalPage.get().actionHasAjaxPageUpdates=true;
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
java.io.StringWriter s1=new java.io.StringWriter();
java.io.PrintWriter out1=new java.io.PrintWriter(s1);
utils.ThreadLocalOut.push(out1);
Object[] args1=new Object[]{tl__.getName(),ti__.getName(),ph3__};
try{
((utils.PageServlet)utils.DispatchServletHelper.pages.get("descriptionString_String_Placeholder").getPageClass().newInstance()).serveAsAjaxResponse(args1,utils.TemplateCall.None,utils.URLFilter.filter(ph3__));
}
catch(Exception iae){
org.webdsl.logging.Logger.error("Problem in template servlet template lookup for Ajax: "+iae.getMessage()+" template :"+"descriptionString_String_Placeholder");
}
utils.ThreadLocalOut.popChecked(out1);
utils.ThreadLocalOut.peek().print("{ \"action\": \""+"replace"+"\", \"id\": \""+utils.URLFilter.filter(ph3__)+"\", \"value\" : \""+org.apache.commons.lang3.StringEscapeUtils.escapeJava(s1.toString())+"\"},");
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
