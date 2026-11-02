import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Q9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C", "Go"));
        System.out.println("Before: " + list);
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("Python")) it.set("Kotlin");   // replace the element just returned
            if (s.equals("C")) it.add("C++");           // insert after the element just returned
        }
        System.out.println("After : " + list);
    }
}
