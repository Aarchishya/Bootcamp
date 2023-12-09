package com.example.repository;

import com.example.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements IBookRepository {
    private List<Book> bookList =  new ArrayList<>();;

//    public BookRepositoryImpl() {
//        bookList = new ArrayList<>();
//    }

    @Override
    public Book addBook(Book book) {
        bookList.add(book);
        return book;
    }

    @Override
    public void deleteBook(int id) {
        bookList.removeIf(book -> book.getId() == id);
    }

    @Override
    public Book updateBook(Book book) {
        int index = getBookIndexById(book.getId());
        if (index != -1) {
            bookList.set(index, book);
            return book;
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookList;
    }

    @Override
    public List<Book> searchBooks(String query) {
        List<Book> results = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(query.toLowerCase()) ||
                    book.getPublisher().toLowerCase().contains(query.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    @Override
    public Book search(int id) {
        for(Book book : bookList){
            if(book.getId() == id)
                return book;

        }
        return null;
    }

    private int getBookIndexById(int id) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
