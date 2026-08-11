public class AreaPerimeter{
    public static void main(String [] args){
        double length=10,breadth=5;
        double rectArea=length*breadth;
        double rectPerimeter=2*(length+breadth);
        System.out.println("Rectangle Area="+rectArea);
        System.out.println("Rectangle Perimeter="+rectPerimeter);
        //circle
        double radius=7;
        double circleArea=3.41*radius*radius;
        double circumference=2*3.14*radius;
        System.out.println("Circle Area="+circleArea);
        System.out.println("Circle circumference="+circumference);

    }
}