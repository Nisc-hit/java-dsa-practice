public class StringCompression {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        System.out.println("Compressed: " + compressed.toString());
    }
}