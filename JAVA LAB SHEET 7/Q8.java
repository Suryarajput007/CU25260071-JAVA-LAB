public class Q8 {
    public static void main(String[] args) {
        Thread high = new Thread(() -> System.out.println("High priority thread running"), "High");
        Thread low  = new Thread(() -> System.out.println("Low priority thread running"), "Low");
        high.setPriority(Thread.MAX_PRIORITY);          // 10
        low.setPriority(Thread.MIN_PRIORITY);           // 1
        System.out.println(high.getName() + " priority = " + high.getPriority());
        System.out.println(low.getName() + " priority = " + low.getPriority());
        high.start();
        low.start();
    }
}
