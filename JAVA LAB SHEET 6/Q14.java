import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    InvalidExamMarksException(String msg) { super(msg); }
}

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        try {
            int marks = Integer.parseInt(sc.nextLine().trim());
            if (marks < 0 || marks > 100)
                throw new InvalidExamMarksException("Marks " + marks + " are invalid (0-100 only)");
            System.out.println(marks >= 40 ? "PASS" : "FAIL");   // 40 or above passes
        } catch (InvalidExamMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: marks must be a number");
        } finally {
            System.out.println("Exam evaluation completed.");
        }
    }
}
