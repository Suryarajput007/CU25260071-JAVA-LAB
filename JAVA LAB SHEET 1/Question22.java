import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        if (length == breadth) {
            System.out.println("The shape is a square.");
        } else {
            System.out.println("The shape is a rectangle.");
        }

        sc.close();
    }
}