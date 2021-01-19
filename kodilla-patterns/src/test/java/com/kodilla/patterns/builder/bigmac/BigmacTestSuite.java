package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testIngredients() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Pelnoziarnista")
                .burgers(3)
                .sauce("1000 Wysp")
                .ingredient("Krewetki")
                .ingredient("Salata")
                .ingredient("Ogorek")
                .ingredient("Pieczarki")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngrediends().size();

        //Then
        assertEquals(4, howManyIngredients);

    }

    @Test
    void testBigmac() {


        //Given
        Bigmac expectedBigmac = new Bigmac.BigmacBuilder()
                .bun("Pelnoziarnista")
                .burgers(3)
                .sauce("1000 Wysp")
                .ingredient("Krewetki")
                .ingredient("Salata")
                .ingredient("Ogorek")
                .ingredient("Pieczarki")
                .build();
        System.out.println(expectedBigmac);


        //When
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Pelnoziarnista")
                .burgers(3)
                .sauce("1000 Wysp")
                .ingredient("Krewetki")
                .ingredient("Salata")
                .ingredient("Ogorek")
                .ingredient("Pieczarki")
                .build();
        System.out.println(bigmac);
        // Then
        assertEquals(expectedBigmac.getIngrediends(), bigmac.getIngrediends());
        assertEquals(expectedBigmac.getSauces(), bigmac.getSauces());
        assertEquals(expectedBigmac.getBun(), bigmac.getBun());
        assertEquals(expectedBigmac.getBurgers(), bigmac.getBurgers());

    }
}