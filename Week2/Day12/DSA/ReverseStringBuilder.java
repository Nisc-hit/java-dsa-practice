public class ReverseStringBuilder {
    public static void main(String[] args){
        String str = "java programming";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed); 
    }
    
}
