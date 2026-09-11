import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check whether number is a power of 4
        int temp = number;

        while (temp > 1 && (temp & 3) == 0) {
            temp = temp >> 2;
        }

        boolean powerOf4 = (temp == 1);

        if (powerOf4) {
            System.out.println(number + " is a power of 4.");
        } else {
            System.out.println(number + " is not a power of 4.");
        }

        // Toggle the 3rd bit
        int toggled = number ^ (1 << 2);

        System.out.println("After toggling 3rd bit = " + toggled);

        // Multiplication table
        System.out.println("Multiplication table:");

        for (int i = 1; i <= 20; i++) {

            int result = number * i;

            // Skip multiples of 6
            if (result % 6 == 0) {
                continue;
            }

            // Stop at a multiple of 48
            if (result % 48 == 0) {
                break;
            }

            System.out.println(number + " x " + i + " = " + result);
        }

        sc.close();
    }
}