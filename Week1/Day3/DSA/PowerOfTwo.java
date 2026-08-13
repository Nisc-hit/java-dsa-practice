class Solution{
    public boolean isPowerOfTwo(int n){
        if(n<=0)
            return false;
        while(n%2==0){
            n/=2;
        }
        return n ==1;
    }}
    public class PowerOfTwo {
      public static void main (String[] args){
        int n=64;
        int original = n;
        boolean result = true;
        if(n<= 0){
            result = false;
        }else{
            while(n%2==0){
                n/=2;
            }
            result = (n==1);
        }
        System.out.println(original+" is power of two?"+result);

      }
    
}
