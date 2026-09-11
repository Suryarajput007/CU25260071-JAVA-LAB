import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        if (height < 150) {
            System.out.println("Category: Short");
        } else if (height <= 170) {
            System.out.println("Category: Average");
        } else {
            System.out.println("Category: Tall");
        }

        sc.close();
    }
}