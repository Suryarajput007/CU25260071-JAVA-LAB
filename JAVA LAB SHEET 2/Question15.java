import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count += temp & 1;
            temp = temp >> 1;
        }

        System.out.println("Number of set bits = " + count);

        sc.close();
    }
}