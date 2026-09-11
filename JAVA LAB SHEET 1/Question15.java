import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int original = num;

        int digit1 = num % 10;
        num = num / 10;

        int digit2 = num % 10;
        num = num / 10;

        int digit3 = num % 10;

        int sum = (digit1 * digit1 * digit1)
                + (digit2 * digit2 * digit2)
                + (digit3 * digit3 * digit3);

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        sc.close();
    }
}