import java.time.LocalDateTime;

public class Transaction {
    private long transactionId;
    private long accountNumber;
    private String type; // Deposit or Withdrawal
    private double amount;
    private LocalDateTime timestamp;

    public Transaction() {}

    public Transaction(long transactionId, long accountNumber, String type, double amount) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public long getTransactionId() {
        return transactionId;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
