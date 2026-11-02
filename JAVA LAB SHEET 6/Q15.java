import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String msg) { super(msg); }
}
class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String msg) { super(msg); }
}

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter medicine name: ");
        String med = sc.nextLine();
        try {
            System.out.print("Enter available quantity: ");
            int avail = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter required quantity: ");
            int req = Integer.parseInt(sc.nextLine().trim());
            if (avail < 0 || req < 0)
                throw new InvalidQuantityException("Quantity cannot be negative");
            if (req > avail)
                throw new InsufficientMedicineStockException("Only " + avail + " of " + med + " in stock");
            System.out.println("Issued " + req + " of " + med + ". Remaining: " + (avail - req));
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: quantity must be a number");
        } finally {
            System.out.println("Inventory transaction completed.");
        }
    }
}
