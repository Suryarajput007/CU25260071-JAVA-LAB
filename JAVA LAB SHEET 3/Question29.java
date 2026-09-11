import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] jagged = new int[rows][];

        for (int i = 0; i < rows; i++) {

            System.out.print("Enter number of elements in row "
                    + (i + 1) + ": ");

            int size = sc.nextInt();

            jagged[i] = new int[size];

            System.out.println("Enter elements:");

            for (int j = 0; j < size; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }

        // Sorting each row using Bubble Sort
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < jagged[i].length - 1; j++) {

                for (int k = 0; k < jagged[i].length - 1 - j; k++) {

                    if (jagged[i][k] > jagged[i][k + 1]) {

                        int temp = jagged[i][k];
                        jagged[i][k] = jagged[i][k + 1];
                        jagged[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("\nJagged Array after sorting each row:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}