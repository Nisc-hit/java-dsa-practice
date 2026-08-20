public class Student {
    private String name;
    private int rollNumber;
    private double marks;

    Student(String name,int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String getName(){ return name;}
    public void setName(String name){this.name = name;}
    public double getMarks(){ return marks;}
    public void setMarks(double marks){ this.marks = marks;}
    public static void main(String[] args){
        Student s1 = new Student("Nischit",101,88.5);
        System.out.println(s1.getName()+" - " +s1.getMarks());
        s1.setMarks(92.0);
        System.out.println("Updated marks : "+s1.getMarks());
    }
}
