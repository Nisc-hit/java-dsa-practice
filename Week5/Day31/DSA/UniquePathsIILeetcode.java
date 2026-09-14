class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length, cols = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1) return 0;
        int[][] dp = new int[rows][cols];
        dp[0][0] = 1;
        for (int j = 1; j < cols; j++) dp[0][j] = (obstacleGrid[0][j] == 1) ? 0 : dp[0][j-1];
        for (int i = 1; i < rows; i++) dp[i][0] = (obstacleGrid[i][0] == 1) ? 0 : dp[i-1][0];
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = (obstacleGrid[i][j] == 1) ? 0 : dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[rows-1][cols-1];
    }
}
// Standalone test version - identical to Hands-On Question 3
public class UniquePathsIILeetcode {
    public static void main(String[] args) {
        int[][] grid = {{0,0},{1,0}};
        int rows = grid.length, cols = grid[0].length;
        if (grid[0][0] == 1) { System.out.println(0); return; }
        int[][] dp = new int[rows][cols];
        dp[0][0] = 1;
        for (int j = 1; j < cols; j++) dp[0][j] = (grid[0][j]==1) ? 0 : dp[0][j-1];
        for (int i = 1; i < rows; i++) dp[i][0] = (grid[i][0]==1) ? 0 : dp[i-1][0];
        for (int i = 1; i < rows; i++)
            for (int j = 1; j < cols; j++)
                dp[i][j] = (grid[i][j]==1) ? 0 : dp[i-1][j] + dp[i][j-1];
        System.out.println(dp[rows-1][cols-1]);
    }}