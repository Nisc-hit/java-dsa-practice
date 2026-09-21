import java.util.PriorityQueue;
public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("Kth largest = " + findKthLargest(nums, k));
    }
    static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove the smallest, keeping only the K largest seen so far
            }
        }
        return minHeap.peek(); // the smallest of the K largest = the Kth largest overall
    }
}