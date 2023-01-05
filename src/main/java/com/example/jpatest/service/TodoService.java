package com.example.jpatest.service;

import com.example.jpatest.dto.TodoResponse;

import java.util.List;

public interface TodoService {

    //할일 목록 불러오기
    List<TodoResponse> todolist();

    //할일 삭제
    String deleteTodos(String id);

    //할일 등록
    String insertTodos(String todos);
}
