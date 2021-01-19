package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public class DrivingTask implements Task {

    String taskName,where,using;
    boolean finished = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName() {
        return taskName;
    }

    public void executeTask() {
        this.finished = true;
    }

    public boolean isTaskExecuted() {
        return finished;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrivingTask that = (DrivingTask) o;
        return taskName.equals(that.taskName) && where.equals(that.where) && using.equals(that.using);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, where, using);
    }

    @Override
    public String toString() {
        return "DrivingTask{" +
                "taskName='" + taskName + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                '}';
    }
}
