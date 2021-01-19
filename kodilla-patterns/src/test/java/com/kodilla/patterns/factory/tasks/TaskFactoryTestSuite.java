package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);


        //Then
        assertEquals("Malowanie", painting.getTaskName());

    }

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);


        //Then
        assertEquals("Zakupy", shopping.getTaskName());
    }

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);


        //Then
        assertEquals("Deliverka", driving.getTaskName());
    }

    @Test
    void testExecuteTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        System.out.println("Czy zadanie zostalo wykonane: " + painting.isTaskExecuted());
        painting.executeTask();
        System.out.println("Czy teraz zadanie zostalo wykonane: " + painting.isTaskExecuted());
        //Then
        assertEquals(true, painting.isTaskExecuted());
    }
}
