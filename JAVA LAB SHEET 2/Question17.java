import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int rotated = (number << 2) | (number >>> 30);

        System.out.println("Original number = " + number);
        System.out.println("After left rotation by 2 bits = " + rotated);

        sc.close();
    }
}