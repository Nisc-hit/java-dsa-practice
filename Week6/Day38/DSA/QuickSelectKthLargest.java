public class QuickSelectKthLargest {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("Kth largest = " + findKthLargest(nums, k));
    }
    static int findKthLargest(int[] nums, int k) {
        int targetIndex = nums.length - k; // Kth largest = (n-k)th smallest in sorted order
        return quickSelect(nums, 0, nums.length - 1, targetIndex);
    }
    static int quickSelect(int[] arr, int low, int high, int target) {
        int pivotIndex = partition(arr, low, high);
        if (pivotIndex == target) {
            return arr[pivotIndex];
        } else if (pivotIndex < target) {
            return quickSelect(arr, pivotIndex + 1, high, target);
        } else {
            return quickSelect(arr, low, pivotIndex - 1, target);
        }
    }
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }
}