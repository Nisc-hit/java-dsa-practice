public class Book {
    String title;
    String author;
    double price;
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void displayInfo(){
        System.out.println(title+"by"+author+"-Rs."+price);
    }
    public static void main(String[] args){
        Book b1 = new Book("Atomic Habits","James Clear",399.0);
        b1.displayInfo();
    }
}
