import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q10 {
    public static void main(String[] args) {
        Integer[] input = {30, 10, 20, 10, 40, 30};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(input));
        HashSet<Integer> set = new HashSet<>(Arrays.asList(input));
        System.out.println("ArrayList: " + list);
        System.out.println("HashSet  : " + set);
        System.out.println("List keeps duplicates and insertion order.");
        System.out.println("Set removes duplicates and does not guarantee insertion order.");
    }
}
