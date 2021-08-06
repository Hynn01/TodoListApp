package webdsl.generated.functions;
@SuppressWarnings("all")public class ent_User_listCompr0User_{
public static java.util.List<webdsl.generated.domain.ToDoList> ent_User_listCompr0User_(webdsl.generated.domain.User ent_User_renamedthis0_){
java.util.List<webdsl.generated.domain.ToDoList> res_=new java.util.ArrayList<webdsl.generated.domain.ToDoList>();
res_=new java.util.ArrayList<webdsl.generated.domain.ToDoList>();
java.util.List<webdsl.generated.domain.ToDoList> thecollection_=utils.HibernateUtil.getCurrentSession().createQuery("from ToDoList").list();
if(!org.webdsl.tools.Utils.equal(thecollection_,null)){
java.util.Collection<? extends webdsl.generated.domain.ToDoList> exp0=thecollection_;
java.util.ArrayList<webdsl.generated.domain.ToDoList> lst0=new java.util.ArrayList<webdsl.generated.domain.ToDoList>(exp0);
java.util.ArrayList<webdsl.generated.domain.ToDoList> filtered0=new java.util.ArrayList<webdsl.generated.domain.ToDoList>(lst0.size());
int i0=-1;
for(webdsl.generated.domain.ToDoList l_:lst0){
i0++;
if(!org.webdsl.tools.Utils.equal(l_.getAllowedUsers(),null)&&l_.getAllowedUsers().contains(ent_User_renamedthis0_)){
filtered0.add(l_);
}
}
lst0=filtered0;
int i1=-1;
for(webdsl.generated.domain.ToDoList l_:lst0){
i1++;
res_.add(l_);
}
}
else {}
return res_;
}
}
