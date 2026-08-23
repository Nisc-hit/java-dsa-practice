public class StringConcatenation {
    public static void main(String[] args){
        String first = "Hello";
        String second = "World";
        String result1 = first +" "+second;
        String result2 = first.concat(" ").concat(second);
        System.out.println(result1);
        System.out.println(result2); 
    }
    
}
