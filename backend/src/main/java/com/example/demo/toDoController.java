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
    //
    // noch in Arbeit
    //
    @GetMapping("/{id}")
    public Todo getToDoById(@PathVariable String id) {
        return this.todoService.getToDoById(id);
    }
    @PostMapping
    public Todo createToDo(@RequestBody Todo todo) {
        return todoService.createToDo(todo);
    }

    @PutMapping("/{id}")
    public Todo updateToDo(@PathVariable String id, @RequestBody Todo todo) {
        if (!id.equals(todo.id())) {
            throw new IllegalArgumentException("id does not match");
        }
        return todoService.updateToDo(todo);
    }
    @DeleteMapping("/{id}")
    public void deleteToDo(@PathVariable String id) {
        todoService.deleteToDo(id);
    }
}
