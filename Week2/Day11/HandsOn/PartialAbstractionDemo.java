abstract class Vehical{
    abstract void startEngine();
    void stopEngine(){
        System.out.println("engine stopped");
    }
}
class Bike extends Vehical{
  @Override
  void startEngine(){
    System.out.println("Bike engine started with a kick");
  }
}

public class PartialAbstractionDemo {
    public static void main(String[]args){
        Bike b = new Bike();
        b.startEngine();
        b.stopEngine();
    }
    
}
