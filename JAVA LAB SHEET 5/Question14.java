// Question 14: Employee Salary Calculation
package question14;

class Employee {
    double basic;
    Employee(double basic) { this.basic = basic; }
    double calculateSalary() { return basic; }                 // basic only
}

class Manager extends Employee {
    Manager(double basic) { super(basic); }
    @Override
    double calculateSalary() { return basic + 0.20 * basic + 10000; }  // basic + 20% HRA + 10000 allowance
}

public class Question14 {
    public static void main(String[] args) {
        Employee e = new Employee(40000);
        Employee m = new Manager(40000);   // parent reference, child object
        System.out.println("Employee salary: " + e.calculateSalary() + "  (Employee version)");
        System.out.println("Manager salary : " + m.calculateSalary() + "  (Manager version executes)");
    }
}
