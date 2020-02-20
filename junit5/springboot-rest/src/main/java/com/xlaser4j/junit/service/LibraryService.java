package com.xlaser4j.junit.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.xlaser4j.junit.model.Book;
import org.springframework.stereotype.Service;

/**
 * @package: com.xlaser4j.junit.service
 * @author: Elijah.D
 * @time: 2019/12/6 14:26
 * @description:
 * @modified: Elijah.D
 */
@Service
public class LibraryService {
    private List<Book> books = new ArrayList<>(3);

    @PostConstruct
    private void setup() {
        books.add(new Book(0, "The Hobbit", "J. R. R. Tolkien", LocalDate.of(1937, 2, 21)));
        books.add(new Book(1, "A Confederacy of Dunces", "John Kennedy Toole", LocalDate.of(1980, 4, 1)));
        books.add(new Book(2, "A Game of Thrones (A Song of Ice and Fire)", "George R.R. Martin", LocalDate.of(1996, 1, 1)));
    }

    public List<Book> listBooks() {
        System.out.println("Service: listBooks");
        return books;
    }

    public void addBook(Book book) {
        System.out.println("Service: addBook");
        books.add(book);
    }

    public Book getBook(int index) {
        System.out.println("Service: getBook");
        return books.get(index);
    }

    public void updateBook(Book book) {
        System.out.println("Service: updateBook");
        books.add(book.getIndex(), book);
    }

    public void removeBook(int index) {
        System.out.println("Service: removeBook");
        books.remove(index);
    }
}
