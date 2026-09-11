import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int multiplication = number << power;
        int division = number >> power;

        System.out.println("Multiplication by 2^" + power +
                " = " + multiplication);

        System.out.println("Division by 2^" + power +
                " = " + division);

        sc.close();
    }
}