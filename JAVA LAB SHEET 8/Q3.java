public class Q3 {
    static class Student<T> {                                      // T = type of student ID
        private T id;
        Student(T id) { this.id = id; }
        T getId() { return id; }
    }

    public static void main(String[] args) {
        Student<Integer> s = new Student<>(101);
        System.out.println("Student ID: " + s.getId());
    }
}
