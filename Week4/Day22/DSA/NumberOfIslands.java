import java.util.*;
public class NumberOfIslands {
public static int numIslands(char[][] grid) {
if (grid == null || grid.length == 0) return 0;
int rows = grid.length;
int cols = grid[0].length;
int islands = 0;
int[][] directions = {
{1,0}, {-1,0}, {0,1}, {0,-1}
};
for (int r = 0; r < rows; r++) {
for (int c = 0; c < cols; c++) {
if (grid[r][c] != '1') continue;
islands++;
Queue<int[]> queue = new ArrayDeque<>();
queue.offer(new int[]{r, c});
grid[r][c] = '0';
while (!queue.isEmpty()) {
int[] cell = queue.poll();
for (int[] d : directions) {
int nr = cell[0] + d[0];
int nc = cell[1] + d[1];
if (nr >= 0 && nr < rows &&
nc >= 0 && nc < cols &&
grid[nr][nc] == '1') {
grid[nr][nc] = '0';
queue.offer(new int[]{nr, nc});
}
}
}
}
}
return islands;
}
public static void main(String[] args) {
char[][] grid = {
{'1','1','0','0','0'},
{'1','1','0','1','0'},
{'0','0','0','1','1'},
{'0','0','0','0','0'}
};
System.out.println(numIslands(grid));
}
}