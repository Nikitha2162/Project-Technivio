public class AccountController {

    private AccountService accountService = new AccountService();

    public void openAccount(String accountNumber, String customerId, double balance, String type) {
        Account acc = new Account(accountNumber, customerId, balance, type);
        accountService.createAccount(acc);
    }

    public void makeDeposit(String accountNumber, double amount) {
        accountService.deposit(accountNumber, amount);
    }

    public void makeWithdrawal(String accountNumber, double amount) {
        accountService.withdraw(accountNumber, amount);
    }

    public void viewAccount(String accountNumber) {
        Account acc = accountService.getAccount(accountNumber);
        if (acc != null) {
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Customer ID: " + acc.getCustomerId());
            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Account Type: " + acc.getAccountType());
        } else {
            System.out.println("Account not found.");
        }
    }
}
