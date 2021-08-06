package webdsl.generated.domain;
import javax.persistence.*;import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_ToDoList")@org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class ToDoList implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
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
public  ToDoList(){}
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
thepage.invalidateAllPageCache("ToDoList"+"."+prop);
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"ToDoList"+"."+prop);
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
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("ToDoList")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?ToDoList.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):ToDoList.class.cast(o)).getId(),getId());
}
public ToDoList save(String webdslTypeName){
setVersion(1);
if(utils.ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public ToDoList delete(){
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
return getId().compareTo(((ToDoList)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("ToDoList")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public ToDoList setCreated(java.util.Date newitem){
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
public ToDoList setModified(java.util.Date newitem){
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
@javax.persistence.Column(name="\"_name\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected String _name="";
public String getName(){
return _name;
}
public boolean isNameUninitialized(){
return false;
}
public ToDoList setName(String newitem){
if(!nameBeingSet){
nameBeingSet=true;
setChanged("name");
this.setNameString_(newitem);
String olditem=_name;
_name=newitem;
nameBeingSet=false;
}
return this;
}
public void setNameNoEventsOrValidation(String newitem){
setChanged("name");
String olditem=_name;
_name=newitem;
}
@Transient boolean nameBeingSet=false;
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"ToDoList_author\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.User _author=null;
public webdsl.generated.domain.User getAuthor(){
return _author;
}
public boolean isAuthorUninitialized(){
return _author instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_author).getHibernateLazyInitializer().isUninitialized();
}
public ToDoList setAuthor(webdsl.generated.domain.User newitem){
if(!authorBeingSet){
authorBeingSet=true;
setChanged("author");
this.setAuthorUser_(newitem);
webdsl.generated.domain.User olditem=_author;
_author=newitem;
authorBeingSet=false;
}
return this;
}
public void setAuthorNoEventsOrValidation(webdsl.generated.domain.User newitem){
setChanged("author");
webdsl.generated.domain.User olditem=_author;
_author=newitem;
}
@Transient boolean authorBeingSet=false;
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="ToDoList_allowedUsers_User")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.IndexColumn(name="\"ToDoListallowedUsersindex\"",base=0)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.List<webdsl.generated.domain.User> _allowedUsers=new webdsl.generated.domain.ToDoListAllowedUsersList(this);
public java.util.List<webdsl.generated.domain.User> getAllowedUsers(){
return _allowedUsers;
}
public boolean isAllowedUsersUninitialized(){
return _allowedUsers instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_allowedUsers).wasInitialized();
}
public ToDoList setAllowedUsers(java.util.List<webdsl.generated.domain.User> newitem){
setChanged("allowedUsers");
_allowedUsers=newitem;
return this;
}
@Transient boolean allowedUsersBeingSet=false;
public java.util.List<webdsl.generated.domain.User> getAllowedUsersList(){
return new java.util.ArrayList(getAllowedUsers());
}
public void setAllowedUsersList(java.util.List<webdsl.generated.domain.User> list1){
setChanged("allowedUsers");
setAllowedUsers(new webdsl.generated.domain.ToDoListAllowedUsersList(this,list1));
}
public int getAllowedUsersLength(){
return getAllowedUsers().size();
}
public void removeFromAllowedUsers(webdsl.generated.domain.User item){
setChanged("allowedUsers");
getAllowedUsers().remove(item);
}
public void replaceAllInAllowedUsers(java.util.Collection<webdsl.generated.domain.User> col){
removeAllFromAllowedUsers();
addAllToAllowedUsers(col);
}
public void removeAllFromAllowedUsers(){
org.hibernate.Hibernate.initialize(getAllowedUsers());
java.util.Iterator<webdsl.generated.domain.User> itt=getAllowedUsers().iterator();
java.util.List<webdsl.generated.domain.User> copy=new java.util.ArrayList(getAllowedUsers());
while(itt.hasNext()){
itt.next();
itt.remove();
}
itt=copy.iterator();
while(itt.hasNext()){
removeFromAllowedUsers(itt.next());
}
}
public void addToAllowedUsers(webdsl.generated.domain.User item){
setChanged("allowedUsers");
getAllowedUsers().add(item);
if(_version>0){
item._version=Math.max(1,item._version);
}
}
public java.util.List<webdsl.generated.domain.User> addAllToAllowedUsers(java.util.Collection<webdsl.generated.domain.User> col){
java.util.List<webdsl.generated.domain.User> copy=new java.util.ArrayList<webdsl.generated.domain.User>(col);
java.util.Iterator<webdsl.generated.domain.User> it=copy.iterator();
while(it.hasNext()){
addToAllowedUsers(it.next());
}
return getAllowedUsers();
}
public void setInAllowedUsers(int index,webdsl.generated.domain.User newitem){
getAllowedUsers().set(index,newitem);
}
public void insertInAllowedUsers(int index,webdsl.generated.domain.User item){
getAllowedUsers().add(index,item);
}
public void removeAtAllowedUsers(int index){
getAllowedUsers().remove(index);
}
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="ToDoList_todoitems_ToDoItem")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.IndexColumn(name="\"ToDoListtodoitemsindex\"",base=0)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.List<webdsl.generated.domain.ToDoItem> _todoitems=new webdsl.generated.domain.ToDoListTodoitemsList(this);
public java.util.List<webdsl.generated.domain.ToDoItem> getTodoitems(){
return _todoitems;
}
public boolean isTodoitemsUninitialized(){
return _todoitems instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_todoitems).wasInitialized();
}
public ToDoList setTodoitems(java.util.List<webdsl.generated.domain.ToDoItem> newitem){
setChanged("todoitems");
_todoitems=newitem;
return this;
}
@Transient boolean todoitemsBeingSet=false;
public java.util.List<webdsl.generated.domain.ToDoItem> getTodoitemsList(){
return new java.util.ArrayList(getTodoitems());
}
public void setTodoitemsList(java.util.List<webdsl.generated.domain.ToDoItem> list2){
setChanged("todoitems");
setTodoitems(new webdsl.generated.domain.ToDoListTodoitemsList(this,list2));
}
public int getTodoitemsLength(){
return getTodoitems().size();
}
public void removeFromTodoitems(webdsl.generated.domain.ToDoItem item){
setChanged("todoitems");
getTodoitems().remove(item);
}
public void replaceAllInTodoitems(java.util.Collection<webdsl.generated.domain.ToDoItem> col){
removeAllFromTodoitems();
addAllToTodoitems(col);
}
public void removeAllFromTodoitems(){
org.hibernate.Hibernate.initialize(getTodoitems());
java.util.Iterator<webdsl.generated.domain.ToDoItem> itt=getTodoitems().iterator();
java.util.List<webdsl.generated.domain.ToDoItem> copy=new java.util.ArrayList(getTodoitems());
while(itt.hasNext()){
itt.next();
itt.remove();
}
itt=copy.iterator();
while(itt.hasNext()){
removeFromTodoitems(itt.next());
}
}
public void addToTodoitems(webdsl.generated.domain.ToDoItem item){
setChanged("todoitems");
getTodoitems().add(item);
if(_version>0){
item._version=Math.max(1,item._version);
}
}
public java.util.List<webdsl.generated.domain.ToDoItem> addAllToTodoitems(java.util.Collection<webdsl.generated.domain.ToDoItem> col){
java.util.List<webdsl.generated.domain.ToDoItem> copy=new java.util.ArrayList<webdsl.generated.domain.ToDoItem>(col);
java.util.Iterator<webdsl.generated.domain.ToDoItem> it=copy.iterator();
while(it.hasNext()){
addToTodoitems(it.next());
}
return getTodoitems();
}
public void setInTodoitems(int index,webdsl.generated.domain.ToDoItem newitem){
getTodoitems().set(index,newitem);
}
public void insertInTodoitems(int index,webdsl.generated.domain.ToDoItem item){
getTodoitems().add(index,item);
}
public void removeAtTodoitems(int index){
getTodoitems().remove(index);
}
public String get_WebDslEntityType(){
return "ToDoList";
}
public java.util.List<webdsl.generated.domain.ToDoItem> allowedTodoitems_(){
return (java.util.List<webdsl.generated.domain.ToDoItem>)(java.util.List<?>)webdsl.generated.domain.ToDoItem.$static$all_();
}
public java.util.List<webdsl.generated.domain.User> allowedAllowedUsers_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public java.util.List<webdsl.generated.domain.User> allowedAuthor_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public void validateTodoitems_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateTodoitems_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateTodoitems_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateAllowedUsers_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateAllowedUsers_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateAllowedUsers_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateAuthor_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateAuthor_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateAuthor_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateName_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getName(),null)&&(!(org.webdsl.tools.Utils.equal(this.getName().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getName().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateName_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateName_internalValidationExceptionMultiple_(v_);
return v_;
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateAllowedUsers_internalValidationExceptionMultiple_(v_);
this.validateAuthor_internalValidationExceptionMultiple_(v_);
this.validateName_internalValidationExceptionMultiple_(v_);
this.validateTodoitems_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from ToDoList").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from ToDoList").list();
}
public static java.util.List<webdsl.generated.domain.ToDoList> _static_findByName_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from ToDoList as g where g._name = :param0").setParameter("param0",prop_).list();
}
public static java.util.List<webdsl.generated.domain.ToDoList> _static_findByNameLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from ToDoList as g where g._name like :param1").setParameter("param1",s_).list();
}
public static webdsl.generated.domain.ToDoList _static_load_(java.util.UUID prop_){
return webdsl.generated.domain.ToDoList._static_cast_(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"ToDoList",prop_));
}
public webdsl.generated.domain.ToDoList ToDoList$this_(){
this.ToDoList_();
return this;
}
public void ToDoList_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setNameString_(String value_){}
public void setAuthorUser_(webdsl.generated.domain.User value_){}
public webdsl.generated.domain.ToDoList replaceAllAllowedUsersLUserL_(java.util.List<webdsl.generated.domain.User> value_){
this.replaceAllInAllowedUsers(value_);
return this;
}
public void removeFromAllowedUsersUser_(webdsl.generated.domain.User value_){}
public void addToAllowedUsersUser_(webdsl.generated.domain.User value_){}
public webdsl.generated.domain.ToDoList replaceAllTodoitemsLToDoItemL_(java.util.List<webdsl.generated.domain.ToDoItem> value_){
this.replaceAllInTodoitems(value_);
return this;
}
public void removeFromTodoitemsToDoItem_(webdsl.generated.domain.ToDoItem value_){}
public void addToTodoitemsToDoItem_(webdsl.generated.domain.ToDoItem value_){}
public static ToDoList _static_createEmpty_(){
ToDoList ent=new ToDoList();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static ToDoList _static_cast_(Object o){
return (ToDoList)org.webdsl.tools.Utils.cast(o,ToDoList.class);
}
}
