public class Temperature {
    private double celsius;
    Temperature(double celsius){
        this.celsius = celsius;
    }
    public double getCelsius(){ return celsius;}
    public double getFahrenheit(){
        return (celsius*9/5)+32;
    }
    public static void main(String[] args){
        Temperature temp = new Temperature(37);
        System.out.println("Celsius = "+temp.getCelsius());
        System.out.println("Fahrenheit = "+ temp.getFahrenheit());
    }
}
