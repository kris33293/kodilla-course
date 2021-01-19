package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public class ShoppingTask implements Task {

    String taskName, whatToBuy;
    double quantity;
    boolean finished = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingTask that = (ShoppingTask) o;
        return Double.compare(that.quantity, quantity) == 0 && taskName.equals(that.taskName) && whatToBuy.equals(that.whatToBuy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, whatToBuy, quantity);
    }

    @Override
    public String toString() {
        return "ShoppingTask{" +
                "taskName='" + taskName + '\'' +
                ", whatToBuy='" + whatToBuy + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
