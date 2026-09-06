import java.util.*;
public class UndirectedCycleUnionFind {
    static int[] parent;
    public static void main(String[] args) {
        int n = 4;
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        int[][] edges = {{0,1}, {1,2}, {2,0}}; // creates a cycle
        boolean hasCycle = false;
        for (int[] edge : edges) {
            int rootA = find(edge[0]);
            int rootB = find(edge[1]);
            if (rootA == rootB) {
                hasCycle = true;
                break;
            }
            union(rootA, rootB);
        }
        System.out.println("Has cycle? " + hasCycle);
    }
    static int find(int node) {
        if (parent[node] != node) {
            parent[node] = find(parent[node]); // path compression
        }
        return parent[node];
    }
    static void union(int a, int b) {
        parent[a] = b;
    }
}