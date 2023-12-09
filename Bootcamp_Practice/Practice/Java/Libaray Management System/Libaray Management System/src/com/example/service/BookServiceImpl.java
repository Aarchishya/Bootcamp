package com.example.service;

import com.example.entity.Book;
import com.example.repository.BookRepositoryImpl;
import com.example.repository.IBookRepository;

import java.util.List;

public class BookServiceImpl implements IBookService {
    private IBookRepository bookRepository = new BookRepositoryImpl();

//    public BookServiceImpl(IBookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.addBook(book);
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteBook(id);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.updateBook(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public List<Book> searchBooks(String query) {
        return bookRepository.searchBooks(query);
    }

    @Override
    public Book search(int id) {
        return bookRepository.search(id);
    }
}

