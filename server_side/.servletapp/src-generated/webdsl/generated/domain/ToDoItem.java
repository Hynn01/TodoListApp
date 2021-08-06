package webdsl.generated.domain;
import javax.persistence.*;import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_ToDoItem")@org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class ToDoItem implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
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
public  ToDoItem(){}
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
thepage.invalidateAllPageCache("ToDoItem"+"."+prop);
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"ToDoItem"+"."+prop);
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
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("ToDoItem")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?ToDoItem.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):ToDoItem.class.cast(o)).getId(),getId());
}
public ToDoItem save(String webdslTypeName){
setVersion(1);
if(utils.ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public ToDoItem delete(){
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
return getId().compareTo(((ToDoItem)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("ToDoItem")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public ToDoItem setCreated(java.util.Date newitem){
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
public ToDoItem setModified(java.util.Date newitem){
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
public ToDoItem setName(String newitem){
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
@Temporal(TemporalType.DATE)@javax.persistence.Column(name="\"_duedate\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _duedate=null;
public java.util.Date getDuedate(){
return _duedate;
}
public boolean isDuedateUninitialized(){
return false;
}
public ToDoItem setDuedate(java.util.Date newitem){
if(!duedateBeingSet){
duedateBeingSet=true;
setChanged("duedate");
this.setDuedateDate_(newitem);
java.util.Date olditem=_duedate;
_duedate=newitem;
duedateBeingSet=false;
}
return this;
}
public void setDuedateNoEventsOrValidation(java.util.Date newitem){
setChanged("duedate");
java.util.Date olditem=_duedate;
_duedate=newitem;
}
@Transient boolean duedateBeingSet=false;
@javax.persistence.Column(name="\"_priority\"")@org.hibernate.annotations.AccessType(value="field")protected Integer _priority=0;
public Integer getPriority(){
return _priority;
}
public boolean isPriorityUninitialized(){
return false;
}
public ToDoItem setPriority(Integer newitem){
if(!priorityBeingSet){
priorityBeingSet=true;
setChanged("priority");
this.setPriorityInt_(newitem);
Integer olditem=_priority;
_priority=newitem;
priorityBeingSet=false;
}
return this;
}
public void setPriorityNoEventsOrValidation(Integer newitem){
setChanged("priority");
Integer olditem=_priority;
_priority=newitem;
}
@Transient boolean priorityBeingSet=false;
@javax.persistence.Column(name="\"_description\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected String _description="";
public String getDescription(){
return _description;
}
public boolean isDescriptionUninitialized(){
return false;
}
public ToDoItem setDescription(String newitem){
if(!descriptionBeingSet){
descriptionBeingSet=true;
setChanged("description");
this.setDescriptionString_(newitem);
String olditem=_description;
_description=newitem;
descriptionBeingSet=false;
}
return this;
}
public void setDescriptionNoEventsOrValidation(String newitem){
setChanged("description");
String olditem=_description;
_description=newitem;
}
@Transient boolean descriptionBeingSet=false;
@javax.persistence.Column(name="\"_tag\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected String _tag="";
public String getTag(){
return _tag;
}
public boolean isTagUninitialized(){
return false;
}
public ToDoItem setTag(String newitem){
if(!tagBeingSet){
tagBeingSet=true;
setChanged("tag");
this.setTagString_(newitem);
String olditem=_tag;
_tag=newitem;
tagBeingSet=false;
}
return this;
}
public void setTagNoEventsOrValidation(String newitem){
setChanged("tag");
String olditem=_tag;
_tag=newitem;
}
@Transient boolean tagBeingSet=false;
@javax.persistence.Column(name="\"_status\"")@org.hibernate.annotations.AccessType(value="field")protected Boolean _status=false;
public Boolean getStatus(){
return _status;
}
public boolean isStatusUninitialized(){
return false;
}
public ToDoItem setStatus(Boolean newitem){
if(!statusBeingSet){
statusBeingSet=true;
setChanged("status");
this.setStatusBool_(newitem);
Boolean olditem=_status;
_status=newitem;
statusBeingSet=false;
}
return this;
}
public void setStatusNoEventsOrValidation(Boolean newitem){
setChanged("status");
Boolean olditem=_status;
_status=newitem;
}
@Transient boolean statusBeingSet=false;
public String get_WebDslEntityType(){
return "ToDoItem";
}
public void validateStatus_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateStatus_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateStatus_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateTag_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getTag(),null)&&(!(org.webdsl.tools.Utils.equal(this.getTag().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getTag().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateTag_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateTag_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateDescription_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getDescription(),null)&&(!(org.webdsl.tools.Utils.equal(this.getDescription().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getDescription().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateDescription_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateDescription_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validatePriority_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validatePriority_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validatePriority_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateDuedate_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateDuedate_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateDuedate_internalValidationExceptionMultiple_(v_);
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
this.validateDescription_internalValidationExceptionMultiple_(v_);
this.validateDuedate_internalValidationExceptionMultiple_(v_);
this.validateName_internalValidationExceptionMultiple_(v_);
this.validatePriority_internalValidationExceptionMultiple_(v_);
this.validateStatus_internalValidationExceptionMultiple_(v_);
this.validateTag_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from ToDoItem").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from ToDoItem").list();
}
public static java.util.List<webdsl.generated.domain.ToDoItem> _static_findByName_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from ToDoItem as g where g._name = :param0").setParameter("param0",prop_).list();
}
public static java.util.List<webdsl.generated.domain.ToDoItem> _static_findByNameLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from ToDoItem as g where g._name like :param1").setParameter("param1",s_).list();
}
public static java.util.List<webdsl.generated.domain.ToDoItem> _static_findByDescription_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from ToDoItem as g where g._description = :param2").setParameter("param2",prop_).list();
}
public static java.util.List<webdsl.generated.domain.ToDoItem> _static_findByDescriptionLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from ToDoItem as g where g._description like :param3").setParameter("param3",s_).list();
}
public static java.util.List<webdsl.generated.domain.ToDoItem> _static_findByTag_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from ToDoItem as g where g._tag = :param4").setParameter("param4",prop_).list();
}
public static java.util.List<webdsl.generated.domain.ToDoItem> _static_findByTagLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from ToDoItem as g where g._tag like :param5").setParameter("param5",s_).list();
}
public static webdsl.generated.domain.ToDoItem _static_load_(java.util.UUID prop_){
return webdsl.generated.domain.ToDoItem._static_cast_(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"ToDoItem",prop_));
}
public webdsl.generated.domain.ToDoItem ToDoItem$this_(){
this.ToDoItem_();
return this;
}
public void ToDoItem_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setNameString_(String value_){}
public void setDuedateDate_(java.util.Date value_){}
public void setPriorityInt_(Integer value_){}
public void setDescriptionString_(String value_){}
public void setTagString_(String value_){}
public void setStatusBool_(Boolean value_){}
public static ToDoItem _static_createEmpty_(){
ToDoItem ent=new ToDoItem();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static ToDoItem _static_cast_(Object o){
return (ToDoItem)org.webdsl.tools.Utils.cast(o,ToDoItem.class);
}
}
