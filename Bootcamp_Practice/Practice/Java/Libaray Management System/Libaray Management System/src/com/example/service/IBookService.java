package com.example.service;

import com.example.entity.Book;

import java.util.List;

public interface IBookService {
    Book addBook(Book book);
    void deleteBook(int id);
    Book updateBook(Book book);
    List<Book> getAllBooks();
    List<Book> searchBooks(String query);
    Book search(int id);
}

