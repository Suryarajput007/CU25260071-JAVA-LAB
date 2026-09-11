import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] original = new int[n];
        int[] copy = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            copy[i] = original[i];
        }

        System.out.println("Original array:");

        for (int number : original) {
            System.out.print(number + " ");
        }

        System.out.println("\nCopied array:");

        for (int number : copy) {
            System.out.print(number + " ");
        }

        sc.close();
    }
}