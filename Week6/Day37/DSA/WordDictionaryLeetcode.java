import java.util.HashMap;
import java.util.Map;
class WordDictionary {
    class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEndOfWord = false;
    }
    TrieNode root = new TrieNode();
    public void addWord(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            current.children.putIfAbsent(ch, new TrieNode());
            current = current.children.get(ch);
        }
        current.isEndOfWord = true;
    }
    public boolean search(String word) {
        return searchHelper(word, 0, root);
    }
    private boolean searchHelper(String word, int index, TrieNode node) {
        if (index == word.length()) return node.isEndOfWord;
        char ch = word.charAt(index);
        if (ch == '.') {
            // wildcard: try EVERY possible child at this position
            for (TrieNode child : node.children.values()) {
                if (searchHelper(word, index + 1, child)) return true;
            }
            return false;
        } else {
            if (!node.children.containsKey(ch)) return false;
            return searchHelper(word, index + 1, node.children.get(ch));
        }
    }
}
// Standalone test version
public class WordDictionaryLeetcode {
    public static void main(String[] args) {
        WordDictionary wd = new WordDictionary();
        wd.addWord("bad");
        wd.addWord("dad");
        wd.addWord("mad");
        System.out.println(wd.search("pad")); // false
        System.out.println(wd.search("bad")); // true
        System.out.println(wd.search(".ad")); // true - wildcard matches 'b', 'd', or 'm'
    }
}