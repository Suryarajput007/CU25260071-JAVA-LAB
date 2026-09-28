// Question 8: Person → Employee → Manager
package question8;

// Person   : name, displayName()
// Employee : employeeId, displayEmployee()   (extends Person)
// Manager  : department, displayManager()    (extends Employee)
class Person {
    String name;
    Person(String name) { this.name = name; }
    void displayName() { System.out.println("Name       : " + name); }
}

class Employee extends Person {
    int employeeId;
    Employee(String name, int employeeId) { super(name); this.employeeId = employeeId; }
    void displayEmployee() { System.out.println("Employee ID: " + employeeId); }
}

class Manager extends Employee {
    String department;
    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }
    void displayManager() { System.out.println("Department : " + department); }
}

public class Question8 {
    public static void main(String[] args) {
        Manager m = new Manager("Sunita Rao", 501, "Finance");
        m.displayName();      // Person
        m.displayEmployee();  // Employee
        m.displayManager();   // Manager
    }
}
