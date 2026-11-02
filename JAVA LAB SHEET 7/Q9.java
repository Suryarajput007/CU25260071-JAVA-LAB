public class Q9 {
    public static void main(String[] args) throws InterruptedException {
        int[] prio = {1, 3, 5, 7, 10};                  // chosen priorities
        Thread[] ts = new Thread[5];
        for (int i = 0; i < 5; i++) {
            ts[i] = new Thread(() -> {
                long x = 0;
                for (int k = 0; k < 5_000_000; k++) x += k;     // some work
                System.out.println(Thread.currentThread().getName()
                        + " (priority " + Thread.currentThread().getPriority() + ") finished");
            }, "T" + (i + 1));
            ts[i].setPriority(prio[i]);
        }
        for (Thread t : ts) t.start();                  // start all
        for (Thread t : ts) t.join();                   // wait for all
        System.out.println("Priority is only a hint; finish order can differ on every run.");
    }
}
