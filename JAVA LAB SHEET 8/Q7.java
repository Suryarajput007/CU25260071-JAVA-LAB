public class Q7 {
    static <T> void display(T value) {                  // generic method: works for any type T
        System.out.println(value);
    }

    public static void main(String[] args) {
        display(10);                                    // Integer
        display(3.14);                                  // Double
        display("Hello");                               // String
        display('A');                                   // Character
    }
}
