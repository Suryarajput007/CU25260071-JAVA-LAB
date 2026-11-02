public class Q13 {
    static class Student<T, U, V> {                                // T = ID, U = Name, V = Marks
        private T id; private U name; private V marks;
        Student(T id, U name, V marks) { this.id = id; this.name = name; this.marks = marks; }
        void display() { System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks); }
    }

    public static void main(String[] args) {
        new Student<Integer, String, Double>(1, "Amit", 88.5).display();
        new Student<Integer, String, Integer>(2, "Bela", 91).display();
        new Student<String, String, Double>("S-3", "Chirag", 76.25).display();
    }
}
