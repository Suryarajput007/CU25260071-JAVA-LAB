import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};               // array with 5 elements
        try {
            System.out.print("Enter two numbers: ");
            int a = Integer.parseInt(sc.nextLine().trim());   // may throw NumberFormatException
            int b = Integer.parseInt(sc.nextLine().trim());
            System.out.println("Division = " + (a / b));      // may throw ArithmeticException
            System.out.print("Enter array index: ");
            int i = Integer.parseInt(sc.nextLine().trim());
            System.out.println("Element = " + arr[i]);        // may throw ArrayIndexOutOfBounds
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: invalid array index");
        } catch (NumberFormatException e) {
            System.out.println("Error: input is not a valid integer");
        }
    }
}
