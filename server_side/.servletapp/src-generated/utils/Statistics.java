package utils;
import webdsl.generated.templates.*;public class Statistics{
public static void logStatistics(){
java.util.List<PageStats> results=new java.util.ArrayList<PageStats>();
results.add(new PageStats().setPage("User").setReadOnly(UserPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(UserPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(UserPage.renderWithUpdates.getAndSet(0)).setActionFailed(UserPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(UserPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(UserPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("TodoList").setReadOnly(TodoListPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(TodoListPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(TodoListPage.renderWithUpdates.getAndSet(0)).setActionFailed(TodoListPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(TodoListPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(TodoListPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("TodoItem").setReadOnly(TodoItemPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(TodoItemPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(TodoItemPage.renderWithUpdates.getAndSet(0)).setActionFailed(TodoItemPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(TodoItemPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(TodoItemPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("Status").setReadOnly(StatusPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(StatusPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(StatusPage.renderWithUpdates.getAndSet(0)).setActionFailed(StatusPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(StatusPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(StatusPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("root").setReadOnly(RootPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(RootPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(RootPage.renderWithUpdates.getAndSet(0)).setActionFailed(RootPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(RootPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(RootPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("registartionService").setReadOnly(RegistartionServicePage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(RegistartionServicePage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(RegistartionServicePage.renderWithUpdates.getAndSet(0)).setActionFailed(RegistartionServicePage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(RegistartionServicePage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(RegistartionServicePage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("RDescription").setReadOnly(RDescriptionPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(RDescriptionPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(RDescriptionPage.renderWithUpdates.getAndSet(0)).setActionFailed(RDescriptionPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(RDescriptionPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(RDescriptionPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("pagenotfound").setReadOnly(PagenotfoundPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(PagenotfoundPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(PagenotfoundPage.renderWithUpdates.getAndSet(0)).setActionFailed(PagenotfoundPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(PagenotfoundPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(PagenotfoundPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("logoutService").setReadOnly(LogoutServicePage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(LogoutServicePage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(LogoutServicePage.renderWithUpdates.getAndSet(0)).setActionFailed(LogoutServicePage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(LogoutServicePage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(LogoutServicePage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("loginService").setReadOnly(LoginServicePage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(LoginServicePage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(LoginServicePage.renderWithUpdates.getAndSet(0)).setActionFailed(LoginServicePage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(LoginServicePage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(LoginServicePage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("home").setReadOnly(HomePage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(HomePage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(HomePage.renderWithUpdates.getAndSet(0)).setActionFailed(HomePage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(HomePage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(HomePage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("getTodoItem").setReadOnly(GetTodoItemPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(GetTodoItemPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(GetTodoItemPage.renderWithUpdates.getAndSet(0)).setActionFailed(GetTodoItemPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(GetTodoItemPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(GetTodoItemPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("getRDescription").setReadOnly(GetRDescriptionPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(GetRDescriptionPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(GetRDescriptionPage.renderWithUpdates.getAndSet(0)).setActionFailed(GetRDescriptionPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(GetRDescriptionPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(GetRDescriptionPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("deleteTodoList").setReadOnly(DeleteTodoListPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(DeleteTodoListPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(DeleteTodoListPage.renderWithUpdates.getAndSet(0)).setActionFailed(DeleteTodoListPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(DeleteTodoListPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(DeleteTodoListPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("deleteTodoItem").setReadOnly(DeleteTodoItemPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(DeleteTodoItemPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(DeleteTodoItemPage.renderWithUpdates.getAndSet(0)).setActionFailed(DeleteTodoItemPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(DeleteTodoItemPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(DeleteTodoItemPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("Date").setReadOnly(DatePage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(DatePage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(DatePage.renderWithUpdates.getAndSet(0)).setActionFailed(DatePage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(DatePage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(DatePage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("accessDenied").setReadOnly(AccessDeniedPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(AccessDeniedPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(AccessDeniedPage.renderWithUpdates.getAndSet(0)).setActionFailed(AccessDeniedPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(AccessDeniedPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(AccessDeniedPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("descriptionString_String_Placeholder").setReadOnly(DescriptionString_String_PlaceholderPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(DescriptionString_String_PlaceholderPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(DescriptionString_String_PlaceholderPage.renderWithUpdates.getAndSet(0)).setActionFailed(DescriptionString_String_PlaceholderPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(DescriptionString_String_PlaceholderPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(DescriptionString_String_PlaceholderPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("noMessages").setReadOnly(NoMessagesPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(NoMessagesPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(NoMessagesPage.renderWithUpdates.getAndSet(0)).setActionFailed(NoMessagesPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(NoMessagesPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(NoMessagesPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("showMessagesLStringL").setReadOnly(ShowMessagesLStringLPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(ShowMessagesLStringLPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(ShowMessagesLStringLPage.renderWithUpdates.getAndSet(0)).setActionFailed(ShowMessagesLStringLPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(ShowMessagesLStringLPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(ShowMessagesLStringLPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("todoItemsString_String_Placeholder_Placeholder").setReadOnly(TodoItemsString_String_Placeholder_PlaceholderPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(TodoItemsString_String_Placeholder_PlaceholderPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(TodoItemsString_String_Placeholder_PlaceholderPage.renderWithUpdates.getAndSet(0)).setActionFailed(TodoItemsString_String_Placeholder_PlaceholderPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(TodoItemsString_String_Placeholder_PlaceholderPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(TodoItemsString_String_Placeholder_PlaceholderPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("todoListsUUID_Placeholder_Placeholder_Placeholder").setReadOnly(TodoListsUUID_Placeholder_Placeholder_PlaceholderPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(TodoListsUUID_Placeholder_Placeholder_PlaceholderPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(TodoListsUUID_Placeholder_Placeholder_PlaceholderPage.renderWithUpdates.getAndSet(0)).setActionFailed(TodoListsUUID_Placeholder_Placeholder_PlaceholderPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(TodoListsUUID_Placeholder_Placeholder_PlaceholderPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(TodoListsUUID_Placeholder_Placeholder_PlaceholderPage.actionSuccessWithUpdates.getAndSet(0)));
utils.PageStats.printList(results);
}
}
