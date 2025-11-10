public class TransactionController {
    private TransactionService transactionService = new TransactionService();

    public void deposit(long accountNumber, double amount) {
        Transaction tx = transactionService.deposit(accountNumber, amount);
        if (tx != null)
            System.out.println("Deposit successful! Transaction ID: " + tx.getTransactionId());
        else
            System.out.println("Deposit failed. Account not found.");
    }

    public void withdraw(long accountNumber, double amount) {
        Transaction tx = transactionService.withdraw(accountNumber, amount);
        if (tx != null)
            System.out.println("Withdrawal successful! Transaction ID: " + tx.getTransactionId());
        else
            System.out.println("Withdrawal failed. Insufficient balance or invalid account.");
    }

    public void showAllTransactions() {
        for (Transaction tx : transactionService.getTransactions()) {
            System.out.println("Transaction: " + tx.getTransactionId() + " | " + tx.getType() +
                               " | Amount: " + tx.getAmount() + " | Account: " + tx.getAccountNumber() +
                               " | Time: " + tx.getTimestamp());
        }
    }
}
