import java.util.ArrayList;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Amit", "Bela", "Chirag", "Divya", "Esha"));
        System.out.println("Original: " + names);
        names.set(1, "Bhavna");                         // replace 2nd student (index 1)
        names.remove(3);                                // remove 4th student (index 3)
        System.out.println("Updated : " + names);
    }
}
