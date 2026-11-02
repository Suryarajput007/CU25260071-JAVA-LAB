import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) { super(msg); }
}

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter account balance: ");
            double balance = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter withdrawal amount: ");
            double amt = Double.parseDouble(sc.nextLine().trim());
            if (amt < 0)                                // rule 1
                throw new IllegalArgumentException("Withdrawal amount cannot be negative");
            if (amt > balance)                          // rule 2 and 3
                throw new InsufficientBalanceException("Insufficient balance. Available: " + balance);
            balance -= amt;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {             // must come before IllegalArgumentException
            System.out.println("Error: please enter valid numbers");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Bank transaction completed.");
        }
    }
}
