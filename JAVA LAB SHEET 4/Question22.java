class Armstrong {
    static int totalChecks = 0;

    void check(int number) {
        int original = number;
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
        }

        totalChecks++;

        if (sum == original)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();

        a.check(153);
        a.check(123);

        System.out.println("Total checks: " + totalChecks);
    }
}