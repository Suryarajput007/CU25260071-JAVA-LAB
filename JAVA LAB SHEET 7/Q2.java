public class Q2 {
    static final String NAME = "Your Name";            // <-- put your own name here
    static class NameTask implements Runnable {         // task created using Runnable
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(NAME + " (" + i + ")");
                try { Thread.sleep(200); } catch (InterruptedException e) { return; }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new NameTask()).start();             // pass the Runnable to a Thread
    }
}
