// Question 3: Employee Salary Encapsulation
package question3;

class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
    public double getSalary() { return salary; }

    // Validation inside the setter
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Rejected: salary cannot be negative (" + salary + ").");
        } else if (salary > 1_000_000) {
            System.out.println("Rejected: salary cannot exceed 1,000,000 (" + salary + ").");
        } else {
            this.salary = salary;
            System.out.println("Salary set to " + salary);
        }
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + " | Name: " + employeeName + " | Salary: " + salary);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Karan Singh");
        e.setSalary(50000);      // valid
        e.displayDetails();
        e.setSalary(-100);       // invalid: negative
        e.setSalary(2_000_000);  // invalid: too high
        e.displayDetails();      // salary unchanged
    }
}
