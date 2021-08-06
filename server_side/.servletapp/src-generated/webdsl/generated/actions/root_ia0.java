package webdsl.generated.actions;
public class root_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.User newuser__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.User newuser__=null;
newuser__=newuser__arg;
newuser__.setPassword(org.webdsl.tools.Utils.secretDigest(newuser__.getPassword()));
newuser__.save("User");
}
}
);
}
}
