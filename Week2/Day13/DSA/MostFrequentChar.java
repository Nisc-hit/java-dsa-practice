public class MostFrequentChar {
    public static void main(String[] args){
        String str ="programming";
        int[] freq = new int[256];
        for(char c: str.toCharArray()){
            freq[c]++;
        }
        char maxChar = ' ';
        int maxCount = 0;
        for(char c : str.toCharArray()){
            if (freq[c]>maxCount){
                maxCount = freq[c];
                maxChar = c;
            }
        }
        System.out.println("Most frequent:'"+maxChar+"'("+maxCount+"times)");
    }
}
