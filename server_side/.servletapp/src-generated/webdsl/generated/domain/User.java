package webdsl.generated.domain;
import webdsl.generated.search.UserSearcher;
import javax.persistence.*;import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_User")@org.hibernate.search.annotations.Indexed @org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class User implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
public static java.util.List<webdsl.generated.domain.User> _static_searchUser_(String searchQuery){
return _static_searchUser_(searchQuery,1000,0);
}
public static java.util.List<webdsl.generated.domain.User> _static_searchUser_(String searchQuery,int limit){
return _static_searchUser_(searchQuery,limit,0);
}
public static java.util.List<webdsl.generated.domain.User> _static_searchUser_(String searchQuery,int limit,int offset){
return new UserSearcher().query(searchQuery).setOffset(offset).setLimit(limit).results();
}
public void validateDelete(){
java.util.List<utils.ValidationException> exceptions=new java.util.LinkedList<utils.ValidationException>();
if(exceptions.size()>0){
throw new utils.MultipleValidationExceptions(exceptions);
}
}
public void validateSave(){
webdsl.generated.domain.ValidationExceptionMultiple mex=this.validateSave_();
java.util.List<webdsl.generated.domain.ValidationException> ex=mex.getExceptions();
java.util.List<utils.ValidationException> exceptions=new java.util.LinkedList<utils.ValidationException>();
for(webdsl.generated.domain.ValidationException v:ex){
exceptions.add(new utils.ValidationException(null,v.getMessage()));
}
if(exceptions.size()>0){
throw new utils.MultipleValidationExceptions(exceptions);
}
}
public  User(){}
transient protected org.hibernate.bytecode.javassist.FieldHandler fieldHandler;
transient protected java.util.Set<String> uninitializedLazyProperties=null;
public org.hibernate.bytecode.javassist.FieldHandler getFieldHandler(){
return fieldHandler;
}
public boolean removeUninitializedLazyProperty(String name){
return uninitializedLazyProperties!=null&&uninitializedLazyProperties.remove(name);
}
public void setFieldHandler(org.hibernate.bytecode.javassist.FieldHandler fieldHandler){
this.fieldHandler=fieldHandler;
java.util.Set fieldHandlerUninit=((org.hibernate.intercept.javassist.FieldInterceptorImpl)fieldHandler).getUninitializedFields();
if(fieldHandlerUninit!=null){
this.uninitializedLazyProperties=new java.util.HashSet<String>(fieldHandlerUninit);
}
}
@javax.persistence.Id @org.hibernate.annotations.Type(type="utils.UUIDUserType")@javax.persistence.Column(name="id",length=32)@org.hibernate.search.annotations.DocumentId @org.hibernate.search.annotations.FieldBridge(impl=utils.UUIDFieldBridge.class)protected java.util.UUID _id=null;
public java.util.UUID getId(){
return _id;
}
public org.webdsl.WebDSLEntity setId(java.util.UUID idarg){
this._id=idarg;
return this;
}
public String getNaturalId(){
return _id.toString();
}
@Version @Column(name="version_opt_lock")protected Integer _version=0;
public Integer getVersion(){
return _version;
}
public org.webdsl.WebDSLEntity setVersion(Integer v){
this._version=v;
setChanged(v==1?"save()":"version");
return this;
}
@Transient boolean versionWasIncreased=false;
public void increaseVersion(){
if(!versionWasIncreased){
_version++;
versionWasIncreased=true;
setChanged("version");
}
}
@Transient protected boolean isChanged=false;
public boolean isChanged(){
return isChanged;
}
public void setChanged(String prop){
if(_version>0){
utils.AbstractPageServlet thepage=utils.ThreadLocalPage.get();
if(thepage!=null){
thepage.setHasWrites(true);
if(!thepage.invalidateAllPageCache){
thepage.invalidateAllPageCache("User"+"."+prop);
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"User"+"."+prop);
utils.Warning.printSmallStackTrace(5);
}
else {
utils.HibernateUtil.getCurrentSession().setFlushMode(org.hibernate.FlushMode.AUTO);
}
}
if(!isChanged){
isChanged=true;
if(fieldHandler!=null){
((org.hibernate.intercept.FieldInterceptor)fieldHandler).dirty();
}
}
}
@Transient protected boolean isRequestVar=false;
public boolean isRequestVar(){
return isRequestVar;
}
public void setRequestVar(){
isRequestVar=true;
}
public boolean equals(Object o){
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("User")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?User.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):User.class.cast(o)).getId(),getId());
}
public User save(String webdslTypeName){
setVersion(1);
if(utils.ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public User delete(){
validateDelete();
setChanged("delete()");
utils.HibernateUtil.getCurrentSession().delete(this);
return this;
}
public int hashCode(){
if(getId()==null)return super.hashCode();
else return getId().hashCode();
}
public int compareTo(org.webdsl.WebDSLEntity o){
return getId().compareTo(((User)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("User")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public User setCreated(java.util.Date newitem){
if(!createdBeingSet){
createdBeingSet=true;
setChanged("created");
this.setCreatedDateTime_(newitem);
java.util.Date olditem=_created;
_created=newitem;
createdBeingSet=false;
}
return this;
}
public void setCreatedNoEventsOrValidation(java.util.Date newitem){
setChanged("created");
java.util.Date olditem=_created;
_created=newitem;
}
@Transient boolean createdBeingSet=false;
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_modified\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _modified=null;
public java.util.Date getModified(){
return _modified;
}
public boolean isModifiedUninitialized(){
return false;
}
public User setModified(java.util.Date newitem){
if(!modifiedBeingSet){
modifiedBeingSet=true;
setChanged("modified");
this.setModifiedDateTime_(newitem);
java.util.Date olditem=_modified;
_modified=newitem;
modifiedBeingSet=false;
}
return this;
}
public void setModifiedNoEventsOrValidation(java.util.Date newitem){
setChanged("modified");
java.util.Date olditem=_modified;
_modified=newitem;
}
@Transient boolean modifiedBeingSet=false;
@javax.persistence.Column(name="\"_username\"",length=255)@org.hibernate.annotations.AccessType(value="field")@org.hibernate.search.annotations.Fields({@org.hibernate.search.annotations.Field(analyzer=@org.hibernate.search.annotations.Analyzer(definition="default"),name="username")})protected String _username="";
public String getUsername(){
return _username;
}
public boolean isUsernameUninitialized(){
return false;
}
public User setUsername(String newitem){
if(!usernameBeingSet){
usernameBeingSet=true;
setChanged("username");
this.setUsernameString_(newitem);
String olditem=_username;
_username=newitem;
usernameBeingSet=false;
}
return this;
}
public void setUsernameNoEventsOrValidation(String newitem){
setChanged("username");
String olditem=_username;
_username=newitem;
}
@Transient boolean usernameBeingSet=false;
@javax.persistence.Column(name="\"_password\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected String _password="";
public String getPassword(){
return _password;
}
public boolean isPasswordUninitialized(){
return false;
}
public User setPassword(String newitem){
if(!passwordBeingSet){
passwordBeingSet=true;
setChanged("password");
this.setPasswordSecret_(newitem);
String olditem=_password;
_password=newitem;
passwordBeingSet=false;
}
return this;
}
public void setPasswordNoEventsOrValidation(String newitem){
setChanged("password");
String olditem=_password;
_password=newitem;
}
@Transient boolean passwordBeingSet=false;
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="User_todolists_ToDoList")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.IndexColumn(name="\"Usertodolistsindex\"",base=0)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.List<webdsl.generated.domain.ToDoList> _todolists=new webdsl.generated.domain.UserTodolistsList(this);
public java.util.List<webdsl.generated.domain.ToDoList> getTodolists(){
return _todolists;
}
public boolean isTodolistsUninitialized(){
return _todolists instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_todolists).wasInitialized();
}
public User setTodolists(java.util.List<webdsl.generated.domain.ToDoList> newitem){
setChanged("todolists");
_todolists=newitem;
return this;
}
@Transient boolean todolistsBeingSet=false;
public java.util.List<webdsl.generated.domain.ToDoList> getTodolistsList(){
return new java.util.ArrayList(getTodolists());
}
public void setTodolistsList(java.util.List<webdsl.generated.domain.ToDoList> list1){
setChanged("todolists");
setTodolists(new webdsl.generated.domain.UserTodolistsList(this,list1));
}
public int getTodolistsLength(){
return getTodolists().size();
}
public void removeFromTodolists(webdsl.generated.domain.ToDoList item){
setChanged("todolists");
getTodolists().remove(item);
}
public void replaceAllInTodolists(java.util.Collection<webdsl.generated.domain.ToDoList> col){
removeAllFromTodolists();
addAllToTodolists(col);
}
public void removeAllFromTodolists(){
org.hibernate.Hibernate.initialize(getTodolists());
java.util.Iterator<webdsl.generated.domain.ToDoList> itt=getTodolists().iterator();
java.util.List<webdsl.generated.domain.ToDoList> copy=new java.util.ArrayList(getTodolists());
while(itt.hasNext()){
itt.next();
itt.remove();
}
itt=copy.iterator();
while(itt.hasNext()){
removeFromTodolists(itt.next());
}
}
public void addToTodolists(webdsl.generated.domain.ToDoList item){
setChanged("todolists");
getTodolists().add(item);
if(_version>0){
item._version=Math.max(1,item._version);
}
}
public java.util.List<webdsl.generated.domain.ToDoList> addAllToTodolists(java.util.Collection<webdsl.generated.domain.ToDoList> col){
java.util.List<webdsl.generated.domain.ToDoList> copy=new java.util.ArrayList<webdsl.generated.domain.ToDoList>(col);
java.util.Iterator<webdsl.generated.domain.ToDoList> it=copy.iterator();
while(it.hasNext()){
addToTodolists(it.next());
}
return getTodolists();
}
public void setInTodolists(int index,webdsl.generated.domain.ToDoList newitem){
getTodolists().set(index,newitem);
}
public void insertInTodolists(int index,webdsl.generated.domain.ToDoList item){
getTodolists().add(index,item);
}
public void removeAtTodolists(int index){
getTodolists().remove(index);
}
public java.util.List<webdsl.generated.domain.ToDoList> getSharedTodolists(){
return webdsl.generated.functions.ent_User_listCompr0User_.ent_User_listCompr0User_(this);
}
public java.util.List<webdsl.generated.domain.ToDoList> getSharedTodolistsList(){
return new java.util.ArrayList(getSharedTodolists());
}
public int getSharedTodolistsLength(){
return getSharedTodolists().size();
}
public String getName(){
if(getId()!=null){
return getId().toString();
}
else {
return "";
}
}
public String get_WebDslEntityType(){
return "User";
}
public java.util.List<webdsl.generated.domain.ToDoList> allowedTodolists_(){
return (java.util.List<webdsl.generated.domain.ToDoList>)(java.util.List<?>)webdsl.generated.domain.ToDoList.$static$all_();
}
public void validateTodolists_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateTodolists_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateTodolists_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validatePassword_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getPassword(),null)&&(!(org.webdsl.tools.Utils.equal(this.getPassword().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getPassword().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validatePassword_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validatePassword_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateUsername_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getUsername(),null)&&(!(org.webdsl.tools.Utils.equal(this.getUsername().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getUsername().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateUsername_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateUsername_internalValidationExceptionMultiple_(v_);
return v_;
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validatePassword_internalValidationExceptionMultiple_(v_);
this.validateTodolists_internalValidationExceptionMultiple_(v_);
this.validateUsername_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from User").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from User").list();
}
public static java.util.List<webdsl.generated.domain.User> _static_findByUsername_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from User as g where g._username = :param0").setParameter("param0",prop_).list();
}
public static java.util.List<webdsl.generated.domain.User> _static_findByUsernameLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from User as g where g._username like :param1").setParameter("param1",s_).list();
}
public static java.util.List<webdsl.generated.domain.User> _static_findByPassword_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from User as g where g._password = :param2").setParameter("param2",prop_).list();
}
public static java.util.List<webdsl.generated.domain.User> _static_findByPasswordLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from User as g where g._password like :param3").setParameter("param3",s_).list();
}
public static webdsl.generated.domain.User _static_load_(java.util.UUID prop_){
return webdsl.generated.domain.User._static_cast_(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"User",prop_));
}
public webdsl.generated.domain.User User$this_(){
this.User_();
return this;
}
public void User_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setUsernameString_(String value_){}
public void setPasswordSecret_(String value_){}
public webdsl.generated.domain.User replaceAllTodolistsLToDoListL_(java.util.List<webdsl.generated.domain.ToDoList> value_){
this.replaceAllInTodolists(value_);
return this;
}
public void removeFromTodolistsToDoList_(webdsl.generated.domain.ToDoList value_){}
public void addToTodolistsToDoList_(webdsl.generated.domain.ToDoList value_){}
public static User _static_createEmpty_(){
User ent=new User();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static User _static_cast_(Object o){
return (User)org.webdsl.tools.Utils.cast(o,User.class);
}
}
