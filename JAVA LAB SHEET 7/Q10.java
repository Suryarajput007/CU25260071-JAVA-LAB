public class Q10 {
    static class BankAccount {
        int balance = 2000;
        void withdraw(int amount) {                     // NOT synchronized -> race condition
            int temp = balance;                         // read
            Thread.yield();                             // gives the other thread a chance to interfere
            balance = temp - amount;                    // write (may overwrite the other thread's update)
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
