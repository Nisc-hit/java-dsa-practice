import java.util.HashMap;
import java.util.Map;
class Solution {
    class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEndOfWord = false;
    }
    TrieNode root = new TrieNode();
    public String longestWord(String[] words) {
        for (String word : words) insert(word);
        String result = "";
        for (String word : words) {
            if (isBuildable(word) && (word.length() > result.length()
                || (word.length() == result.length() && word.compareTo(result) < 0))) {
                result = word;
            }
        }
        return result;
    }
    void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            current.children.putIfAbsent(ch, new TrieNode());
            current = current.children.get(ch);
        }
        current.isEndOfWord = true;
    }
    boolean isBuildable(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            current = current.children.get(ch);
            if (current == null || !current.isEndOfWord) return false; // every PREFIX must also be a complete word
        }
        return true;
    }
}
// Standalone test version
public class LongestWordInDictionaryLeetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"w", "wo", "wor", "worl", "world"};
        System.out.println(sol.longestWord(words)); // "world"
    }
}