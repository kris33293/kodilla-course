package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static  Logger logger;

    @BeforeAll
    public  static void openLog() {
        logger = logger.INSTANCE;

    }

    @Test
    void testLog() {
        //Given

        //When
        String log = "Pierwszy";
        logger.log("Pierwszy");
        //Then
        assertEquals("Pierwszy", log);
    }

    @Test
    void testGetFileName() {
        //Given
        logger.log("Pierwszy");
        //When

        String fileName = logger.getLastLog();
        System.out.println("Last Log: " + fileName);
        //Then
        assertEquals("Pierwszy", fileName);
    }
}
