class Employee {
    String name;
    Employee(String name) { this.name = name; }
    String getDetails() {
        return "Employee: " + name;
    }
}
class Manager extends Employee {
    int teamSize;
    Manager(String name, int teamSize) {
        super(name);
        this.teamSize = teamSize;
    }
    @Override
    String getDetails() {
        return "Manager: " + name + " (Team size: " + teamSize + ")";
    }
}
public class EmployeeDetailsDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Ravi");
        employees[1] = new Manager("Asha", 10);
        for (Employee e : employees) {
            System.out.println(e.getDetails());
        }
    }
}