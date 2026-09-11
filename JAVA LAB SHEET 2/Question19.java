public class Q19 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int number = 1; number <= 1000; number++) {
            int temp = number;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == number) {
                System.out.print(number + " ");
            }
        }
    }
}