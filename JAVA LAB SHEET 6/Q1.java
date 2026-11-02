import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // object to read keyboard input
        try {
            System.out.print("Enter two integers: ");
            int a = sc.nextInt();                       // numerator
            int b = sc.nextInt();                       // denominator
            System.out.println("Result = " + (a / b));  // throws ArithmeticException if b == 0
        } catch (ArithmeticException e) {               // handles divide by zero
            System.out.println("Error: denominator cannot be 0");
        } catch (InputMismatchException e) {            // handles non-integer input
            System.out.println("Error: please enter integers only");
        }
    }
}
