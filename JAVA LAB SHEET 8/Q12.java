import java.util.ArrayList;

public class Q12 {
    static class Container<T> {
        private ArrayList<T> items = new ArrayList<>();
        void add(T item) { items.add(item); }               // store an item
        T get(int index) { return items.get(index); }       // fetch by index
    }

    public static void main(String[] args) {
        Container<Integer> c1 = new Container<>();
        c1.add(10);
        Container<String> c2 = new Container<>();
        c2.add("Java");
        Container<Double> c3 = new Container<>();
        c3.add(9.9);
        System.out.println(c1.get(0) + " " + c2.get(0) + " " + c3.get(0));
    }
}
