package webdsl.generated.actions;
public class descriptionString_String_Placeholder_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.ToDoItem ti__arg,final String newdescription__arg,final String ph_arg,final String focusedItemName_arg,final String focusedListName_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.ToDoItem ti__=null;
ti__=ti__arg;
String newdescription__=null;
newdescription__=newdescription__arg;
String ph_=null;
ph_=ph_arg;
String focusedItemName_=null;
focusedItemName_=focusedItemName_arg;
String focusedListName_=null;
focusedListName_=focusedListName_arg;
if(webdsl.generated.functions.genactionpredicate_description__0String_String_Placeholder_.genactionpredicate_description__0String_String_Placeholder_(focusedListName_,focusedItemName_,ph_)){
ti__.setDescription(newdescription__);
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
