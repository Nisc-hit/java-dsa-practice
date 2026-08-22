interface Drawable{
    void draw();
}
class Square implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing a shape");
    }
}
class Tringle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing a tringle");
    }
}

public class DrawableDemo {
    public static void main(String[] args){
        Drawable d1 = new Square();
        Drawable d2 = new Tringle();
        d1.draw();
        d2.draw();
    }
    
}
