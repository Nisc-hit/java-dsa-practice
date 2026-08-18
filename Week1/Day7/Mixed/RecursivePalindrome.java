public class RecursivePalindrome {
    public static void main(String[] args){
        int num = 12321;
        int numDigits = String.valueOf(num).length();
        boolean result = isPalindromeRecursive(num, num, numDigits);
        System.out.println(num + " is palindrome?" + result);
    }
    static boolean isPalindromeRecursive(int original,int num, int numDigits){
        if(numDigits <= 1) return true;
        int firstDigit = getFirstDigit(num, numDigits);
        int lastDigit = num % 10;
        if(firstDigit != lastDigit) return false;
        int withoutLastDigit = num/10;
        int withoutFirstDigit = withoutLastDigit % (int) Math.pow(10,numDigits - 2);
        return isPalindromeRecursive(original, withoutFirstDigit, numDigits - 2);
    }
    static int getFirstDigit(int num,int numDigits){
        return (int) (num/Math.pow(10,numDigits - 1));
    }
    
}
