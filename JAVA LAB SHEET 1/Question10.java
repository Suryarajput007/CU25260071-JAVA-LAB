import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is the greatest number.");
        } else if (b > a) {
            System.out.println(b + " is the greatest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}