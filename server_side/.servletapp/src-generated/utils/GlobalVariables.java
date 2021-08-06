package utils;
@SuppressWarnings({"unused","unchecked"})public class GlobalVariables{
private static org.hibernate.Session hibSession;
private static org.webdsl.lang.Environment env;
private static java.io.PrintWriter out=null;
private static java.util.UUID globalfitemId=null;
public static webdsl.generated.domain.ToDoItem getGlobalfitem(org.hibernate.Session hibSession){
webdsl.generated.domain.ToDoItem globalfitem=(webdsl.generated.domain.ToDoItem)hibSession.load(webdsl.generated.domain.ToDoItem.class,globalfitemId);
return globalfitem;
}
private static java.util.UUID globalflistId=null;
public static webdsl.generated.domain.ToDoList getGlobalflist(org.hibernate.Session hibSession){
webdsl.generated.domain.ToDoList globalflist=(webdsl.generated.domain.ToDoList)hibSession.load(webdsl.generated.domain.ToDoList.class,globalflistId);
return globalflist;
}
private static webdsl.generated.domain.ToDoItem globalfitem=null;
private static void globalDeclarationGlobalfitem(){
try{
globalfitem=webdsl.generated.domain.ToDoItem._static_createEmpty_();
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationGlobalfitemPersist(){
utils.HibernateUtil.getCurrentSession().save(globalfitem);
ApplicationContextProperty id0=new ApplicationContextProperty();
id0.setName("globalfitem");
id0.setDatabaseId(globalfitem.getId());
utils.HibernateUtil.getCurrentSession().save(id0);
utils.GlobalVariables.globalfitemId=id0.getDatabaseId();
globalfitem.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
globalfitem=null;
}
private static webdsl.generated.domain.ToDoList globalflist=null;
private static void globalDeclarationGlobalflist(){
try{
globalflist=webdsl.generated.domain.ToDoList._static_createEmpty_();
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationGlobalflistPersist(){
utils.HibernateUtil.getCurrentSession().save(globalflist);
ApplicationContextProperty id1=new ApplicationContextProperty();
id1.setName("globalflist");
id1.setDatabaseId(globalflist.getId());
utils.HibernateUtil.getCurrentSession().save(id1);
utils.GlobalVariables.globalflistId=id1.getDatabaseId();
globalflist.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
globalflist=null;
}
static boolean applicationContextPropertyExists(String name,java.util.List<ApplicationContextProperty> res){
for(ApplicationContextProperty a:res){
if(a.getName().equals(name))return true;
}
return false;
}
public static boolean globalvarsChecked=false;
public static void forceLoad(){
globalvarsChecked=false;
load();
}
public static void load(){
if(!globalvarsChecked){
out=new java.io.PrintWriter(System.out);
utils.ThreadLocalOut.push(out);
globalfitem=webdsl.generated.domain.ToDoItem._static_createEmpty_();
globalflist=webdsl.generated.domain.ToDoList._static_createEmpty_();
org.hibernate.Session hibSession=utils.HibernateUtil.getCurrentSession();
utils.AbstractPageServlet ps=utils.ThreadLocalPage.get();
env=ps.envGlobalAndSession;
org.hibernate.Query q=utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty");
java.util.List<ApplicationContextProperty> res=q.list();
if(!applicationContextPropertyExists("globalfitem",res)){
env.putGlobalVariable("globalfitem",globalfitem);
}
if(!applicationContextPropertyExists("globalflist",res)){
env.putGlobalVariable("globalflist",globalflist);
}
if(!applicationContextPropertyExists("globalfitem",res))globalDeclarationGlobalfitem();
if(!applicationContextPropertyExists("globalflist",res))globalDeclarationGlobalflist();
if(!applicationContextPropertyExists("globalfitem",res))globalDeclarationGlobalfitemPersist();
if(!applicationContextPropertyExists("globalflist",res))globalDeclarationGlobalflistPersist();
org.hibernate.Query q2=utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty");
java.util.List<ApplicationContextProperty> results=q2.list();
for(ApplicationContextProperty a:results){
if(a.getName().equals("globalfitem")){
globalfitemId=a.getDatabaseId();
}
if(a.getName().equals("globalflist")){
globalflistId=a.getDatabaseId();
}
}
hibSession=null;
utils.ThreadLocalOut.popChecked(out);
out=null;
globalvarsChecked=true;
}
}
public static boolean initGlobalVars(org.webdsl.lang.Environment env,org.hibernate.Session hibSession){
env.putGlobalVariable("globalfitem",utils.GlobalVariables.getGlobalfitem(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("globalfitem")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("globalflist",utils.GlobalVariables.getGlobalflist(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("globalflist")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
return true;
}
}
