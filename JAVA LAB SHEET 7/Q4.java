public class Q4 {
    static class Counter extends Thread {
        Counter(String name) { super(name); }           // give the thread a name
        public void run() {
            for (int i = 1; i <= 5; i++)
                System.out.println(getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        new Counter("Thread-A").start();                // both threads run concurrently,
        new Counter("Thread-B").start();                // so the output order may change on each run
    }
}
