public class Largestofthree {
    public static void main(String [] args){
        int a =12,b = 45,c = 30;
        int largest = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("Largest = "+ largest);
    }
    
}
