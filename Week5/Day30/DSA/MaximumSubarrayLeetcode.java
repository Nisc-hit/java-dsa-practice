class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }
        return maxSoFar;
    }
}
// Standalone test version - identical to Hands-On Question 7
public class MaximumSubarrayLeetcode {
    public static void main(String[] args) {
        int[] nums = {5, 4, -1, 7, 8};
        int maxSoFar = nums[0], currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }
        System.out.println("Max subarray sum = " + maxSoFar);
    }
}