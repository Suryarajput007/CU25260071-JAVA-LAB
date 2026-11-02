import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 12, 18, 23, 31, 40, 47, 55, 62, 78));
        Scanner sc = new Scanner(System.in);
        System.out.print("Numbers: " + list + "\nEnter a number to search: ");
        if (!sc.hasNextInt()) {                         // validate input
            System.out.println("Please enter a valid integer.");
            return;
        }
        int n = sc.nextInt();
        System.out.println(list.contains(n) ? n + " exists in the list" : n + " does not exist in the list");
    }
}
