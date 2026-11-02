import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};               // array with 5 elements
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter index (0-4): ");
            int i = sc.nextInt();                       // index chosen by user
            System.out.println("Element = " + arr[i]);  // invalid index throws exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: invalid index");
        } catch (InputMismatchException e) {
            System.out.println("Error: please enter an integer");
        }
    }
}
