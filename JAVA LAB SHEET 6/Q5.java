import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("Result = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero");
        } catch (InputMismatchException e) {
            System.out.println("Error: please enter integers only");
        } finally {                                     // always runs, exception or not
            System.out.println("Program execution completed.");
        }
    }
}
