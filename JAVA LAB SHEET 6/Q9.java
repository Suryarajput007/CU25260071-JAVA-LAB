public class Q9 {
    static void method3() { int x = 10 / 0; }           // generates ArithmeticException
    static void method2() { method3(); }                // does not handle, exception propagates
    static void method1() { method2(); }                // does not handle, exception propagates

    public static void main(String[] args) {
        try {
            method1();                                  // main -> method1 -> method2 -> method3
        } catch (ArithmeticException e) {               // finally handled here
            System.out.println("Handled in main: " + e.getMessage());
        }
    }
}
