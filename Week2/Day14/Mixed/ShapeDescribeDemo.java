abstract class Shape{
    abstract String describe();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){this.radius = radius;}
    @Override
    String describe(){
        return "A circle with radius"+radius;
    }
}
class Square extends Shape{
    double side;
    Square(double side){this.side = side;}
    @Override
    String describe(){
        return"A square with side"+side;
    }
}
public class ShapeDescribeDemo {
    public static void main(String[] args){
        Shape c =  new Circle(5);
        Shape s = new Square(4);
        System.out.println(c.describe());
        System.out.println(s.describe());
    }
    
}
