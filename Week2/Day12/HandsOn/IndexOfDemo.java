public class IndexOfDemo {
    public static void main(String[] args){
        String str = "Java Programming";
        int indexOfP = str.indexOf('P');
        int indexOfWord = str.indexOf("gram");
        System.out.println("Index of 'P' = "+ indexOfP);
        System.out.println("Index of 'gram' = "+indexOfWord);
    }
    
}
