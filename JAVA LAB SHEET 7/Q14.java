public class Q14 {
    static final Object Lock1 = new Object();
    static final Object Lock2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (Lock1) {                      // thread 1 holds Lock1 ...
                System.out.println("Thread 1: holding Lock1");
                try { Thread.sleep(100); } catch (InterruptedException e) { }
                synchronized (Lock2) {                  // ... and waits for Lock2
                    System.out.println("Thread 1: holding Lock1 and Lock2");
                }
            }
        }).start();
        new Thread(() -> {
            synchronized (Lock2) {                      // thread 2 holds Lock2 ...
                System.out.println("Thread 2: holding Lock2");
                try { Thread.sleep(100); } catch (InterruptedException e) { }
                synchronized (Lock1) {                  // ... and waits for Lock1 -> DEADLOCK
                    System.out.println("Thread 2: holding Lock2 and Lock1");
                }
            }
        }).start();
    }
}
