package com.xlaser.junit;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

import com.xlaser.junit.model.Book;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/12/6 14:44
 * @description:
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RestControllerTest {
    @Autowired
    TestRestTemplate restTemplate;

    /**
     * TEST LIST
     */
    @Test
    @Order(1)
    void testListBooks() {

        // LIST
        ResponseEntity<Book[]> responseList = restTemplate.getForEntity("/books", Book[].class);
        assertAll("ListBooks",
                () -> assertEquals(OK, responseList.getStatusCode(), "获取列表失败!"),
                () -> assertEquals(3, Objects.requireNonNull(responseList.getBody()).length, "数据setup初始化异常!"));

        System.out.println(Arrays.toString(responseList.getBody()));
    }

    /**
     * TEST ADD
     */
    @Test
    @Order(2)
    void testAddBook() {

        // ADD
        Book book = new Book(3, "I, Robot", "Isaac Asimov", LocalDate.of(1950, 12, 2));
        ResponseEntity<Boolean> responseAdd = restTemplate.postForEntity("/books", book, Boolean.class);
        assertAll("AddBook",
                () -> assertEquals(CREATED, responseAdd.getStatusCode(), "创建book失败!"),
                () -> assertEquals(true, responseAdd.getBody()));

        // LIST
        ResponseEntity<Book[]> responseList = restTemplate.getForEntity("/books", Book[].class);
        assertEquals(Objects.requireNonNull(responseList.getBody()).length, 4, "创建book失败!");

        System.out.println(Arrays.toString(responseList.getBody()));
    }

    /**
     * TEST GET
     */
    @Test
    @Order(3)
    void testGetBook() {

        // GET
        ResponseEntity<Book> responseGet = restTemplate.getForEntity("/books/0", Book.class);
        assertAll("GetBook",
                () -> assertEquals(OK, responseGet.getStatusCode(), "获取book失败!"),
                () -> assertEquals("The Hobbit", Objects.requireNonNull(responseGet.getBody()).getName()));

        System.out.println(responseGet.getBody());
    }

    /**
     * TEST DELETE
     */
    @Test
    @Order(4)
    void testRemoveBook() {

        // DELETE
        ResponseEntity<Boolean> responseDelete = restTemplate.exchange("/books/3", HttpMethod.DELETE, null, Boolean.class);
        assertAll("RemoveBook",
                () -> assertEquals(OK, responseDelete.getStatusCode()),
                () -> assertEquals(true, Objects.requireNonNull(responseDelete.getBody())));

        // LIST
        ResponseEntity<Book[]> responseList = restTemplate.getForEntity("/books", Book[].class);
        assertEquals(Objects.requireNonNull(responseList.getBody()).length, 3, "删除book失败!");

        System.out.println(Arrays.toString(responseList.getBody()));
    }

    /**
     * TEST PUT
     */
    @Test
    @Order(5)
    void testUpdateBook() {

        // UPDATE
        Book newBook = new Book(0, "====== Hobbit ======", "J. R. R. Tolkien", LocalDate.of(1937, 2, 21));
        ResponseEntity<Boolean> responsePut = restTemplate.exchange("/books", HttpMethod.PUT, new HttpEntity<>(newBook), Boolean.class);
        assertAll("UpdateBook",
                () -> assertEquals(OK, responsePut.getStatusCode()),
                () -> assertEquals(true, Objects.requireNonNull(responsePut.getBody())));

        // GET
        ResponseEntity<Book> responseGet = restTemplate.getForEntity("/books/0", Book.class);
        assertAll("GetBook",
                () -> assertEquals(OK, responseGet.getStatusCode(), "获取book失败!"),
                () -> assertEquals("====== Hobbit ======", Objects.requireNonNull(responseGet.getBody()).getName()));

        System.out.println(responseGet.getBody());
    }
}
