import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>(Arrays.asList(70, 85, 90, 65, 78));
        System.out.println("First : " + marks.get(0));
        System.out.println("Middle: " + marks.get(marks.size() / 2));
        System.out.println("Last  : " + marks.get(marks.size() - 1));
    }
}
