package webdsl.generated.domain;
import javax.persistence.*;import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_SessionManager")@org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class SessionManager implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
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
public  SessionManager(){}
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
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"SessionManager"+"."+prop);
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
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("SessionManager")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?SessionManager.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):SessionManager.class.cast(o)).getId(),getId());
}
public SessionManager save(String webdslTypeName){
setVersion(1);
if(utils.ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public SessionManager delete(){
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
return getId().compareTo(((SessionManager)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("SessionManager")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public SessionManager setCreated(java.util.Date newitem){
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
public SessionManager setModified(java.util.Date newitem){
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
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="SessionManager_messages_SessionMessage")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.IndexColumn(name="\"SessionManagermessagesindex\"",base=0)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.List<webdsl.generated.domain.SessionMessage> _messages=new webdsl.generated.domain.SessionManagerMessagesList(this);
public java.util.List<webdsl.generated.domain.SessionMessage> getMessages(){
return _messages;
}
public boolean isMessagesUninitialized(){
return _messages instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_messages).wasInitialized();
}
public SessionManager setMessages(java.util.List<webdsl.generated.domain.SessionMessage> newitem){
setChanged("messages");
_messages=newitem;
return this;
}
@Transient boolean messagesBeingSet=false;
public java.util.List<webdsl.generated.domain.SessionMessage> getMessagesList(){
return new java.util.ArrayList(getMessages());
}
public void setMessagesList(java.util.List<webdsl.generated.domain.SessionMessage> list1){
setChanged("messages");
setMessages(new webdsl.generated.domain.SessionManagerMessagesList(this,list1));
}
public int getMessagesLength(){
return getMessages().size();
}
public void removeFromMessages(webdsl.generated.domain.SessionMessage item){
setChanged("messages");
getMessages().remove(item);
}
public void replaceAllInMessages(java.util.Collection<webdsl.generated.domain.SessionMessage> col){
removeAllFromMessages();
addAllToMessages(col);
}
public void removeAllFromMessages(){
org.hibernate.Hibernate.initialize(getMessages());
java.util.Iterator<webdsl.generated.domain.SessionMessage> itt=getMessages().iterator();
java.util.List<webdsl.generated.domain.SessionMessage> copy=new java.util.ArrayList(getMessages());
while(itt.hasNext()){
itt.next();
itt.remove();
}
itt=copy.iterator();
while(itt.hasNext()){
removeFromMessages(itt.next());
}
}
public void addToMessages(webdsl.generated.domain.SessionMessage item){
setChanged("messages");
getMessages().add(item);
if(_version>0){
item._version=Math.max(1,item._version);
}
}
public java.util.List<webdsl.generated.domain.SessionMessage> addAllToMessages(java.util.Collection<webdsl.generated.domain.SessionMessage> col){
java.util.List<webdsl.generated.domain.SessionMessage> copy=new java.util.ArrayList<webdsl.generated.domain.SessionMessage>(col);
java.util.Iterator<webdsl.generated.domain.SessionMessage> it=copy.iterator();
while(it.hasNext()){
addToMessages(it.next());
}
return getMessages();
}
public void setInMessages(int index,webdsl.generated.domain.SessionMessage newitem){
getMessages().set(index,newitem);
}
public void insertInMessages(int index,webdsl.generated.domain.SessionMessage item){
getMessages().add(index,item);
}
public void removeAtMessages(int index){
getMessages().remove(index);
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_lastUse\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _lastUse=null;
public java.util.Date getLastUse(){
return _lastUse;
}
public boolean isLastUseUninitialized(){
return false;
}
public SessionManager setLastUse(java.util.Date newitem){
if(!lastUseBeingSet){
lastUseBeingSet=true;
setChanged("lastUse");
this.setLastUseDateTime_(newitem);
java.util.Date olditem=_lastUse;
_lastUse=newitem;
lastUseBeingSet=false;
}
return this;
}
public void setLastUseNoEventsOrValidation(java.util.Date newitem){
setChanged("lastUse");
java.util.Date olditem=_lastUse;
_lastUse=newitem;
}
@Transient boolean lastUseBeingSet=false;
@javax.persistence.Column(name="\"_logsqlMessage\"",length=1000000)@org.hibernate.annotations.AccessType(value="field")protected String _logsqlMessage="";
public String getLogsqlMessage(){
return _logsqlMessage;
}
public boolean isLogsqlMessageUninitialized(){
return false;
}
public SessionManager setLogsqlMessage(String newitem){
if(!logsqlMessageBeingSet){
logsqlMessageBeingSet=true;
setChanged("logsqlMessage");
this.setLogsqlMessageText_(newitem);
String olditem=_logsqlMessage;
_logsqlMessage=newitem;
logsqlMessageBeingSet=false;
}
return this;
}
public void setLogsqlMessageNoEventsOrValidation(String newitem){
setChanged("logsqlMessage");
String olditem=_logsqlMessage;
_logsqlMessage=newitem;
}
@Transient boolean logsqlMessageBeingSet=false;
@javax.persistence.Column(name="\"_stayLoggedIn\"")@org.hibernate.annotations.AccessType(value="field")protected Boolean _stayLoggedIn=false;
public Boolean getStayLoggedIn(){
return _stayLoggedIn;
}
public boolean isStayLoggedInUninitialized(){
return false;
}
public SessionManager setStayLoggedIn(Boolean newitem){
if(!stayLoggedInBeingSet){
stayLoggedInBeingSet=true;
setChanged("stayLoggedIn");
this.setStayLoggedInBool_(newitem);
Boolean olditem=_stayLoggedIn;
_stayLoggedIn=newitem;
stayLoggedInBeingSet=false;
}
return this;
}
public void setStayLoggedInNoEventsOrValidation(Boolean newitem){
setChanged("stayLoggedIn");
Boolean olditem=_stayLoggedIn;
_stayLoggedIn=newitem;
}
@Transient boolean stayLoggedInBeingSet=false;
@javax.persistence.Column(name="\"_sessionHasChanges\"")@org.hibernate.annotations.AccessType(value="field")protected Boolean _sessionHasChanges=false;
public Boolean getSessionHasChanges(){
return _sessionHasChanges;
}
public boolean isSessionHasChangesUninitialized(){
return false;
}
public SessionManager setSessionHasChanges(Boolean newitem){
if(!sessionHasChangesBeingSet){
sessionHasChangesBeingSet=true;
setChanged("sessionHasChanges");
this.setSessionHasChangesBool_(newitem);
Boolean olditem=_sessionHasChanges;
_sessionHasChanges=newitem;
sessionHasChangesBeingSet=false;
}
return this;
}
public void setSessionHasChangesNoEventsOrValidation(Boolean newitem){
setChanged("sessionHasChanges");
Boolean olditem=_sessionHasChanges;
_sessionHasChanges=newitem;
}
@Transient boolean sessionHasChangesBeingSet=false;
@javax.persistence.Column(name="\"_domain\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected String _domain="";
public String getDomain(){
return _domain;
}
public boolean isDomainUninitialized(){
return false;
}
public SessionManager setDomain(String newitem){
if(!domainBeingSet){
domainBeingSet=true;
setChanged("domain");
this.setDomainString_(newitem);
String olditem=_domain;
_domain=newitem;
domainBeingSet=false;
}
return this;
}
public void setDomainNoEventsOrValidation(String newitem){
setChanged("domain");
String olditem=_domain;
_domain=newitem;
}
@Transient boolean domainBeingSet=false;
@org.hibernate.annotations.Type(type="utils.UUIDUserType")@javax.persistence.Column(name="\"_cookieValue\"",length=32)@org.hibernate.annotations.AccessType(value="field")protected java.util.UUID _cookieValue=null;
public java.util.UUID getCookieValue(){
return _cookieValue;
}
public boolean isCookieValueUninitialized(){
return false;
}
public SessionManager setCookieValue(java.util.UUID newitem){
if(!cookieValueBeingSet){
cookieValueBeingSet=true;
setChanged("cookieValue");
this.setCookieValueUUID_(newitem);
java.util.UUID olditem=_cookieValue;
_cookieValue=newitem;
cookieValueBeingSet=false;
}
return this;
}
public void setCookieValueNoEventsOrValidation(java.util.UUID newitem){
setChanged("cookieValue");
java.util.UUID olditem=_cookieValue;
_cookieValue=newitem;
}
@Transient boolean cookieValueBeingSet=false;
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"SessionManager_securityContext\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.ALL,org.hibernate.annotations.CascadeType.DELETE_ORPHAN})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.SecurityContext _securityContext=null;
public webdsl.generated.domain.SecurityContext getSecurityContext(){
return _securityContext;
}
public boolean isSecurityContextUninitialized(){
return _securityContext instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_securityContext).getHibernateLazyInitializer().isUninitialized();
}
public SessionManager setSecurityContext(webdsl.generated.domain.SecurityContext newitem){
if(!securityContextBeingSet){
securityContextBeingSet=true;
setChanged("securityContext");
this.setSecurityContextSecurityContext_(newitem);
webdsl.generated.domain.SecurityContext olditem=_securityContext;
_securityContext=newitem;
securityContextBeingSet=false;
}
return this;
}
public void setSecurityContextNoEventsOrValidation(webdsl.generated.domain.SecurityContext newitem){
setChanged("securityContext");
webdsl.generated.domain.SecurityContext olditem=_securityContext;
_securityContext=newitem;
}
@Transient boolean securityContextBeingSet=false;
public String getName(){
if(getId()!=null){
return getId().toString();
}
else {
return "";
}
}
public String get_WebDslEntityType(){
return "SessionManager";
}
public java.util.List<webdsl.generated.domain.SecurityContext> allowedSecurityContext_(){
return (java.util.List<webdsl.generated.domain.SecurityContext>)(java.util.List<?>)webdsl.generated.domain.SecurityContext.$static$all_();
}
public java.util.List<webdsl.generated.domain.SessionMessage> allowedMessages_(){
return (java.util.List<webdsl.generated.domain.SessionMessage>)(java.util.List<?>)webdsl.generated.domain.SessionMessage.$static$all_();
}
public void validateSecurityContext_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateSecurityContext_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateSecurityContext_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateCookieValue_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateCookieValue_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateCookieValue_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateDomain_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getDomain(),null)&&(!(org.webdsl.tools.Utils.equal(this.getDomain().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getDomain().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateDomain_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateDomain_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateSessionHasChanges_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateSessionHasChanges_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateSessionHasChanges_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateStayLoggedIn_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateStayLoggedIn_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateStayLoggedIn_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateLogsqlMessage_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getLogsqlMessage(),null)&&(!(org.webdsl.tools.Utils.equal(this.getLogsqlMessage().length(),null)||org.webdsl.tools.Utils.equal(1000000,null))&&this.getLogsqlMessage().length()>1000000)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+1000000+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateLogsqlMessage_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateLogsqlMessage_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateLastUse_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateLastUse_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateLastUse_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateMessages_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateMessages_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateMessages_internalValidationExceptionMultiple_(v_);
return v_;
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateCookieValue_internalValidationExceptionMultiple_(v_);
this.validateDomain_internalValidationExceptionMultiple_(v_);
this.validateLastUse_internalValidationExceptionMultiple_(v_);
this.validateLogsqlMessage_internalValidationExceptionMultiple_(v_);
this.validateMessages_internalValidationExceptionMultiple_(v_);
this.validateSecurityContext_internalValidationExceptionMultiple_(v_);
this.validateSessionHasChanges_internalValidationExceptionMultiple_(v_);
this.validateStayLoggedIn_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from SessionManager").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from SessionManager").list();
}
public webdsl.generated.domain.SessionManager SessionManager$this_(){
this.SessionManager_();
return this;
}
public void SessionManager_(){
this.setLogsqlMessage(null);
}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public webdsl.generated.domain.SessionManager replaceAllMessagesLSessionMessageL_(java.util.List<webdsl.generated.domain.SessionMessage> value_){
this.replaceAllInMessages(value_);
return this;
}
public void removeFromMessagesSessionMessage_(webdsl.generated.domain.SessionMessage value_){}
public void addToMessagesSessionMessage_(webdsl.generated.domain.SessionMessage value_){}
public void setLastUseDateTime_(java.util.Date value_){}
public void setLogsqlMessageText_(String value_){}
public void setStayLoggedInBool_(Boolean value_){}
public void setSessionHasChangesBool_(Boolean value_){}
public void setDomainString_(String value_){}
public void setCookieValueUUID_(java.util.UUID value_){}
public void setSecurityContextSecurityContext_(webdsl.generated.domain.SecurityContext value_){}
public static java.util.List<webdsl.generated.domain.SessionManager> _static_findByLogsqlMessage_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from SessionManager as g where g._logsqlMessage = :param0").setParameter("param0",prop_).list();
}
public static java.util.List<webdsl.generated.domain.SessionManager> _static_findByLogsqlMessageLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from SessionManager as g where g._logsqlMessage like :param1").setParameter("param1",s_).list();
}
public static java.util.List<webdsl.generated.domain.SessionManager> _static_findByDomain_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from SessionManager as g where g._domain = :param2").setParameter("param2",prop_).list();
}
public static java.util.List<webdsl.generated.domain.SessionManager> _static_findByDomainLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from SessionManager as g where g._domain like :param3").setParameter("param3",s_).list();
}
public static webdsl.generated.domain.SessionManager _static_load_(java.util.UUID prop_){
return webdsl.generated.domain.SessionManager._static_cast_(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"SessionManager",prop_));
}
public static SessionManager _static_createEmpty_(){
SessionManager ent=new SessionManager();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static SessionManager _static_cast_(Object o){
return (SessionManager)org.webdsl.tools.Utils.cast(o,SessionManager.class);
}
}
