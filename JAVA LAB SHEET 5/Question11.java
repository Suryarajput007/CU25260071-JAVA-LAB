// Question 11: Person → Student and Teacher
package question11;

class Person {
    String name;
    Person(String name) { this.name = name; }
    void displayName() { System.out.println("Name: " + name); }
}

class Student extends Person {
    String course;
    Student(String name, String course) { super(name); this.course = course; }
    void study() { System.out.println(name + " is studying " + course + "."); }
}

class Teacher extends Person {
    String subject;
    Teacher(String name, String subject) { super(name); this.subject = subject; }
    void teach() { System.out.println(name + " is teaching " + subject + "."); }
}

public class Question11 {
    public static void main(String[] args) {
        Student s = new Student("Ishita", "BCA");
        Teacher t = new Teacher("Dr. Mehta", "Java");
        s.displayName(); s.study();
        t.displayName(); t.teach();
    }
}
