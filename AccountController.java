public class AccountController {
    private AccountService accountService = new AccountService();

    public void createAccount(Account account) {
        Account created = accountService.createAccount(account);
        System.out.println("Account created successfully: " + created.getAccountNumber());
    }

    public void viewAllAccounts() {
        for (Account acc : accountService.getAllAccounts()) {
            System.out.println("Account Number: " + acc.getAccountNumber() + ", Type: " + acc.getAccountType() + ", Balance: " + acc.getBalance());
        }
    }

    public void viewAccountByNumber(long accountNumber) {
        Account acc = accountService.getAccountByNumber(accountNumber);
        if (acc != null) {
            System.out.println("Account Details: " + acc.getAccountNumber() + ", " + acc.getAccountType() + ", " + acc.getBalance());
        } else {
            System.out.println("Account not found for number: " + accountNumber);
        }
    }
}
