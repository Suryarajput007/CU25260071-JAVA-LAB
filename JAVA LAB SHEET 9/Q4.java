import java.util.Arrays;
import java.util.HashSet;

public class Q4 {
    public static void main(String[] args) {
        HashSet<String> depts = new HashSet<>(Arrays.asList(
            "CSE", "IT", "ECE", "CSE", "ME", "IT", "CIVIL", "ECE"));   // duplicates are ignored
        System.out.println("Unique departments: " + depts);
    }
}
