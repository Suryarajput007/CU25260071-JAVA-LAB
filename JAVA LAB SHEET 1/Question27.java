import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter selling price: ");
        double sp = sc.nextDouble();

        if (sp > cp) {
            double profit = sp - cp;
            System.out.println("Profit: Rs. " + profit);
        } else if (cp > sp) {
            double loss = cp - sp;
            System.out.println("Loss: Rs. " + loss);
        } else {
            System.out.println("No profit and no loss.");
        }

        sc.close();
    }
}