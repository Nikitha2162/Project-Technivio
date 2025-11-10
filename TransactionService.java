import java.util.ArrayList;
import java.util.List;

public class TransactionService {
    private List<Transaction> transactions = new ArrayList<>();
    private AccountService accountService = new AccountService();

    public Transaction deposit(long accountNumber, double amount) {
        Account account = accountService.getAccountByNumber(accountNumber);
        if (account != null) {
            account.setBalance(account.getBalance() + amount);
            Transaction tx = new Transaction(System.currentTimeMillis(), accountNumber, "Deposit", amount);
            transactions.add(tx);
            return tx;
        }
        return null;
    }

    public Transaction withdraw(long accountNumber, double amount) {
        Account account = accountService.getAccountByNumber(accountNumber);
        if (account != null && account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            Transaction tx = new Transaction(System.currentTimeMillis(), accountNumber, "Withdrawal", amount);
            transactions.add(tx);
            return tx;
        }
        return null;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
