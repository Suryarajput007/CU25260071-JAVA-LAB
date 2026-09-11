class Calculator {
    static int operationsCount = 0;

    void add(int a, int b) {
        int result = a + b;
        operationsCount++;
        System.out.println("Addition = " + result);
    }

    void subtract(int a, int b) {
        int result = a - b;
        operationsCount++;
        System.out.println("Subtraction = " + result);
    }

    void multiply(int a, int b) {
        int result = a * b;
        operationsCount++;
        System.out.println("Multiplication = " + result);
    }

    void divide(int a, int b) {
        if (b != 0) {
            int result = a / b;
            operationsCount++;
            System.out.println("Division = " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(20, 10);
        c.subtract(20, 10);
        c.multiply(20, 10);
        c.divide(20, 10);

        System.out.println("Total operations = " + operationsCount);
    }
}