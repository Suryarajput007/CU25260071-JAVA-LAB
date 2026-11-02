import java.util.ArrayList;

public class Q15 {
    static class Student<T, U, V> {                                // T = ID, U = Name, V = Marks
        private final T id; private final U name; private final V marks;
        Student(T id, U name, V marks) { this.id = id; this.name = name; this.marks = marks; }
        T getId() { return id; }
        @Override public boolean equals(Object o) {         // students are equal if IDs match (needed by contains())
            return o instanceof Student<?, ?, ?> s && id.equals(s.id);
        }
        @Override public int hashCode() { return id.hashCode(); }
        @Override public String toString() { return "ID: " + id + ", Name: " + name + ", Marks: " + marks; }
    }

    static ArrayList<Student<Integer, String, Double>> list = new ArrayList<>();   // type-safe list

    static void displayAll() {
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
    }

    static void search(int id) {
        Student<Integer, String, Double> key = new Student<>(id, "", 0.0);
        if (list.contains(key)) System.out.println("Found: " + list.get(list.indexOf(key)));
        else System.out.println("Student with ID " + id + " not found");
    }

    public static void main(String[] args) {
        list.add(new Student<>(101, "Amit", 88.5));
        list.add(new Student<>(102, "Bela", 91.0));
        list.add(new Student<>(103, "Chirag", 76.25));
        list.add(new Student<>(104, "Divya", 82.0));
        list.add(new Student<>(105, "Esha", 69.5));
        System.out.println("--- All students ---");
        displayAll();
        System.out.println("--- Search ---");
        search(103);
        search(999);
        System.out.println("Total students: " + list.size());
        // list.add(new Student<>("X", "Y", 1.0));      // compile-time ERROR: ID must be Integer (type safety)
        System.out.println("Type safety: only Student<Integer,String,Double> can be added to this list.");
    }
}
