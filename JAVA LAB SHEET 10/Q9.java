import java.io.*;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("student_records.txt")) {
            for (int i = 1; i <= 5; i++) {              // accept 5 students
                System.out.println("Student " + i + ":");
                System.out.print("  Roll Number: "); String roll = sc.nextLine().trim();
                System.out.print("  Name       : "); String name = sc.nextLine().trim();
                System.out.print("  Course     : "); String course = sc.nextLine().trim();
                System.out.print("  Marks      : "); String marks = sc.nextLine().trim();
                fw.write(roll + "," + name + "," + course + "," + marks + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
            return;
        }
        System.out.println("\n--- Records in student_records.txt ---");
        try (BufferedReader br = new BufferedReader(new FileReader("student_records.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");           // roll, name, course, marks
                System.out.println("Roll: " + p[0] + " | Name: " + p[1] + " | Course: " + p[2] + " | Marks: " + p[3]);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
