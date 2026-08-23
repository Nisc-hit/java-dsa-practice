import java.util.Arrays;
public class AnagramCheck {
    public static void main(String[] args){
        String a = "listen";
        String b = "silent";
        char[]arrA = a.toCharArray();
        char[]arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        boolean isAnagram = Arrays.equals(arrA,arrB);
        System.out.println("Are anagrams? "+isAnagram);
    }
    
}
