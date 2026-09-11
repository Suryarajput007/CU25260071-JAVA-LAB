import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Frequency of elements:");

        for (int i = 0; i < n; i++) {

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(array[i] + " appears " + count + " time(s)");
        }

        sc.close();
    }
}