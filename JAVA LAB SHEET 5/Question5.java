// Question 5: Person → Student
package question5;

class Person {
    String name;
    int age;

    Person(String name, int age) { this.name = name; this.age = age; }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course : " + course);
    }
}

public class Question5 {
    public static void main(String[] args) {
        Student s = new Student("Neha Gupta", 20, 202, "BCA");
        s.displayPerson();   // reused from Person
        s.displayStudent();
    }
}
