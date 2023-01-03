package com.example.jpatest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "todo")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "todos")
    private String todos;

    @Column(name = "indate")
    private String indate;
}
