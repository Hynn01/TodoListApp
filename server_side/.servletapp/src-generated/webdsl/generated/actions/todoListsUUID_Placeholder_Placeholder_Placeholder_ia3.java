package webdsl.generated.actions;
public class todoListsUUID_Placeholder_Placeholder_Placeholder_ia3 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.ToDoList tl__arg,final String ph3_arg,final String ph2_arg,final String ph_arg,final java.util.UUID focusedListId_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.ToDoList tl__=null;
tl__=tl__arg;
String ph3_=null;
ph3_=ph3_arg;
String ph2_=null;
ph2_=ph2_arg;
String ph_=null;
ph_=ph_arg;
java.util.UUID focusedListId_=null;
focusedListId_=focusedListId_arg;
if(webdsl.generated.functions.genactionpredicate_todoLists__0UUID_Placeholder_Placeholder_Placeholder_.genactionpredicate_todoLists__0UUID_Placeholder_Placeholder_Placeholder_(focusedListId_,ph_,ph2_,ph3_)){
((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().removeFromTodolists(tl__);
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
