import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidMarksException extends Exception {         // custom checked exception
    InvalidMarksException(String msg) { super(msg); }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100)
                throw new InvalidMarksException("Marks " + marks + " are outside 0-100");
            System.out.println("Valid marks: " + marks);
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: please enter an integer");
        }
    }
}
