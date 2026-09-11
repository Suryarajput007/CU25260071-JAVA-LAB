import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int negative = -number;

        System.out.println("Negative value = " + negative);

        sc.close();
    }
}