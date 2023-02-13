package com.business;

import java.util.ArrayList;
import java.util.List;

import com.data.api.TodoService;

//TodoBusinessImpl sutie
//TodoService Dependency
public class TodoBusinessImpl {
	
	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user)
	{
	List<String> filteredTodo=new ArrayList<String>();
	List<String> todos=todoService.retreiveTodo(user);
	for(String todo:todos)
	{
	if(todo.contains("Spring"))
	{
		filteredTodo.add(todo);
	}
	
}
	
	return filteredTodo;
}
}