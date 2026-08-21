class Person{
    String name;
    Person(String name){
        this.name = name;
        System.out.println("Person constructor ran for "+ name);
    }
}
class Student extends Person{
    int rollNumber;
    Student (String name,int rollNumber){
        super(name);
        this.rollNumber = rollNumber;
        System.out.println("student constructor ran , roll = "+rollNumber);
    }
}

public class SuperDemo {
    public static void main(String[]args){
        Student s = new Student("Nischit",101);
    }
    
}
