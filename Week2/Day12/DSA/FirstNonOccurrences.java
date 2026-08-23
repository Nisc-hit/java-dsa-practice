public class FirstNonOccurrences {
    public static void main(String[] args){
        String str = "swiss";
        char result = '\0';
        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);
            boolean repeated = false;
            for(int j=0;j<str.length();j++){
                if(i!=j&& str.charAt(j)== current){
                    repeated = true;
                    break;
                }
            }
            if(!repeated){
                result = current;
                break;
            }
        }
        System.out.println("First non-repeating character :"+result);
    }
    
}
