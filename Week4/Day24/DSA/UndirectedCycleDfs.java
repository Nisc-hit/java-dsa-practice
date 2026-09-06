import java.util.*;
public class UndirectedCycleDfs {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 0); // creates a cycle
        Set<Integer> visited = new HashSet<>();
        boolean hasCycle = false;
        for (int node : graph.keySet()) {
            if (!visited.contains(node)) {
                if (dfs(graph, node, -1, visited)) {
                    hasCycle = true;
                    break;
                }
            }
        }
        System.out.println("Has cycle? " + hasCycle);
    }
    static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }
    static boolean dfs(Map<Integer, List<Integer>> graph, int node, int parent, Set<Integer> visited) {
        visited.add(node);
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                if (dfs(graph, neighbor, node, visited)) return true;
            } else if (neighbor != parent) {
                return true; // visited neighbor that ISN'T where we came from = cycle
            }
        }
        return false;
    }
}