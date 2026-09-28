// Question 1: Student Encapsulation
package question1;

class Student {
    private String name;
    private int rollNo;
    private double marks;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getRollNo() { return rollNo; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }
    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    public void displayDetails() {
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks  : " + marks);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aman Verma");
        s.setRollNo(101);
        s.setMarks(87.5);

        System.out.println("Using getters:");
        System.out.println("Name   : " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Marks  : " + s.getMarks());

        System.out.println("\nUsing displayDetails():");
        s.displayDetails();
    }
}
