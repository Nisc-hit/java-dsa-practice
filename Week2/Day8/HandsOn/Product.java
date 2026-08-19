public class Product {
    String name;
    double price;
    Product(String name){
        this.name = name;
        this.price =0.0;
    }
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    void display(){
        System.out.println(name+" - Rs."+price);

    }
    public static void main(String[] args){
        Product p1 = new Product("Notebook");
        Product p2 = new Product("Laptop",45000);
        p1.display();
        p2.display();
    }
    
}
