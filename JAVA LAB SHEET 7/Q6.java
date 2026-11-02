public class Q6 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {                   // task: sleep for a while
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        });
        System.out.println("Before start : " + t.isAlive());   // false
        t.start();
        System.out.println("While running: " + t.isAlive());   // true
        t.join();                                              // wait until thread ends
        System.out.println("After finish : " + t.isAlive());   // false
    }
}
