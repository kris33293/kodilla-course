package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.singleton.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {




    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Central Library");

        Book book1 = new Book("Ksiazka 1","Autor1", LocalDate.of(2010,12,1));
        Book book2 = new Book("Ksiazka 2","Autor2", LocalDate.of(2000,1,12));
        Book book3 = new Book("Ksiazka 3","Autor3", LocalDate.of(1955,2,5));

        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);

        //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.name = "Second Library";
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.name = "Third Library";
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book2);

        //Then
        System.out.println(library.getName());
        System.out.println(library.getBooks());

        System.out.println(clonedLibrary.getName());
        System.out.println(clonedLibrary.getBooks());

        System.out.println(deepClonedLibrary.getName());
        System.out.println(deepClonedLibrary.getBooks());

        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
