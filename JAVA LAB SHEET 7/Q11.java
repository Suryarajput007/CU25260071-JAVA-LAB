public class Q11 {
    static class BankAccount {
        int balance = 2000;
        synchronized void withdraw(int amount) {        // only one thread at a time can run this
            int temp = balance;
            Thread.yield();
            balance = temp - amount;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount acc = new BankAccount();
        Runnable task = () -> { for (int i = 0; i < 1000; i++) acc.withdraw(1); };
        Thread t1 = new Thread(task), t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join();  t2.join();
        System.out.println("Expected balance = 0, Actual balance = " + acc.balance);
    }
}
