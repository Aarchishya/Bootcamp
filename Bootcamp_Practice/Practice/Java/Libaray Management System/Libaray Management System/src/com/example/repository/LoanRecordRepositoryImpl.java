package com.example.repository;

import com.example.entity.LoanRecord;
import com.example.entity.User;

import java.util.ArrayList;
import java.util.List;

public class LoanRecordRepositoryImpl implements ILoanRecordRepository {
    private List<LoanRecord> loanRecordList;

    public LoanRecordRepositoryImpl() {
        loanRecordList = new ArrayList<>();
    }

    @Override
    public LoanRecord addLoanRecord(LoanRecord loanRecord) {
        loanRecordList.add(loanRecord);
        return loanRecord;
    }

    @Override
    public List<LoanRecord> getUserLoanRecords(User user) {
        List<LoanRecord> userLoanRecords = new ArrayList<>();
        for (LoanRecord loanRecord : loanRecordList) {
            if (loanRecord.getUser().getId() == user.getId()) {
                userLoanRecords.add(loanRecord);
            }
        }
        return userLoanRecords;
    }

    @Override
    public void updateLoanRecord(LoanRecord loanRecord) {
        int index = getLoanRecordIndex(loanRecord);
        if (index != -1) {
            loanRecordList.set(index, loanRecord);
        }
    }

    private int getLoanRecordIndex(LoanRecord loanRecord) {
        for (int i = 0; i < loanRecordList.size(); i++) {
            if (loanRecordList.get(i).getUser().getId() == loanRecord.getUser().getId()
                    && loanRecordList.get(i).getBook().getId() == loanRecord.getBook().getId()) {
                return i;
            }
        }
        return -1;
    }
}
