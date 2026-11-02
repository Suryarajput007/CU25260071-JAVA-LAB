import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        String roll = sc.nextLine();
        System.out.print("Enter marks: ");
        String marks = sc.nextLine();
        try (FileWriter fw = new FileWriter("students.txt", true)) {    // true = append mode
            fw.write(name + ", " + roll + ", " + marks + "\n");
            System.out.println("Record appended to students.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
