class Solution{
    public int findComplement(int num){
        int mask = 1;
        while(mask<num){
            mask = (mask<< 1) | 1;
        }
        return num ^ mask;
    }
    
}

public class NumberComplement {
    public static void main (String[] args){
        int num = 5;
        int mask = 1;
        while(mask<num){
            mask = (mask<< 1) |1;
        }
        int  complement = num^mask;
        System.out.println("Complement = " + complement);
    }
}