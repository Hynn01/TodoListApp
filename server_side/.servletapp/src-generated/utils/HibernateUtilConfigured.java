package utils;
import java.util.Properties;
import org.hibernate.*;import org.hibernate.type.*;import org.hibernate.cfg.*;import org.webdsl.*;import org.hibernate.event.*;import org.hibernate.event.def.*;import java.util.*;import java.io.*;import org.hibernate.dialect.Dialect;
import webdsl.generated.domain.*;@SuppressWarnings("unused")public class HibernateUtilConfigured extends utils.HibernateUtil{
private static final SessionFactory configuredSessionFactory;
private static Configuration annotationConfiguration;
static {
try{
utils.QueryOptimization.optimizationMode=0;
annotationConfiguration=new Configuration();
annotationConfiguration.addPackage("utils");
annotationConfiguration.addAnnotatedClass(utils.ApplicationContextProperty.class);
annotationConfiguration.addAnnotatedClass(utils.File.class);
annotationConfiguration.addPackage("webdsl.generated.domain");
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.dummy_webdsl_entity.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.QueuedEmail.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.RequestLogEntry.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.SecurityContext.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.SessionManager.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.SessionMessage.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.ToDoItem.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.ToDoList.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.User.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.ValidationException.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.ValidationExceptionMultiple.class);
annotationConfiguration.setListener("load",new NarrowProxyByReusingImplementationLoadEventListener());
annotationConfiguration.setListener("save-update",new SetVersionSaveOrUpdateEventListener());
annotationConfiguration.setListener("flush-entity",new SetValidationEventListener());
annotationConfiguration.setListener("auto-flush",new FastAutoFlushEventListener());
annotationConfiguration.setInterceptor(new WebDSLInterceptor());
annotationConfiguration.buildMappings();
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.ValidationExceptionMultiple._exceptions").setTypeName("webdsl.generated.domain.ValidationExceptionMultipleExceptionsOwnedListType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.ToDoList._allowedUsers").setTypeName("webdsl.generated.domain.ToDoListAllowedUsersOwnedListType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.ToDoList._todoitems").setTypeName("webdsl.generated.domain.ToDoListTodoitemsOwnedListType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.User._todolists").setTypeName("webdsl.generated.domain.UserTodolistsOwnedListType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.SessionManager._messages").setTypeName("webdsl.generated.domain.SessionManagerMessagesOwnedListType");
configuredSessionFactory=annotationConfiguration.buildSessionFactory();
org.webdsl.tools.Utils.handleSchemaCreateUpdate(configuredSessionFactory,annotationConfiguration);
}
catch(Throwable ex){
throw new ExceptionInInitializerError(ex);
}
}
protected static SessionFactory getConfiguredSessionFactory(){
return configuredSessionFactory;
}
public static Configuration getAnnotationConfiguration(){
return annotationConfiguration;
}
}
