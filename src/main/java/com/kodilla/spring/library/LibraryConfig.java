package com.kodilla.spring.library;

import com.kodilla.spring.reader.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LibraryConfig {

    @Bean
    public Library library() {
        return new Library(libraryDbController());
    }

    @Bean
    public LibraryDbController libraryDbController() {
        return new LibraryDbController();
    }

    @Bean(name = "book1")
    @Scope("prototype")
    public Book getBookOne() {
        return new Book("The book number one");
    }
}