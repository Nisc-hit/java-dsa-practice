public class ArmstrongMethod {
    static boolean isArmstrong(int num){
        int original = num,sum=0;
        while(num>0){
            int digit = num%10;
            sum+=digit*digit*digit;
            num/=10;
        }
        return sum == original;
    }
    public static void main(String[] args){
        System.out.println("153 is Armstrong?" + isArmstrong(153));
    }
    
}
