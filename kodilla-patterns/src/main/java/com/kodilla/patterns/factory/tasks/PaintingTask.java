package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public class PaintingTask implements Task {

    String taskName,color,whatToPaint;
    boolean finished = false;


    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getTaskName() {
        return taskName;
    }

    public void executeTask() {
        this.finished = true;
    }

    public boolean isTaskExecuted() {
        return finished != false;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaintingTask that = (PaintingTask) o;
        return taskName.equals(that.taskName) && color.equals(that.color) && whatToPaint.equals(that.whatToPaint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, color, whatToPaint);
    }

    @Override
    public String toString() {
        return "PaintingTask{" +
                "taskName='" + taskName + '\'' +
                ", color='" + color + '\'' +
                ", whatToPaint='" + whatToPaint + '\'' +
                '}';
    }
}
