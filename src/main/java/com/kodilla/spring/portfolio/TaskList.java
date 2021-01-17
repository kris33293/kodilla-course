package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks ;

    public void TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }
}
