public class Q19 {
    public static void main(String[] args) {

        int[][] jagged = new int[3][];

        jagged[0] = new int[]{10, 20};
        jagged[1] = new int[]{30, 40, 50};
        jagged[2] = new int[]{60, 70, 80, 90};

        System.out.println("Jagged Array:");

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}