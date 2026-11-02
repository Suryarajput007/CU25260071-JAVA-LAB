import java.util.ArrayList;

public class Q9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();    // list that accepts only Integer
        for (int i = 1; i <= 10; i++) list.add(i * 10); // add 10 numbers
        for (int n : list) System.out.println(n);       // display using a loop
    }
}
