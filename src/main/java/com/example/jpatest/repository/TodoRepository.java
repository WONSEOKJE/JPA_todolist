package com.example.jpatest.repository;

import com.example.jpatest.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> { //<엔터티, 기본키>

}
