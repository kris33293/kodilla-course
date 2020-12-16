package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    private String name;


    public String getUserName() {
        return name;
    }

    public ForumUser() {
        this.name = "John Smith";
    }
}
