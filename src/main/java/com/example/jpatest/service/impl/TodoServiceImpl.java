package com.example.jpatest.service.impl;

import com.example.jpatest.dto.TodoResponse;
import com.example.jpatest.entity.Todo;
import com.example.jpatest.repository.TodoRepository;
import com.example.jpatest.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public List<TodoResponse> todolist() {

        return todoRepository.findAll().stream()
                .map(en -> new TodoResponse(en))
                .collect(Collectors.toList());
    }

    @Override
    public String deleteTodos(String id) {
        try {
            todoRepository.deleteById(Long.valueOf(id));
        } catch (Exception e) {
            //e.printStackTrace()
            return "failed";
        }
        return "success";
    }

    @Override
    public String insertTodos(String todos) {
        try {
            todoRepository.save(Todo.builder().todos(todos).build());
        } catch (Exception e) {
            //e.printStackTrace()
            return "failed";
        }
        return "success";
    }
}
