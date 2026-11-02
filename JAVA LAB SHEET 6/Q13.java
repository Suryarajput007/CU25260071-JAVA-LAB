import java.util.Scanner;

class InvalidDosageException extends Exception {
    InvalidDosageException(String msg) { super(msg); }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String patient = sc.nextLine();
        System.out.print("Enter drug name: ");
        String drug = sc.nextLine();
        System.out.print("Enter dosage in mg: ");
        try {
            int dose = Integer.parseInt(sc.nextLine().trim());
            if (dose <= 0 || dose > 1000)               // valid range is 1-1000
                throw new InvalidDosageException("Dosage " + dose + " mg is outside 1-1000 mg");
            System.out.println(patient + ": " + drug + " " + dose + " mg is valid.");
        } catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: dosage must be a number");
        } finally {
            System.out.println("Dosage validation completed.");
        }
    }
}
