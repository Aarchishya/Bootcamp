package com.example.service;

import com.example.entity.Book;
import com.example.entity.LoanRecord;
import com.example.entity.User;
import com.example.repository.ILoanRecordRepository;
import com.example.repository.LoanRecordRepositoryImpl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class LoanRecordServiceImpl implements ILoanRecordService {
    private ILoanRecordRepository loanRecordRepository = new LoanRecordRepositoryImpl();

//    public LoanRecordServiceImpl(ILoanRecordRepository loanRecordRepository) {
//        this.loanRecordRepository = loanRecordRepository;
//    }

    @Override
    public LoanRecord borrowBook(User user, Book book) {
        LoanRecord loanRecord = new LoanRecord(user, book, new Date(), calculateDueDate());
        return loanRecordRepository.addLoanRecord(loanRecord);
    }

    @Override
    public LoanRecord returnBook(User user, Book book) {
        LoanRecord loanRecord = findActiveLoanRecord(user, book);
        if (loanRecord != null) {
            loanRecord.setReturnDate(new Date());
            loanRecordRepository.updateLoanRecord(loanRecord);
        }
        return loanRecord;
    }

    @Override
    public List<LoanRecord> getUserLoanRecords(User user) {
        return loanRecordRepository.getUserLoanRecords(user);
    }

    private LoanRecord findActiveLoanRecord(User user, Book book) {
        List<LoanRecord> userLoanRecords = loanRecordRepository.getUserLoanRecords(user);
        for (LoanRecord loanRecord : userLoanRecords) {
            if (loanRecord.getBook().getId() == book.getId() && loanRecord.getReturnDate() == null) {
                return loanRecord;
            }
        }
        return null;
    }

    private Date calculateDueDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, 14); // Assuming a 2-week loan period
        return calendar.getTime();
    }
}

