package com.example.service;

import com.example.entity.Book;
import com.example.entity.LoanRecord;
import com.example.entity.User;

import java.util.List;

public interface ILoanRecordService {
    LoanRecord borrowBook(User user, Book book);
    LoanRecord returnBook(User user, Book book);
    List<LoanRecord> getUserLoanRecords(User user);
}

