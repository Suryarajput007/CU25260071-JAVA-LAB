import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter theory marks (%): ");
        double theory = sc.nextDouble();

        System.out.print("Enter practical marks (%): ");
        double practical = sc.nextDouble();

        System.out.print("Enter overall marks (%): ");
        double overall = sc.nextDouble();

        boolean pass = (theory >= 40 && practical >= 50)
                || overall >= 50;

        if (pass) {
            System.out.println("Student has passed the course.");
        } else {
            System.out.println("Student has failed the course.");
        }

        sc.close();
    }
}