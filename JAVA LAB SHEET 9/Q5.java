import java.util.Arrays;
import java.util.TreeSet;

public class Q5 {
    public static void main(String[] args) {
        TreeSet<Integer> rolls = new TreeSet<>(Arrays.asList(45, 12, 78, 3, 56, 21, 99, 34, 67, 8));
        System.out.println("Sorted roll numbers: " + rolls);          // TreeSet keeps ascending order
    }
}
