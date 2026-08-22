interface Payable{
    double calculatePay();
}
class FullTimeEmployee implements Payable{
    double monthlySalary;
    FullTimeEmployee(double monthlySalary){this.monthlySalary = monthlySalary;}
    @Override
    public double calculatePay(){
        return monthlySalary;
    }
}
class Contractor implements Payable{
    double hourlyRate;
    int hoursWorked;
    Contractor(double hourlyRate,int hoursWorked){
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePay(){
        return hourlyRate*hoursWorked;
    }
}
public class PayableDemo {
    public static void main(String[] args){
        Payable emp = new FullTimeEmployee(55000);
        Payable contractor = new Contractor(500,120);
        System.out.println("Full-time pay="+emp.calculatePay());
        System.out.println("constractor pay = "+contractor.calculatePay()); 
    }
    
}
