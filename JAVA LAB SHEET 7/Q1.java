public class Q1 {
    static final String NAME = "Your Name";            // <-- put your own name here
    static class NameThread extends Thread {            // thread created by extending Thread
        public void run() {                             // code executed by the thread
            for (int i = 1; i <= 5; i++) {
                System.out.println(NAME + " (" + i + ")");
                try { Thread.sleep(200); } catch (InterruptedException e) { return; }  // 200 ms delay
            }
        }
    }

    public static void main(String[] args) {
        new NameThread().start();                       // start() calls run() in a new thread
    }
}
