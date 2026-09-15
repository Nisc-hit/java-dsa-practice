class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        if (totalSum % 2 != 0) return false;
        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int t = target; t >= num; t--) {
                dp[t] = dp[t] || dp[t - num];
            }
        }
        return dp[target];
    }
}
// Standalone test version - identical to Hands-On Question 5
public class PartitionEqualSubsetSumLeetcode {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5};
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        if (totalSum % 2 != 0) { System.out.println(false); return; }
        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int t = target; t >= num; t--) {
                dp[t] = dp[t] || dp[t - num];
            }
        }
        System.out.println(dp[target]);
    }
}