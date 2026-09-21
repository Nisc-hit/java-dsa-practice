import java.util.HashMap;
import java.util.Map;
class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEndOfWord;
    TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
    }
}
public class TrieNodeDemo {
    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        System.out.println("Root created. Children count = " + root.children.size());
        System.out.println("Is end of word? " + root.isEndOfWord);
    }
}