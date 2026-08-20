public class Employee {
    private String name;
    private double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double getSalary(){return salary;}
    public static void main(String[] args){
        Employee emp = new Employee("Ravi",55000);
        System.out.println("Salary = "+emp.getSalary());
    }
}
