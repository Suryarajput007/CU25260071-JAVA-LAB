import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }

            if (number < minimum) {
                minimum = number;
            }
        }

        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);

        sc.close();
    }
}