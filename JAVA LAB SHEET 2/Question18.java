public class Q18 {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;

        System.out.println("First 20 Fibonacci terms:");

        for (int i = 1; i <= 20; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}