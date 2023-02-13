package com.business;

import static org.junit.Assert.*;


import java.util.List;

import org.junit.Test;

import com.data.api.TodoService;
import com.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl=new TodoBusinessImpl(todoServiceStub);
	
	
	
		List<String> filteredTodo =	todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
	    assertEquals(2,filteredTodo.size());
	}

}
