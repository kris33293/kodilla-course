// package com.kodilla.spring.portfolio;
//
// import com.kodilla.spring.library.Library;
// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.context.ApplicationContext;
// import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
// import java.util.List;
//
// import static org.junit.jupiter.api.Assertions.assertEquals;
//
// @SpringBootTest
// public class BoardTestSuite {
//
//     @Test
//     void getToDoList(){
//         //Given
//         ApplicationContext context =
//                 new AnnotationConfigApplicationContext("com.kodilla.spring");
//         Board board = context.getBean(Board.class);
//
//         //When
//         TaskList list = board.getToDoList();
//
//         //Then
//         assertEquals(3, board.getToDoList().getTasks().size());
//     }
//
//
//
// }
//