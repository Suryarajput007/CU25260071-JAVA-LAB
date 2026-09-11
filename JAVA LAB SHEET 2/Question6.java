import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        int steps = 0;

        while (number >= 1) {
            number /= 2;
            steps++;
        }

        System.out.println("Number of steps = " + steps);
        System.out.println("Final value = " + number);

        sc.close();
    }
}