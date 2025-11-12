package com.onlinebanking.service;

import com.onlinebanking.model.Loan;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class LoanService {
    private Map<Long, Loan> loanRecords = new HashMap<>();
    private Long idCounter = 1L;

    public List<Loan> getAllLoans() {
        return new ArrayList<>(loanRecords.values());
    }

    public Loan getLoanById(Long id) {
        return loanRecords.get(id);
    }

    public Loan applyForLoan(Loan loan) {
        loan.setId(idCounter++);
        loanRecords.put(loan.getId(), loan);
        return loan;
    }

    public Loan updateLoan(Long id, Loan loan) {
        if (loanRecords.containsKey(id)) {
            loan.setId(id);
            loanRecords.put(id, loan);
            return loan;
        }
        return null;
    }

    public String closeLoan(Long id) {
        loanRecords.remove(id);
        return "Loan closed successfully.";
    }
}
