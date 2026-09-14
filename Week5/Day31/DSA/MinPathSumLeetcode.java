import java.util.*;

public class MinPathSumLeetcode {

    // Function to find minimum path sum
    public int minPathSum(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int[][] dp = new int[rows][cols];

        // Starting cell
        dp[0][0] = grid[0][0];

        // First row
        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // First column
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Remaining cells
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                dp[i][j] = grid[i][j]
                        + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // Minimum path sum
        return dp[rows - 1][cols - 1];
    }

    // Main method for running the program
    public static void main(String[] args) {

        // Example input
        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };

        // Create object
        MinPathSumLeetcode obj = new MinPathSumLeetcode();

        // Call method
        int result = obj.minPathSum(grid);

        // Print result
        System.out.println("Minimum Path Sum = " + result);
    }
}