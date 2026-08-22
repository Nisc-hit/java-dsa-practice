abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){this.radius = radius;}
    @Override
    double area(){return Math.PI*radius*radius;}
}
public class AbstractInstantiationDemo {
    public static void main(String[] args){
        Shape s = new Circle(5);
        System.out.println("Area = "+s.area());

    }
    
}
