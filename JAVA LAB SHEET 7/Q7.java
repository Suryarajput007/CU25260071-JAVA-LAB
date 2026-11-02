public class Q7 {
    static long sum = 0;                                // result shared with main

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) sum += i;  // long-running task
        });
        t.start();
        t.join();                                       // main waits here until t finishes
        System.out.println("Task finished. Sum = " + sum);
    }
}
