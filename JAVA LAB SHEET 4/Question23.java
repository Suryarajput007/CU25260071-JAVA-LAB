class PrimeChecker {
    static int totalPrimeChecks = 0;

    void check(int number) {
        boolean prime = true;

        if (number <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        totalPrimeChecks++;

        if (prime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }

    public static void main(String[] args) {
        PrimeChecker p = new PrimeChecker();

        p.check(17);
        p.check(20);

        System.out.println("Total prime checks: "
                + totalPrimeChecks);
    }
}