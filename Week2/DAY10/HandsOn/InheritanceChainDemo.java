class Employee{
    String name;
    Employee(String name){this.name = name;}
    void work(){System.out.println(name + " is working");}
}
class Manager extends Employee{
    int teamSize;
    Manager(String name, int teamSize){
        super(name);
        this.teamSize = teamSize;
    }
    void manageTeam(){System.out.println(name+"manages a team of "+teamSize);}
}
class SeniorManager extends Manager{
    String department;
    SeniorManager(String name,int teamSize,String department){
        super(name,teamSize);
        this.department = department;
    }
    void overseeDepartment(){System.out.println(name+"oversees the "+department +"department");}
}

public class InheritanceChainDemo {
    public static void main(String[]args){
        SeniorManager sm = new SeniorManager("Asha",25,"Engineering");
        sm.work();
        sm.manageTeam();
        sm.overseeDepartment();
    }
        
}
