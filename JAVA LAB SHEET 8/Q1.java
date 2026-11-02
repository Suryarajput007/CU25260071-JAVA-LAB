public class Q1 {
    static class Box<T> {                                          // T = any type decided at object creation
        private T value;
        Box(T value) { this.value = value; }
        T get() { return value; }
    }

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(100);
        Box<String>  b2 = new Box<>("Java");
        Box<Double>  b3 = new Box<>(99.5);
        System.out.println("Integer: " + b1.get());
        System.out.println("String : " + b2.get());
        System.out.println("Double : " + b3.get());
    }
}
