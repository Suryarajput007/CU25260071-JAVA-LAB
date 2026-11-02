import java.io.*;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("employees.txt")) {          // creates the file
            System.out.print("How many employees? ");
            int n = Integer.parseInt(sc.nextLine().trim());
            for (int i = 1; i <= n; i++) {
                System.out.println("Employee " + i + ":");
                System.out.print("  ID        : "); String id = sc.nextLine().trim();
                System.out.print("  Name      : "); String name = sc.nextLine().trim();
                System.out.print("  Department: "); String dept = sc.nextLine().trim();
                System.out.print("  Salary    : "); String sal = sc.nextLine().trim();
                fw.write(id + "," + name + "," + dept + "," + sal + "\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: please enter a valid number.");
            return;
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
            return;
        }
        System.out.print("\nEnter Employee ID to search: ");
        String key = sc.nextLine().trim();
        boolean found = false;
        try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                if (p[0].equals(key)) {                 // match on Employee ID
                    System.out.println("ID: " + p[0] + " | Name: " + p[1] + " | Dept: " + p[2] + " | Salary: " + p[3]);
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println("Employee record not found.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: employees.txt does not exist.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
