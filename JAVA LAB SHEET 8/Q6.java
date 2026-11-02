public class Q6 {
    static class Employee<T, U> {                                  // T = id type, U = name type
        private T id;
        private U name;
        Employee(T id, U name) { this.id = id; this.name = name; }
        void display() { System.out.println("ID: " + id + ", Name: " + name); }
    }

    public static void main(String[] args) {
        new Employee<Integer, String>(101, "Ravi").display();
        new Employee<String, String>("E-202", "Sita").display();
    }
}
