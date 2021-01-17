package com.kodilla.spring.portfolio;

public class Board {

    TaskList toDoList,inProgressList,doneList;


    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void addToDoList(String task) {
        toDoList.addTask(task);
    }

    public void addInProgressList(String task) {
        inProgressList.addTask(task);
    }

    public void addDoneList(String task) {
        doneList.addTask(task);
    }



}
