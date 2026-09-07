import java.util.*;
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length, cols = heights[0].length;
        int[][] effort = new int[rows][cols];
        for (int[] row : effort) Arrays.fill(row, Integer.MAX_VALUE);
        effort[0][0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.add(new int[]{0, 0, 0});
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int row = cur[0], col = cur[1], curEffort = cur[2];
            if (row == rows - 1 && col == cols - 1) return curEffort;
            if (curEffort > effort[row][col]) continue;
            for (int[] d : directions) {
                int newRow = row + d[0], newCol = col + d[1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                    int diff = Math.abs(heights[newRow][newCol] - heights[row][col]);
                    int newEffort = Math.max(curEffort, diff);
                    if (newEffort < effort[newRow][newCol]) {
                        effort[newRow][newCol] = newEffort;
                        pq.add(new int[]{newRow, newCol, newEffort});
                    }
                }
            }
        }
        return 0;
    }
}
// Standalone test version
public class MinEffortPathLeetcode {
    public static void main(String[] args) {
        int[][] heights = {{1,2,2},{3,8,2},{5,3,5}};
        int rows = heights.length, cols = heights[0].length;
        int[][] effort = new int[rows][cols];
        for (int[] r : effort) Arrays.fill(r, Integer.MAX_VALUE);
        effort[0][0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.add(new int[]{0, 0, 0});
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        int answer = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            if (cur[0] == rows-1 && cur[1] == cols-1) { answer = cur[2]; break; }
            if (cur[2] > effort[cur[0]][cur[1]]) continue;
            for (int[] d : dirs) {
                int nr = cur[0]+d[0], nc = cur[1]+d[1];
                if (nr>=0 && nr<rows && nc>=0 && nc<cols) {
                    int diff = Math.abs(heights[nr][nc]-heights[cur[0]][cur[1]]);
                    int newEff = Math.max(cur[2], diff);
                    if (newEff < effort[nr][nc]) {
                        effort[nr][nc] = newEff;
                        pq.add(new int[]{nr, nc, newEff});
                    }
                }
            }
        }
        System.out.println(answer);
}
    }