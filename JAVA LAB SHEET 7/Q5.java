import java.util.Random;

public class Q5 {
    static class Worker extends Thread {
        Worker(String name) { super(name); }
        public void run() {
            try {
                Thread.sleep(new Random().nextInt(501));   // random sleep 0-500 ms
                System.out.println(getName() + " thread is working");
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }

    public static void main(String[] args) {
        new Worker("Reader").start();
        new Worker("Writer").start();
        new Worker("Logger").start();
    }
}
