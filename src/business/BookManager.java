/*
 * Copyright (c) 2023.
 */

package business;

/**
 * Created by Viktor Belous on 07.08.2023.
 */

import data.BookRepository;
import domain.Book;
import java.util.List;

public class BookManager {
    private BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     *Добавление книги
     */
    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public void removeBook(Book book) {
        bookRepository.removeBook(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }
}