public class ValidShuffleCheck {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        String shuffled = "adbecf";
        boolean isValidShuffle = false;
        if (a.length() + b.length() == shuffled.length()) {
            isValidShuffle = isShuffleHelper(a, b, shuffled, 0, 0, 0);
        }
        System.out.println("Is valid shuffle? " + isValidShuffle);
    }
    static boolean isShuffleHelper(String a, String b, String shuffled, int i, int j, int k) {
        if (k == shuffled.length()) {
            return i == a.length() && j == b.length();
        }
        boolean fromA = i < a.length() && a.charAt(i) == shuffled.charAt(k)
                         && isShuffleHelper(a, b, shuffled, i + 1, j, k + 1);
        boolean fromB = j < b.length() && b.charAt(j) == shuffled.charAt(k)
                         && isShuffleHelper(a, b, shuffled, i, j + 1, k + 1);
        return fromA || fromB;
    }
}