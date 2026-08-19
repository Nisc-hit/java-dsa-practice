public class Student {
    String name;
    int rollNumber;
    double marks;
    Student(String name,int rollNumber,double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    void display(){
        System.out.println(name+"|roll:"+rollNumber+"| marks:"+marks);
    }
    public static void main(String[] args){
        Student s1 = new Student("Nischit",101,88.5);
         Student s2 = new Student("Namith",102,91.0);
         s1.display();
         s2.display();
    }
    
}
