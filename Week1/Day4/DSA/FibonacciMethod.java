class Solution{
    public int fib(int n){
        if(n==0) return 0;
        if (n==1)return 1;
        int first = 0,second = 1;
        for(int i=2;i<=n;i++){
            int next = first+second;
            first = second;
            second = next;
        }
        return second;
    }
}

public class FibonacciMethod {
    static int fib(int n){
        if(n== 0)return 0;
        if(n==1) return 1;
        int first = 0,second = 1;
        for(int i=2;i<=n;i++){
            int next = first+second;
            first = second;
            second = next;
        }
        return second;
    }
    public static void main(String[] args){
        System.out.println("fib(10) = "+fib(10));
    }
}
