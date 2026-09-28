// Question 2: Bank Account with Validation
package question2;

class BankAccount {
    private long accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public long getAccountNumber() { return accountNumber; }
    public void setAccountNumber(long accountNumber) { this.accountNumber = accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit: amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal: amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Available: " + balance + ", requested: " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1234567890L, "Riya Sharma", 5000);
        System.out.println(acc.getAccountHolder() + " | A/C " + acc.getAccountNumber()
                + " | Balance: " + acc.getBalance());
        acc.deposit(2000);      // valid
        acc.deposit(-500);      // invalid
        acc.withdraw(1500);     // valid
        acc.withdraw(10000);    // exceeds balance
        acc.withdraw(0);        // invalid
        System.out.println("Final balance: " + acc.getBalance());
    }
}
