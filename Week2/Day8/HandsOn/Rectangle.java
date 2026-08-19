public class Rectangle {
    double length;
    double width;
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    double area(){
        return length*width;
    }
    double perimeter(){
        return 2*(length+width);
    }
    public static void main(String[] args){
        Rectangle rect = new Rectangle(10,5);
        System.out.println("Area = "+rect.area());
        System.out.println("Perimeter = "+ rect.perimeter());
    }

    
}
