public class Book {
    private String title;
    private String author;
    Book(String title,String author){
        this.title = title;
        this.author = author;
    }
    @Override
    public String toString(){
        return"\"" + title +"\"by"+author;
    }
    public static void main(String[] args){
        Book b1 =new Book("Atomic Habits","James Clear");
        System.out.println(b1);
    }
}
