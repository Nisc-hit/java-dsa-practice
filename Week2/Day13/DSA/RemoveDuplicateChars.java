public class RemoveDuplicateChars {
    public static void main(String[] args){
        String str = "programming";
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        for(char c:str.toCharArray()){
            if(!seen[c]){
                result.append(c);
                seen[c]=true;
            }
        }
        System.out.println(result.toString());
    }
    
}
