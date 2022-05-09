package com.rookim.todoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rookim.todoapp.domain.TodoItem;
import com.rookim.todoapp.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired // inject
	private TodoRepository todoRepo; 
	public List<TodoItem> fetchAllTodoItems () {
		todoRepo.fetchAllTodoItems();
	}
}
