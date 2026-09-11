class BankAccount {
    String accountNumber;
    double balance;

    static String bankName = "State Bank";

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        double depositAmount = amount;
        balance = balance + depositAmount;

        System.out.println("Deposited: " + depositAmount);
        System.out.println("Updated Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC101", 10000);

        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Initial Balance: " + account.balance);

        account.deposit(5000);
    }
}