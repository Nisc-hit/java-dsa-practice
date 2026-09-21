import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) minHeap.poll();
        }
        int[] result = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()) {
            result[i++] = minHeap.poll().getKey();
        }
        return result;
    }
}
// Standalone test version - identical to Hands-On Question 5
public class TopKFrequentLeetcode {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) minHeap.poll();
        }
        System.out.print("[");
        while (!minHeap.isEmpty()) System.out.print(minHeap.poll().getKey() + " ");
        System.out.println("]");
    }
}