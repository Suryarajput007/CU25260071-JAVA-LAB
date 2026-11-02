import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(40, 10, 30, 10, 50, 20, 10));
        System.out.println("Original : " + list);
        Collections.sort(list);                         // ascending order
        System.out.println("sort     : " + list);
        Collections.reverse(list);                      // reverse the order
        System.out.println("reverse  : " + list);
        System.out.println("max      : " + Collections.max(list));
        System.out.println("min      : " + Collections.min(list));
        System.out.println("frequency of 10: " + Collections.frequency(list, 10));
    }
}
