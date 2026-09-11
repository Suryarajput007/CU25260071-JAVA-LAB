import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The entered integers are:");

        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}