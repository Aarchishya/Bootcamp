package com.example.repository;

import com.example.entity.LoanRecord;
import com.example.entity.User;

import java.util.List;

public interface ILoanRecordRepository {
    LoanRecord addLoanRecord(LoanRecord loanRecord);
    List<LoanRecord> getUserLoanRecords(User user);
    void updateLoanRecord(LoanRecord loanRecord);
}
