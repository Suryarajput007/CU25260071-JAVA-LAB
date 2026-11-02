import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q14 {
    static long time(Runnable r) {                      // returns running time in microseconds
        long start = System.nanoTime();
        r.run();
        return (System.nanoTime() - start) / 1000;
    }

    static long[] test(List<Integer> list) {            // same operations for any List
        long[] t = new long[5];
        t[0] = time(() -> { for (int i = 0; i < 50000; i++) list.add(i); });        // insertion at end
        t[1] = time(() -> { for (int i = 0; i < 10000; i++) list.add(0, i); });     // insertion at start
        t[2] = time(() -> { for (int i = 0; i < 5000; i++) list.get(i * 10); });    // get(index)
        t[3] = time(() -> { for (int i = 0; i < 10000; i++) list.remove(0); });     // deletion at start
        t[4] = time(() -> { long s = 0; for (int n : list) s += n; });              // iteration
        System.out.println(list.getClass().getSimpleName() + " final size() = " + list.size());
        return t;
    }

    public static void main(String[] args) {
        test(new ArrayList<>());                        // warm-up run so JIT does not distort results
        test(new LinkedList<>());
        long[] a = test(new ArrayList<>());
        long[] l = test(new LinkedList<>());
        String[] ops = {"Insert at end", "Insert at start", "get(index)", "Delete at start", "Iteration"};
        System.out.println("\nTime in microseconds (smaller is faster)");
        System.out.printf("%-17s %12s %12s%n", "Operation", "ArrayList", "LinkedList");
        for (int i = 0; i < ops.length; i++)
            System.out.printf("%-17s %12d %12d%n", ops[i], a[i], l[i]);
        System.out.println("\nObservation: ArrayList is faster for get(index); LinkedList is faster for insert/delete at the start.");
    }
}
