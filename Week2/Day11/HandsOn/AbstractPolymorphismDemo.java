abstract class Employee {
    String name;
    Employee(String name) { this.name = name; }
    abstract double calculateBonus();
}
class Manager extends Employee {
    Manager(String name) { super(name); }
    @Override
    double calculateBonus() {
        return 10000;
    }
}
class Developer extends Employee {
    Developer(String name) { super(name); }
    @Override
    double calculateBonus() {
        return 6000;
    }
}
public class AbstractPolymorphismDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Manager("Asha");
        employees[1] = new Developer("Ravi");
        for (Employee e : employees) {
            System.out.println(e.name + "'s bonus = " + e.calculateBonus());
        }
    }
}