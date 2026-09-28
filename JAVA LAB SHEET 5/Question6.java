// Question 6: Employee → Manager with Encapsulation
package question6;

class Employee {
    private String name;
    private double salary;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

class Manager extends Employee {
    private String department;

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    void displayManager() {
        // private fields are reached only through inherited getters
        System.out.println("Name      : " + getName());
        System.out.println("Salary    : " + getSalary());
        System.out.println("Department: " + department);
    }
}

public class Question6 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Vikram Rao");
        m.setSalary(90000);
        m.setDepartment("Sales");
        m.displayManager();
    }
}
