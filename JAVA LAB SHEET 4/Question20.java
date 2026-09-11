class BankAccount {
    double balance;

    static String bankCode = "BANK101";

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        double withdrawalAmount = amount;

        if (withdrawalAmount <= balance) {
            balance = balance - withdrawalAmount;

            System.out.println("Withdrawal successful.");
            System.out.println("Withdrawn: " + withdrawalAmount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);

        System.out.println("Bank Code: " + bankCode);

        account.withdraw(3000);
    }
}