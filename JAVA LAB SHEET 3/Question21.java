import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int first = array[0];

        for (int i = 0; i < n - 1; i++) {
            array[i] = array[i + 1];
        }

        array[n - 1] = first;

        System.out.println("Array after left rotation:");

        for (int number : array) {
            System.out.print(number + " ");
        }

        sc.close();
    }
}