package com.example.entity;

import java.util.concurrent.atomic.AtomicInteger;

public class Book{
    private int id;
    private String title;
    private String description;
    private double price;
    private String author;
    private String publisher;
    private int quantity;
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);

    public int getId() {
        return id;
    }

//    public void setId() {
//        this.id = ID_GENERATOR.getAndIncrement();
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book(String title, String description, double price, String author, String publisher, int quantity) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.title = title;
        this.description = description;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

