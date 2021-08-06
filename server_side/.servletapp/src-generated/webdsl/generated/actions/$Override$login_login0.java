package webdsl.generated.actions;
public class $Override$login_login0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String password_arg,final String username_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
String password_=null;
password_=password_arg;
String username_=null;
username_=username_arg;
if(!webdsl.generated.functions.authenticateString_Secret_.authenticateString_Secret_(username_,password_)){
throw new utils.ValidationException(null,"The login credentials are not valid.");
}
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("home"));
}
}
);
}
}
