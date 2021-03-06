package utils;
import org.webdsl.lang.*;import java.util.*;public class EntityReflectionHelper{
public static void init(){
java.util.List<ReflectionEntity> reflectionentities=utils.DispatchServletHelper.reflectionentities;
ReflectionEntity ent;
ent=new ReflectionEntity("dummy_webdsl_entity",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,String>("text",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("QueuedEmail",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("body",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("to",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("cc",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("bcc",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("replyTo",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("from",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("subject",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("unsubscribeAddress",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,java.util.Date>("lastTry",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("RequestLogEntry",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,webdsl.generated.domain.User>("principal",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.RequestLogEntry arg){
return arg.allowedPrincipal_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("requestedURL",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.Date>("start",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.Date>("end",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("clientIP",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,Integer>("clientPort",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("method",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("referer",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("userAgent",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("SecurityContext",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,webdsl.generated.domain.User>("principal",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.SecurityContext arg){
return arg.allowedPrincipal_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,Boolean>("loggedIn",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("SessionManager",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,webdsl.generated.domain.SessionMessage>("messages",false,null){
public java.util.List<webdsl.generated.domain.SessionMessage> getAllowed(webdsl.generated.domain.SessionManager arg){
return arg.allowedMessages_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.Date>("lastUse",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,String>("logsqlMessage",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,Boolean>("stayLoggedIn",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,Boolean>("sessionHasChanges",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,String>("domain",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.UUID>("cookieValue",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,webdsl.generated.domain.SecurityContext>("securityContext",false,null){
public java.util.List<webdsl.generated.domain.SecurityContext> getAllowed(webdsl.generated.domain.SessionManager arg){
return arg.allowedSecurityContext_();
}
}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("SessionMessage",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,String>("text",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("ToDoItem",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoItem,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoItem,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoItem,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoItem,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoItem,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoItem,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoItem,java.util.Date>("duedate",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoItem,Integer>("priority",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoItem,String>("description",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoItem,String>("tag",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoItem,Boolean>("status",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("ToDoList",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoList,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoList,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoList,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoList,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoList,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoList,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoList,webdsl.generated.domain.User>("author",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.ToDoList arg){
return arg.allowedAuthor_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoList,webdsl.generated.domain.User>("allowedUsers",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.ToDoList arg){
return arg.allowedAllowedUsers_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ToDoList,webdsl.generated.domain.ToDoItem>("todoitems",false,null){
public java.util.List<webdsl.generated.domain.ToDoItem> getAllowed(webdsl.generated.domain.ToDoList arg){
return arg.allowedTodoitems_();
}
}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("User",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,String>("username",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,String>("password",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,webdsl.generated.domain.ToDoList>("todolists",false,null){
public java.util.List<webdsl.generated.domain.ToDoList> getAllowed(webdsl.generated.domain.User arg){
return arg.allowedTodolists_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,webdsl.generated.domain.ToDoList>("sharedTodolists",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("ValidationException",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,String>("message",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("ValidationExceptionMultiple",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,webdsl.generated.domain.ValidationException>("exceptions",false,null){
public java.util.List<webdsl.generated.domain.ValidationException> getAllowed(webdsl.generated.domain.ValidationExceptionMultiple arg){
return arg.allowedExceptions_();
}
}
);
ReflectionEntity.add(ent);
org.webdsl.logging.Logger.info("number of entities: "+reflectionentities.size());
}
}
