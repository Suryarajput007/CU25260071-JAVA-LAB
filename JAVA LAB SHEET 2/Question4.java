import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial number of visitors: ");
        int visitors = sc.nextInt();

        System.out.println("Initial visitors = " + visitors);

        // Prefix increment: visitor enters
        System.out.println("After one visitor enters = " + (++visitors));

        // Postfix increment
        System.out.println("Postfix increment value = " + (visitors++));
        System.out.println("Visitors after increment = " + visitors);

        // Prefix decrement: visitor leaves
        System.out.println("After one visitor leaves = " + (--visitors));

        // Postfix decrement
        System.out.println("Postfix decrement value = " + (visitors--));
        System.out.println("Visitors after decrement = " + visitors);

        sc.close();
    }
}