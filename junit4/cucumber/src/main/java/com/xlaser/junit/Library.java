package com.xlaser.junit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/25 13:37
 * @description: library
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class Library {
    private List<Book> store = new ArrayList<>();

    /**
     * add book to store
     *
     * @param book
     */
    public void addBook(Book book) {
        store.add(book);
    }

    /**
     * list books by date
     *
     * @param from statDate
     * @param to   endDate
     * @return books
     */
    public List<Book> listBooks(Date from, Date to) {
        return store.stream()
                .filter(book -> from.before(book.getPublished()) && to.after(book.getPublished()))
                .sorted(Comparator.comparing(Book::getPublished).reversed())
                .collect(Collectors.toList());
    }
}
