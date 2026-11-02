public class Q15 {
    static final Object Lock1 = new Object();
    static final Object Lock2 = new Object();

    public static void main(String[] args) {
        Runnable task = () -> {
            synchronized (Lock1) {                      // BOTH threads take Lock1 first ...
                System.out.println(Thread.currentThread().getName() + ": holding Lock1");
                try { Thread.sleep(100); } catch (InterruptedException e) { }
                synchronized (Lock2) {                  // ... then Lock2 -> no circular wait
                    System.out.println(Thread.currentThread().getName() + ": holding Lock1 and Lock2");
                }
            }
        };
        new Thread(task, "Thread 1").start();
        new Thread(task, "Thread 2").start();
    }
}
