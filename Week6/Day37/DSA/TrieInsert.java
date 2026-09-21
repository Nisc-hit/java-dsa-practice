import java.util.HashMap;
import java.util.Map;
class TrieNode2 {
    Map<Character, TrieNode2> children = new HashMap<>();
    boolean isEndOfWord = false;
}
public class TrieInsert {
    TrieNode2 root = new TrieNode2();
    public static void main(String[] args) {
        TrieInsert trie = new TrieInsert();
        trie.insert("cat");
        trie.insert("car");
        System.out.println("Words inserted successfully");
    }
    void insert(String word) {
        TrieNode2 current = root;
        for (char ch : word.toCharArray()) {
            current.children.putIfAbsent(ch, new TrieNode2());
            current = current.children.get(ch);
        }
        current.isEndOfWord = true;
    }
}