import java.util.ArrayList;

public class Q10 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Amit"); names.add("Binita"); names.add("Chetan");
        names.add("Divya"); names.add("Esha");                    // add()
        System.out.println("List        : " + names);
        System.out.println("get(2)      : " + names.get(2));      // get()
        names.set(1, "Bhavna");                                   // set(): replace index 1
        System.out.println("After set   : " + names);
        names.remove(3);                                          // remove(): delete index 3
        System.out.println("After remove: " + names);
        System.out.println("size()      : " + names.size());      // size()
    }
}
