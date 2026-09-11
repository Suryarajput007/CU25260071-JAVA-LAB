import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] array = new int[2][2][2];

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    array[i][j][k] = sc.nextInt();
                }
            }
        }

        int maximum = array[0][0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (array[i][j][k] > maximum) {
                        maximum = array[i][j][k];
                    }
                }
            }
        }

        System.out.println("Maximum element = " + maximum);

        sc.close();
    }
}