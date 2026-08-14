public class ReverseNumberMethod {
    static int reverse(int num){
        int reversed=0;
        while(num>0){
            reversed = reversed*10+(num%10);
            num/=10;
        }
        return reversed;
    }
    public static void main(String[] args){
        System.out.println("Reversed="+ reverse(1234));
    }
}
