package webdsl.generated.actions;
public class todoItemsString_String_Placeholder_Placeholder_ia2 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.ToDoList tl__arg,final webdsl.generated.domain.ToDoItem newtditem__arg,final String ph3_arg,final String ph_arg,final String focusedItemName_arg,final String focusedListName_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.ToDoList tl__=null;
tl__=tl__arg;
webdsl.generated.domain.ToDoItem newtditem__=null;
newtditem__=newtditem__arg;
String ph3_=null;
ph3_=ph3_arg;
String ph_=null;
ph_=ph_arg;
String focusedItemName_=null;
focusedItemName_=focusedItemName_arg;
String focusedListName_=null;
focusedListName_=focusedListName_arg;
if(webdsl.generated.functions.genactionpredicate_todoItems__0String_String_Placeholder_Placeholder_.genactionpredicate_todoItems__0String_String_Placeholder_Placeholder_(focusedListName_,focusedItemName_,ph_,ph3_)){
tl__.addToTodoitems(newtditem__);
((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().save("User");
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
