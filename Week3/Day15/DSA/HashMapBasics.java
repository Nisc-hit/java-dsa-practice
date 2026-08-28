import java.util.HashMap;
public class HashMapBasics {
    public static void main(String[] args){
        HashMap<String,Integer> ages = new HashMap<>();
        ages.put("Alice",22);
        ages.put("Bob",25);
        ages.put("charlie",20);
        System.out.println(ages);
        System.out.println("Bob ages: "+ ages.get("Bob"));
    }
    
}
