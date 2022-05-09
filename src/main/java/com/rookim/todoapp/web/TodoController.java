package com.rookim.todoapp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rookim.todoapp.domain.TodoItem;
import com.rookim.todoapp.service.TodoService;

// annotation (like syntactical sugar)
// command + shift + O --> import automatically after @RestController was typed out
// rest controller returns JSON response
// regular controller returns a view?
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {
	
	@Autowired
	private TodoService todoService; 
	
//	fetch all todo items from database
	@GetMapping("/api/todoItems")
	public ResponseEntity<?> fetchAllTodoItems () {
		List<TodoItem> todoItems = todoService.fetchAllTodoItems();
		
		return ResponseEntity.ok(todoItems);
	}
}
