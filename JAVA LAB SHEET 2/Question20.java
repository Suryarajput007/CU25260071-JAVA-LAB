import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";
        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.");
            }

        } while (!password.equals(correctPassword));

        System.out.println("Password correct. Access granted.");

        sc.close();
    }
}