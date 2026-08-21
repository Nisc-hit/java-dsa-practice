class Vehicle{
    String brand;
    int speed;
    Vehicle(String brand , int speed){
        this.brand = brand;
        this.speed = speed;
    }
    void display(){
        System.out.println(brand+" - "+speed+"km/h");
    }
}
class Car extends Vehicle{
    int numDoors;
    Car(String brand,int speed,int numDoors){
        super(brand,speed);
        this.numDoors = numDoors;
    }
    void displayFull(){
        display();
        System.out.println("Doors:"+numDoors);
    }
}

public class VehicleCarDemo {
    public static void main(String[] args){
        Car myCar = new Car("Honda",180,4);
        myCar.displayFull();
    }
    
}
