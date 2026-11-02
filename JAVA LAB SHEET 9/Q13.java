import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Q13 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>(Arrays.asList("Java", "DBMS", "Networks", "AI", "Python"));
        ListIterator<String> it = courses.listIterator();
        System.out.println("--- Forward ---");
        while (it.hasNext()) {
            int idx = it.nextIndex();                   // index of the element about to be returned
            System.out.println(idx + " : " + it.next());
        }
        System.out.println("--- Backward ---");
        while (it.hasPrevious()) {
            int idx = it.previousIndex();               // index of the element about to be returned
            System.out.println(idx + " : " + it.previous());
        }
    }
}
