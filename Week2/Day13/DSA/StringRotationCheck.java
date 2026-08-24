public class StringRotationCheck {
    public static void main(String[] args){
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        boolean isRotation = false;
        if(s1.length()==s2.length()){
            String combined = s1+s1;
            isRotation = combined.contains(s2);

        }
        System.out.println("Is rotation? "+isRotation);
    }
    
}
