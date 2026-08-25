interface Describable{
    String getDescription();
}
class Product implements Describable{
    String name;
    double price;
    Product (String name,double price){
        this.name = name;
        this.price = price;

    }
    @Override
    public String getDescription(){
        return name +" -Rs. "+price;
    }

}

public class DescribableDemo {
    public static void main(String[] args){
        Describable p = new Product("laptop",4500);
        System.out.println(p.getDescription());
    }
    
}
