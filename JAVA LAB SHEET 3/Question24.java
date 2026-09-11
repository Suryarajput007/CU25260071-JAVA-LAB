import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        int[] unique = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {

            boolean duplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == unique[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                unique[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }

        sc.close();
    }
}