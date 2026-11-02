public class Q8 {
    static <T> void display(T a, T b, T c) {            // all three values must be of the same type
        System.out.println(a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {
        display(1, 2, 3);
        display("A", "B", "C");
        display(1.5, 2.5, 3.5);
    }
}
