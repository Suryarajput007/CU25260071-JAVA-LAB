import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalRainfall = 0;

        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter rainfall for day " + day + " (mm): ");
            double rainfall = sc.nextDouble();

            totalRainfall += rainfall;
        }

        System.out.println("Total rainfall for 7 days = "
                + totalRainfall + " mm");

        sc.close();
    }
}