import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();

        double tax;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = income * 0.05;
        } else if (income <= 1000000) {
            tax = income * 0.20;
        } else {
            tax = income * 0.30;
        }

        System.out.println("Income: Rs. " + income);
        System.out.println("Tax: Rs. " + tax);

        sc.close();
    }
}