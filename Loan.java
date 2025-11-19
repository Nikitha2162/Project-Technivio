package com.onlinebanking.model;

public class Loan {
    private Long id;
    private String loanType;
    private double amount;
    private double interestRate;
    private int tenureInMonths;

    public Loan() {}

    public Loan(Long id, String loanType, double amount, double interestRate, int tenureInMonths) {
        this.id = id;
        this.loanType = loanType;
        this.amount = amount;
        this.interestRate = interestRate;
        this.tenureInMonths = tenureInMonths;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLoanType() {
        return loanType;
    }
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public int getTenureInMonths() {
        return tenureInMonths;
    }
    public void setTenureInMonths(int tenureInMonths) {
        this.tenureInMonths = tenureInMonths;
    }
}
