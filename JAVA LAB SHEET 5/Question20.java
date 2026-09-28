// Question 20: University Employee System — Integrated OOP
package question20;

/*
 *                 Researcher (interface)
 *   Employee            |
 *    /    \             |
 * Teacher  Admin  <-----+ (Teacher implements Researcher)
 *    |
 * VisitingTeacher
 *
 * Single      : Employee -> Admin, Employee -> Teacher
 * Multilevel  : Employee -> Teacher -> VisitingTeacher
 * Hierarchical: Employee -> Teacher and Employee -> Admin
 * Multiple    : Teacher implements interface (extends class + implements) => hybrid
 */
interface Researcher { void conductResearch(); }

class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary);
    }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
        else System.out.println("Invalid salary ignored.");
    }

    void displayDetails() {
        System.out.println("ID: " + employeeId + " | Name: " + employeeName
                + " | Base Salary: " + salary);
    }
    double calculateSalary() { return salary; }
}

class Teacher extends Employee implements Researcher {
    private String subject;

    Teacher(int id, String name, double salary, String subject) {
        super(id, name, salary);
        this.subject = subject;
    }
    public String getSubject() { return subject; }

    void teach() { System.out.println(getEmployeeName() + " is teaching " + subject + "."); }

    @Override public void conductResearch() {
        System.out.println(getEmployeeName() + " is conducting research in " + subject + ".");
    }
    @Override double calculateSalary() { return super.calculateSalary() + 0.30 * getSalary(); } // + 30% allowance
    @Override void displayDetails() { super.displayDetails(); System.out.println("Subject: " + subject); }
}

class VisitingTeacher extends Teacher {
    private int hoursWorked;
    private static final double RATE_PER_HOUR = 1500;

    VisitingTeacher(int id, String name, String subject, int hoursWorked) {
        super(id, name, 0, subject);
        this.hoursWorked = hoursWorked;
    }
    @Override double calculateSalary() { return hoursWorked * RATE_PER_HOUR; }
    @Override void displayDetails() { super.displayDetails(); System.out.println("Hours Worked: " + hoursWorked); }
}

class Admin extends Employee {
    private String department;

    Admin(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }
    void manageDepartment() { System.out.println(getEmployeeName() + " is managing the " + department + " department."); }
    @Override double calculateSalary() { return super.calculateSalary() + 5000; }   // + fixed admin allowance
    @Override void displayDetails() { super.displayDetails(); System.out.println("Department: " + department); }
}

public class Question20 {
    public static void main(String[] args) {
        Teacher t = new Teacher(1, "Dr. Anita Sharma", 60000, "Data Structures");
        VisitingTeacher vt = new VisitingTeacher(2, "Mr. Rahul Jain", "Java", 40);
        Admin a = new Admin(3, "Mrs. Kavita Roy", 45000, "Examinations");

        Employee[] staff = { t, vt, a };   // multiple objects, polymorphic array
        for (Employee e : staff) {
            e.displayDetails();
            System.out.println("Calculated Salary: " + e.calculateSalary());
            System.out.println("----------------------------------------");
        }

        t.teach();
        t.conductResearch();
        vt.teach();
        vt.conductResearch();      // inherited from Teacher (interface method)
        a.manageDepartment();

        Researcher r = t;          // interface reference
        r.conductResearch();
    }
}
