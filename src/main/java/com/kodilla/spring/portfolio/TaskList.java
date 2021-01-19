package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaskList {

    private final String name;
    private final List<String> tasks = new ArrayList<>();


    public TaskList(String name) {
        this.name = name;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTasks(String task) {
        tasks.add(task);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskList taskList = (TaskList) o;
        return name.equals(taskList.name) && tasks.equals(taskList.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tasks);
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
