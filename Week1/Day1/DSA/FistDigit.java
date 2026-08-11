public class FistDigit {
    public static void main(String [] args){
        int num = 4582;
        while(num>=10){
            num = num / 10;
        }
        System.out.println("First Digit="+num);
    }
    
}
