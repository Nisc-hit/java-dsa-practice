class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        if (Math.abs(target) > totalSum || (target + totalSum) % 2 != 0) return 0;
        int subsetTarget = (target + totalSum) / 2;
        int[] dp = new int[subsetTarget + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int t = subsetTarget; t >= num; t--) {
                dp[t] += dp[t - num];
            }
        }
        return dp[subsetTarget];
    }
}
// Standalone test version - identical to Hands-On Question 7
public class TargetSumLeetcode {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        if (Math.abs(target) > totalSum || (target + totalSum) % 2 != 0) { System.out.println(0); return; }
        int subsetTarget = (target + totalSum) / 2;
        int[] dp = new int[subsetTarget + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int t = subsetTarget; t >= num; t--) dp[t] += dp[t - num];
        }
        System.out.println(dp[subsetTarget]);
    }
}