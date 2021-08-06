package webdsl.generated.actions;
public class todoItemsString_String_Placeholder_Placeholder_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.ToDoList tl__arg,final String newusername__arg,final String ph3_arg,final String ph_arg,final String focusedItemName_arg,final String focusedListName_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.ToDoList tl__=null;
tl__=tl__arg;
String newusername__=null;
newusername__=newusername__arg;
String ph3_=null;
ph3_=ph3_arg;
String ph_=null;
ph_=ph_arg;
String focusedItemName_=null;
focusedItemName_=focusedItemName_arg;
String focusedListName_=null;
focusedListName_=focusedListName_arg;
if(webdsl.generated.functions.genactionpredicate_todoItems__0String_String_Placeholder_Placeholder_.genactionpredicate_todoItems__0String_String_Placeholder_Placeholder_(focusedListName_,focusedItemName_,ph_,ph3_)){
org.webdsl.logging.Logger.info("searchUser("+newusername__+").length:"+webdsl.generated.domain.User._static_searchUser_(newusername__).size());
java.util.Collection<? extends webdsl.generated.domain.User> exp0=webdsl.generated.domain.User._static_searchUser_(newusername__);
java.util.ArrayList<webdsl.generated.domain.User> lst0=new java.util.ArrayList<webdsl.generated.domain.User>(exp0);
int i3=-1;
for(webdsl.generated.domain.User u_:lst0){
i3++;
tl__.addToAllowedUsers(u_);
}
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
