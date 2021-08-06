package webdsl.generated.actions;
public class $Override$logout_logout0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).setPrincipal(null);
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl(""));
}
}
);
}
}
