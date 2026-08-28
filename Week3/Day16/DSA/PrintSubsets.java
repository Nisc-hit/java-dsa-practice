import java.util.ArrayList;
import java.util.List;

public class PrintSubsets {
     static void generate(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
       
        generate(arr, index + 1, current);
        
        current.add(arr[index]);
        generate(arr, index + 1, current);
      
        current.remove(current.size() - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        generate(arr, 0, new ArrayList<>());
    }
    
}
