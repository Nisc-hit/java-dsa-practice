import java.util.*;
public class DirectedCycleDfs {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 0); // creates a directed cycle
        Set<Integer> visited = new HashSet<>();
        Set<Integer> inStack = new HashSet<>();
        boolean hasCycle = false;
        for (int node : graph.keySet()) {
            if (!visited.contains(node)) {
                if (dfs(graph, node, visited, inStack)) {
                    hasCycle = true;
                    break;
                }
            }
        }
        System.out.println("Has cycle? " + hasCycle);
    }
    static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
    }
    static boolean dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited, Set<Integer> inStack) {
        visited.add(node);
        inStack.add(node); // mark as "currently on this DFS path"
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (inStack.contains(neighbor)) {
                return true; // found a back-edge to a node on the CURRENT path = cycle
            }
            if (!visited.contains(neighbor)) {
                if (dfs(graph, neighbor, visited, inStack)) return true;
            }
        }
        inStack.remove(node); // done exploring this node's path - remove before returning
        return false;
    }
}