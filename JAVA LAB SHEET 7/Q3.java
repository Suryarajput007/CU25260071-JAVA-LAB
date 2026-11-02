public class Q3 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();              // reference to the main thread
        System.out.println("Name     : " + t.getName());
        System.out.println("Priority : " + t.getPriority());
        t.setName("MyMainThread");                      // change the thread name
        System.out.println("New name : " + t.getName());
    }
}
