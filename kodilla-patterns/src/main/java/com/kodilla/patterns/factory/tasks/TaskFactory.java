package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Shape;

public class TaskFactory {
    public static final String SHOPPING = "Shopping";
    public static final String PAINTING = "Painting";
    public static final String DRIVING = "Driving";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Zakupy","Farby",15);
            case PAINTING:
                return new PaintingTask("Malowanie","Farby","Pokoj");
            case DRIVING:
                return  new DrivingTask("Deliwerka","Stadion", "Ciezarowka");
            default:
                return null;
        }
    }
}
