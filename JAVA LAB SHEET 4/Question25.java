class Factorial {
    static int totalCalls = 0;

    void calculate(int number) {
        int n = number;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        totalCalls++;

        System.out.println("Factorial of " + number
                + " = " + factorial);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();

        f.calculate(5);
        f.calculate(4);

        System.out.println("Total calls: " + totalCalls);
    }
}