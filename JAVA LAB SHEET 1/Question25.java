import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter logical operator (>, <, ==, !=): ");
        String op = sc.next();

        if (op.equals(">")) {
            System.out.println("Result: " + (a > b));
        } else if (op.equals("<")) {
            System.out.println("Result: " + (a < b));
        } else if (op.equals("==")) {
            System.out.println("Result: " + (a == b));
        } else if (op.equals("!=")) {
            System.out.println("Result: " + (a != b));
        } else {
            System.out.println("Invalid operator.");
        }

        sc.close();
    }
}