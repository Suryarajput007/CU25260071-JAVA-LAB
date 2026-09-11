class Employee {
    String name;
    double salary;

    static String organization = "ABC Corporation";

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void compareSalary(Employee other) {
        double salary1 = this.salary;
        double salary2 = other.salary;

        System.out.println("Organization: " + organization);
        System.out.println(this.name + " Salary: " + salary1);
        System.out.println(other.name + " Salary: " + salary2);

        if (salary1 > salary2) {
            System.out.println(this.name
                    + " has higher salary.");
        } else if (salary2 > salary1) {
            System.out.println(other.name
                    + " has higher salary.");
        } else {
            System.out.println("Both employees have equal salary.");
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", 50000);
        Employee e2 = new Employee("Aman", 45000);

        e1.compareSalary(e2);
    }
}