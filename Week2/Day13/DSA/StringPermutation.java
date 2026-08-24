public class StringPermutation {
    public static void main(String[] args){
        String str = "abc";
        permute(str, "");
    }
    static void permute(String remaining,String soFar){
        if(remaining.isEmpty()){
            System.out.println(soFar);
            return;
        }
        for(int i=0;i<remaining.length();i++){
            char chosen = remaining.charAt(i);
            String rest = remaining.substring(0,i)+remaining.substring(i+1);
            permute(rest,soFar+chosen);
        }
    }
    
}
