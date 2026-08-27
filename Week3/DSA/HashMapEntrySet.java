import java.util.HashMap;
import java.util.Map;
public class HashMapEntrySet {
    public static void main(String[] args){
        HashMap<String,Integer> ages = new HashMap<>();
        ages.put("Alice",22);
        ages.put("Bob",25);
        ages.put("charlie",20);
        for(Map.Entry<String,Integer> entry : ages.entrySet()){
            System.out.println(entry.getKey()+"-> "+entry.getValue());        }
        
    }
    
}
