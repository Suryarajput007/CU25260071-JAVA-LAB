import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>(Arrays.asList("Java", "Python", "DBMS", "Networks", "AI"));
        System.out.println("Courses: " + courses);
        System.out.print("Enter course to search: ");
        String c = new Scanner(System.in).nextLine().trim();
        System.out.println(courses.contains(c) ? c + " exists" : c + " does not exist");
    }
}
