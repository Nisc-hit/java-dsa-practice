public class CharacterCategorizer {
    public static void main(String[] args){
        char ch ='9';
        if(Character.isDigit(ch)){
            System.out.println("Digit");
        }else if(Character.isLetter(ch)){
            char lower = Character.toLowerCase(ch);
            if(lower == 'a'|| lower=='e'|| lower=='i'|| lower=='o'|| lower=='u'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }else{
            System.out.println("Special Character");
        }
    }
    
}
