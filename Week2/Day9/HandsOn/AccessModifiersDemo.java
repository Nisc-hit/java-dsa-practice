public class AccessModifiersDemo {
    private int privateVar = 1;     
    int defaultVar = 2;             
    protected int protectedVar = 3; 
    public int publicVar = 4;       
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        System.out.println(obj.privateVar);    
        System.out.println(obj.defaultVar);  
        System.out.println(obj.protectedVar);
        System.out.println(obj.publicVar);     
        
    }
}