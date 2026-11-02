import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(Arrays.asList(
            "Amit", "Bela", "Chirag", "Divya", "Esha", "Farhan", "Gita", "Hari", "Isha", "Jay"));
        for (String s : students) System.out.println(s);          // display all names
        System.out.println("Total students: " + students.size()); // total size
    }
}
