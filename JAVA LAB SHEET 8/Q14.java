import java.util.ArrayList;

public class Q14 {
    static <T> void showAll(ArrayList<T> list) {        // generic method works for any ArrayList<T>
        for (T item : list) System.out.print(item + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1); nums.add(2); nums.add(3);
        ArrayList<String> words = new ArrayList<>();
        words.add("red"); words.add("green"); words.add("blue");
        showAll(nums);
        showAll(words);
    }
}
