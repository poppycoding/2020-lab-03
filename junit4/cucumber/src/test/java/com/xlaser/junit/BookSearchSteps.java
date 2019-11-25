package com.xlaser.junit;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import cn.hutool.core.date.DateUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class BookSearchSteps {
    private Library library = new Library();

    private List<Book> result = new ArrayList<>();

    /**
     * add book
     *
     * @param title
     * @param author
     * @param published
     */
    @Given.Givens(value = {
            @Given("a book with the title {string}, written by {string}, published in {string}"),
            @Given("another book with the title {string}, written by {string}, published in {string}")
    })
    public void addBook(String title, String author, String published) {
        library.addBook(new Book(title, author, DateUtil.parse(published, "dd MMMM yyyy", Locale.US)));
    }

    /**
     * search book
     *
     * @param from date
     * @param to   date
     */
    @When("the customer searches for books by published between {string} and {string}")
    public void getBookByPublished(String from, String to) {
        result = library.listBooks(DateUtil.parse(from, "yyyy"), DateUtil.parse(to, "yyyy"));
    }

    /**
     * 验证查找数量
     *
     * @param count
     */
    @Then("{int} books should have been found")
    public void verifyAmount(int count) {
        assertEquals(result.size(), count);
    }

    /**
     * 验证位置顺序
     *
     * @param position
     * @param title
     */
    @Then("Book {int} should have the title {string}")
    public void verifyBookAtPosition(int position, String title) {
        assertEquals(result.get(position - 1).getTitle(), title);
    }
}