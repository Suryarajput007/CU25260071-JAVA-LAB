import java.util.LinkedList;

public class Q8 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("Bela");                          // add at end
        queue.addLast("Chirag");
        queue.addFirst("Amit");                         // add at start
        queue.addLast("Divya");
        System.out.println("Queue          : " + queue);
        System.out.println("removeFirst()  : " + queue.removeFirst());   // Amit leaves
        System.out.println("removeLast()   : " + queue.removeLast());    // Divya leaves
        System.out.println("Remaining      : " + queue);
    }
}
