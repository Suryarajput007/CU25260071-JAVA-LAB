import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;
        int firstDigit = num / 10000;

        if (firstDigit == lastDigit) {
            System.out.println("First and last digits are the same.");
        } else {
            System.out.println("First and last digits are not the same.");
        }

        sc.close();
    }
}