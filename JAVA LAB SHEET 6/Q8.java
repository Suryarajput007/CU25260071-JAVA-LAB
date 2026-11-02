public class Q8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {                                             // outer try: division
            try {                                         // inner try: array access
                System.out.println(arr[5]);               // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: invalid array index");
            }
            System.out.println("Division = " + (10 / 0)); // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: division by zero");
        }
    }
}
