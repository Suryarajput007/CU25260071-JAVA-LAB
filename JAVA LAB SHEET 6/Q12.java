import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String msg) { super(msg); }
}

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String name = sc.nextLine();
        System.out.print("Enter patient age: ");
        try {
            int age = Integer.parseInt(sc.nextLine().trim());   // non-numeric -> NumberFormatException
            if (age < 0 || age > 120)
                throw new InvalidPatientAgeException("Age " + age + " is outside 0-120");
            System.out.println("Patient " + name + " (age " + age + ") registered.");
        } catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: age must be a number");
        }
    }
}
