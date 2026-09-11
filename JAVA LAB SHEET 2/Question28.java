public class Q28 {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 50 excluding perfect squares:");

        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);

            if (root * root == i) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}