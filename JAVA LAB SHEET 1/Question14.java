import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("It is a digit.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("It is an uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is a lowercase letter.");
        } else {
            System.out.println("It is a special character.");
        }

        sc.close();
    }
}