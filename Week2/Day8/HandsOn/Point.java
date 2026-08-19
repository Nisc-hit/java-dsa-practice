public class Point {
    int x,y;
    Point(){
        x=0;
        y=0;
    }
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("(" +x+", "+y+")");
    }
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point();
        p1.display();
        p2.display();
    }
    
}
