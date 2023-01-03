package com.example.jpatest.dto;

import com.example.jpatest.entity.Todo;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TodoResponse {

    private String id;
    private String todos;

    public TodoResponse(Todo todo) {
        this.id = String.valueOf(todo.getId());
        this.todos = todo.getTodos();
    }
}
