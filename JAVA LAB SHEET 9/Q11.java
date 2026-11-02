import java.util.Arrays;
import java.util.TreeSet;

public class Q11 {
    public static void main(String[] args) {
        TreeSet<Integer> ids = new TreeSet<>(Arrays.asList(105, 101, 103, 101, 104, 103, 102));
        System.out.println("Unique sorted IDs: " + ids);
        System.out.println("first()      : " + ids.first());      // smallest
        System.out.println("last()       : " + ids.last());       // largest
        System.out.println("higher(103)  : " + ids.higher(103));  // next bigger than 103
        System.out.println("lower(103)   : " + ids.lower(103));   // next smaller than 103
    }
}
