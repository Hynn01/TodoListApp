package webdsl.generated.functions;
@SuppressWarnings("all")public class mayViewListUser_ToDoList_{
public static Boolean mayViewListUser_ToDoList_(webdsl.generated.domain.User u_,webdsl.generated.domain.ToDoList l_){
return !org.webdsl.tools.Utils.equal(l_,null)&&org.webdsl.tools.Utils.equal(l_.getAuthor(),((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal())||!org.webdsl.tools.Utils.equal(l_,null)&&(!org.webdsl.tools.Utils.equal(l_.getAllowedUsers(),null)&&(!org.webdsl.tools.Utils.equal(l_.getAllowedUsers(),null)&&l_.getAllowedUsers().contains(u_)));
}
}
