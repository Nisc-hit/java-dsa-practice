public class Car {
    String brand;
    String model;
    int year;
    Car(String brand, String model,int year){
        this.brand= brand;
        this.model=model;
        this.year=year;
    } 
    void displayInfo(){
        System.out.println(year+" "+brand+" "+ model);
    }
    public static void main(String[] args){
        Car myCar= new Car("Toyota","Corolla",2022);
        myCar.displayInfo();
    }
}
