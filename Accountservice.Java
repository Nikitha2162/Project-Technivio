import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private List<Account> accounts = new ArrayList<>();

    public Account createAccount(Account account) {
        accounts.add(account);
        return account;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }

    public Account getAccountByNumber(long accountNumber) {
        return accounts.stream()
                .filter(acc -> acc.getAccountNumber() == accountNumber)
                .findFirst()
                .orElse(null);
    }
}
