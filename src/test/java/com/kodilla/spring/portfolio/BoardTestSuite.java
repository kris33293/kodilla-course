 package com.kodilla.spring.portfolio;

 import com.kodilla.spring.library.Library;
 import org.junit.jupiter.api.Test;
 import org.springframework.context.ApplicationContext;
 import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 import java.util.List;

 import static org.junit.jupiter.api.Assertions.*;


 public class BoardTestSuite {

     @Test
     void getToDoList(){
         //Given
         ApplicationContext context =
                 new AnnotationConfigApplicationContext("com.kodilla.spring");
         Board board = context.getBean(Board.class);

         //When
         TaskList list = board.getToDoList();

         //Then
         assertEquals(3, list.getTasks().size());
     }

     @Test
     void getInProgressList(){
         //Given
         ApplicationContext context =
                 new AnnotationConfigApplicationContext("com.kodilla.spring");
         Board board = context.getBean(Board.class);

         //When
         TaskList list = board.getInProgressList();

         //Then
         assertEquals(3, list.getTasks().size());
     }

     @Test
     void getDoneList(){
         //Given
         ApplicationContext context =
                 new AnnotationConfigApplicationContext("com.kodilla.spring");
         Board board = context.getBean(Board.class);

         //When
         TaskList list = board.getDoneList();

         //Then
         assertEquals(3, list.getTasks().size());
     }

     @Test
     void testTaskAdd(){
         //Given
         ApplicationContext context =
                 new AnnotationConfigApplicationContext("com.kodilla.spring");
         Board board = context.getBean(Board.class);

         String task1 = "task1";
         String task2 = "task 2";
         String task3 = "task 3";
         //When
         board.doneList.addTasks(task1);
         board.inProgressList.addTasks(task2);
         board.toDoList.addTasks(task3);

         //Then
         assertFalse(board.getDoneList().getTasks().equals(task1));
         assertFalse(board.getInProgressList().getTasks().equals(task2));
         assertFalse(board.getToDoList().getTasks().equals(task3));
     }



 }
