package com.kodilla.spring.portfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {



    @Autowired
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    Board board = new Board(toDoList,inProgressList,doneList);

    @Bean
    public TaskList getToDoList() {
        return board.getToDoList();
    }

    @Bean
    public TaskList getInProgressList() {
        return board.getInProgressList();
    }

    @Bean
    public TaskList getDoneList() {
        return board.getDoneList();
    }



}
