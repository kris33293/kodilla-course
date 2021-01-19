package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuit {

    @Test
    void testDefaultSharingStrategies() {

    //Given

    User john = new Millenials("John");
    User tom = new ZGeneration("Tom");
    User bob = new YGeneration("Bob");

    //When
    String johnPostBy = john.sharePost();
    System.out.println("John share by: " + johnPostBy);
    String tomPostBy = tom.sharePost();
    System.out.println("Tom share by: " + tomPostBy);
    String bobPostBy = bob.sharePost();
    System.out.println("Bob share by: " + bobPostBy);


    //Then
    assertEquals("Facebook", johnPostBy);
    assertEquals("Snapchat", tomPostBy);
    assertEquals("Twitter", bobPostBy);
    }

    @Test
    void testIndividualSharingStrategy() {

    //Given
    User john = new Millenials("John");

    //When
    String johnPostBy = john.sharePost();
    System.out.println("John share by: " + johnPostBy);
    john.setSocialPublisher(new TwitterPublisher());
    johnPostBy = john.sharePost();
    System.out.println("John now share by: " + johnPostBy);

    //Then
    assertEquals("Twitter", johnPostBy);

    }
}
