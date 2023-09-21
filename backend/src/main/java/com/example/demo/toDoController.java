package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class toDoController {
    private final TodoService todoService;

    public toDoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllToDo() {
        return this.todoService.getAllToDos();
    }

    @PostMapping
    public Todo createToDo(@RequestBody Todo todo) {
        return todoService.createToDo(todo);
    }
}
