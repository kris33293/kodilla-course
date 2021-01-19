package com.kodilla.spring.portfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class BoardConfig {






    @Bean
    @Scope("prototype")
    public List<String> getToDoList() {
        TaskList toDoList = new TaskList("to do list");
        toDoList.addTasks("Pierwsze to do");
        toDoList.addTasks("Drugie to do");
        toDoList.addTasks("Trzecie to do");
        return toDoList.getTasks();
    }

    @Bean
    @Scope("prototype")
    public List<String> getInProgressList() {
        TaskList inProgressList = new TaskList("In progress list");
        inProgressList.addTasks("Pierwsze in progress");
        inProgressList.addTasks("Drugie in progress");
        inProgressList.addTasks("Trzecie in progress");
        return  inProgressList.getTasks();
    }

    @Bean
    @Scope("prototype")
    public List<String> getDoneList() {
        TaskList doneList = new TaskList("Done list");
        doneList.addTasks("Pierwsze in progress");
        doneList.addTasks("Drugie in progress");
        doneList.addTasks("Trzecie in progress");
        return  doneList.getTasks();
    }



}

