import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n = Math.abs(num);

        if (n < 10) {
            System.out.println("Number of digits: 1");
        } else if (n < 100) {
            System.out.println("Number of digits: 2");
        } else if (n < 1000) {
            System.out.println("Number of digits: 3");
        } else if (n < 10000) {
            System.out.println("Number of digits: 4");
        } else {
            System.out.println("Number has 5 or more digits.");
        }

        sc.close();
    }
}