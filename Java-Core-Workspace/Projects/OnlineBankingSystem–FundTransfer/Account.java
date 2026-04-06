package OnlineBankingSystem–FundTransfer;
public class Account {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient funds in account " + accountNumber);
        }
        balance -= amount;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }
}
