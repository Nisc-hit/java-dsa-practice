import java.util.*;
public class AdjacenyMatrix {
static int[][] buildMatrix(int n, int[][] edges) {
int[][] matrix = new int[n][n];
for (int[] edge : edges) {
int u = edge[0];
int v = edge[1];
matrix[u][v] = 1;
matrix[v][u] = 1;
}
return matrix;
}
public static void main(String[] args) {
int n = 6;
int[][] edges = {
{0, 1}, {0, 2}, {1, 3}, {2, 4}, {3, 5}
};
int[][] matrix = buildMatrix(n, edges);
for (int i = 0; i < n; i++) {
System.out.println(Arrays.toString(matrix[i]));
}
}
}