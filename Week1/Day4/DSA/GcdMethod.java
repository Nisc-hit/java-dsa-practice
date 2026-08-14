public class GcdMethod {
    static int gcd(int a,int b){
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args){
        System.out.println("GCD = "+ gcd(48,60));
    }
}
