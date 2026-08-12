public class PerfectSquare {
    public static void main(String[] args){
        int num = 49;
        int sqrt = (int)Math.sqrt(num);
        if(sqrt*sqrt == num){
            System.out.println(num + " is a perfect Square");
        }else{
            System.out.println(num + " is not a perfect square");
        }
        
    }
    
}
