public class Q13 {
    static class Buffer {                               // shared single-slot buffer
        private int value;
        private boolean full = false;

        synchronized void put(int v) throws InterruptedException {
            while (full) wait();                        // wait until consumer takes the value
            value = v;
            full = true;
            notify();                                   // wake up the consumer
        }

        synchronized int take() throws InterruptedException {
            while (!full) wait();                       // wait until producer puts a value
            full = false;
            notify();                                   // wake up the producer
            return value;
        }
    }

    public static void main(String[] args) {
        Buffer buf = new Buffer();
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) { buf.put(i); System.out.println("Produced: " + i); }
            } catch (InterruptedException e) { }
        });
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) System.out.println("Consumed: " + buf.take());
            } catch (InterruptedException e) { }
        });
        producer.start();
        consumer.start();
    }
}
