import java.util.HashMap;

public class HashMapRemove {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 22);
        ages.put("Bob", 25);
        ages.put("Charlie", 20);
        System.out.println("Before remove: " + ages);
        ages.remove("Bob");
        System.out.println("After remove: " + ages);
    }
}


