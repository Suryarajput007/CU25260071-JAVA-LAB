// Question 19: Employee → Developer + Programmer + Researcher
package question19;

// Employee    Programmer   Researcher
//      \          |          /
//            Developer
interface Programmer { void writeCode(); }
interface Researcher { void conductResearch(); }

class Employee {
    private String name;
    private int employeeId;

    Employee(String name, int employeeId) { this.name = name; this.employeeId = employeeId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    void displayEmployee() { System.out.println("Name: " + name + " | ID: " + employeeId); }
}

class Developer extends Employee implements Programmer, Researcher {
    Developer(String name, int id) { super(name, id); }

    @Override public void writeCode()       { System.out.println(getName() + " is writing code."); }
    @Override public void conductResearch() { System.out.println(getName() + " is conducting research."); }
}

public class Question19 {
    public static void main(String[] args) {
        Developer d = new Developer("Rohan Mishra", 321);
        d.displayEmployee();
        d.writeCode();
        d.conductResearch();
    }
}
