public class ClimbingStairsThreeSteps {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Ways = " + climbStairs(n));
    }
    static int climbStairs(int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            if (i - 2 >= 0) dp[i] += dp[i - 2];
            if (i - 3 >= 0) dp[i] += dp[i - 3];
        }
        return dp[n];
    }
}