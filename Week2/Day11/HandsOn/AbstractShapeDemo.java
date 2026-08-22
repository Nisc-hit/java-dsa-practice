abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){this.radius= radius;}
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    double length,width;
    Rectangle(double length,double width){
        this.length=length;
        this.width= width;
    }
    @Override
    double area(){
        return length*width;
    }
}

public class AbstractShapeDemo {
    public static void main(String[]args){
        Shape c = new Circle(7);
        Shape r = new Rectangle(10,5);
        System.out.println("Circle area = "+c.area());
        System.out.println("Rectangle area = "+r.area());
    }
    
}
