class Palindrome {
    static int countChecks = 0;

    void check(int number) {
        int original = number;
        int reverse = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        countChecks++;

        if (original == reverse)
            System.out.println(number + " is a palindrome.");
        else
            System.out.println(number + " is not a palindrome.");
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();

        p.check(121);
        p.check(123);

        System.out.println("Total checks: " + countChecks);
    }
}