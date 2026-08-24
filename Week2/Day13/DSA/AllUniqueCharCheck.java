public class AllUniqueCharCheck {
    public static void main(String[] args){
        String str ="world";
        boolean[] seen = new boolean[256];
        boolean allUnique = true;
        for(char c:str.toCharArray()){
            if(seen[c]){
                allUnique = false;
                break;
            }
            seen[c] = true;
        }
        System.out.println("All unique characters?"+allUnique);
    }
    
}
