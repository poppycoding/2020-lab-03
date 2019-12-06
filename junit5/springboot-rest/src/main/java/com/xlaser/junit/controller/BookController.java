package com.xlaser.junit.controller;

import java.util.List;

import com.xlaser.junit.model.Book;
import com.xlaser.junit.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

/**
 * @package: com.xlaser.junit.controller
 * @author: Elijah.D
 * @time: 2019/12/6 14:32
 * @description:
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@RestController
public class BookController {
    @Autowired
    private LibraryService service;

    /**
     * list all
     *
     * @return
     */
    @GetMapping(value = "/books")
    public ResponseEntity<List<Book>> listBooks() {
        System.out.println("Controller: listBooks");
        return new ResponseEntity<>(service.listBooks(), OK);
    }

    /**
     * save book
     *
     * @param book
     * @return
     */
    @PostMapping(value = "/books")
    public ResponseEntity<Boolean> addBook(@RequestBody Book book) {
        System.out.println("Controller: addBook");
        service.addBook(book);
        return new ResponseEntity<>(true, CREATED);
    }

    /**
     * get one
     *
     * @param index
     * @return
     */
    @GetMapping(value = "/books/{index}")
    public ResponseEntity<Book> getBook(@PathVariable("index") int index) {
        System.out.println("Controller: getBook");
        return new ResponseEntity<>(service.getBook(index), OK);
    }

    /**
     * update one
     *
     * @param book
     * @return
     */
    @PutMapping(value = "/books")
    public ResponseEntity<Boolean> updateBook(@RequestBody Book book) {
        System.out.println("Controller: updateBook");
        service.updateBook(book);
        return new ResponseEntity<>(true, OK);
    }

    /**
     * delete one
     *
     * @param index
     * @return
     */
    @DeleteMapping(value = "/books/{index}")
    public ResponseEntity<Boolean> removeBook(@PathVariable("index") int index) {
        System.out.println("Controller: removeBook");
        service.removeBook(index);
        return new ResponseEntity<>(true, OK);
    }
}
