package com.kodilla.spring.portfolio;


import com.kodilla.spring.library.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import java.util.List;

@Configuration
public class BoardConfig {



    @Autowired
    @Qualifier("1")
    TaskList toDoList;

    @Autowired
    @Qualifier("2")
    TaskList inProgressList;

    @Autowired
    @Qualifier("3")
    TaskList doneList;

    @Bean
    public Board board() {
        return new Board(toDoList,inProgressList,doneList);
    }


    @Bean(name = "1")
    @Qualifier
    @Scope("prototype")
    public TaskList getToDoList() {
        TaskList toDoList = new TaskList("to do list");
        toDoList.addTasks("Pierwsze to do");
        toDoList.addTasks("Drugie to do");
        toDoList.addTasks("Trzecie to do");
        return toDoList;
    }


    @Bean(name = "2")
    @Scope("prototype")
    public TaskList getInProgressList() {
        TaskList inProgressList = new TaskList("In progress list");
        inProgressList.addTasks("Pierwsze in progress");
        inProgressList.addTasks("Drugie in progress");
        inProgressList.addTasks("Trzecie in progress");
        return  inProgressList;
    }

    @Bean(name = "3")
    @Scope("prototype")
    public TaskList getDoneList() {
        TaskList doneList = new TaskList("Done list");
        doneList.addTasks("Pierwsze in progress");
        doneList.addTasks("Drugie in progress");
        doneList.addTasks("Trzecie in progress");
        return  doneList;
    }



}

