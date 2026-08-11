public class TempertaureConversion {
    public static void main(String[] args){
        double celsius=37;
        double fahrenheit = (celsius *9/5)+32;
        System.out.println(celsius+"C="+ fahrenheit +"F");
        double f=98.6;
        double c= (f-32)*5/9;
        System.out.println(f + "F="+c+"C");
    }

    
}
