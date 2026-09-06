import java.util.*;
public class IsGraphATree {
    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {{0,1}, {1,2}, {1,3}}; // 3 edges, 4 nodes - valid tree shape
        System.out.println("Is a tree? " + isTree(n, edges));
    }
    static boolean isTree(int n, int[][] edges) {
        if (edges.length != n - 1) return false; // tree must have EXACTLY n-1 edges
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }
        Set<Integer> visited = new HashSet<>();
        dfs(graph, 0, visited);
        return visited.size() == n; // must reach ALL nodes = fully connected
    }
    static void dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {
        visited.add(node);
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfs(graph, neighbor, visited);
            }
        }
    }
}