// Question 12: Employee → Developer and Manager
package question12;

class Employee {                                   // inherited members: name, id, displayEmployee()
    String employeeName;
    int employeeId;
    Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }
    void displayEmployee() {
        System.out.println("Name: " + employeeName + " | ID: " + employeeId);
    }
}

class Developer extends Employee {                 // child-specific: programmingLanguage, writeCode()
    String programmingLanguage;
    Developer(String n, int id, String lang) { super(n, id); programmingLanguage = lang; }
    void writeCode() { System.out.println(employeeName + " is writing code in " + programmingLanguage + "."); }
}

class Manager extends Employee {                   // child-specific: department, conductMeeting()
    String department;
    Manager(String n, int id, String dept) { super(n, id); department = dept; }
    void conductMeeting() { System.out.println(employeeName + " is conducting a meeting for " + department + "."); }
}

public class Question12 {
    public static void main(String[] args) {
        Developer d = new Developer("Arjun", 11, "Java");
        Manager m = new Manager("Priya", 12, "Engineering");
        d.displayEmployee(); d.writeCode();
        m.displayEmployee(); m.conductMeeting();
    }
}
