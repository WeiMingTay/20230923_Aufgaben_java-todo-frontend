package com.example.demo;

public record Todo(
        String id,
        String description,
        todoStatus status
) {
}
