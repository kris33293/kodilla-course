package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double a = calculator.add(2,3);
        double b = calculator.div(4,2);
        double c = calculator.mul(2,3);
        double d = calculator.sub(3,2);

        //Then
        assertEquals(5, a);
        assertEquals(2, b);
        assertEquals(6, c);
        assertEquals(1, d);
    }
}
