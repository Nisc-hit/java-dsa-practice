import java.util.*;
public class ReachableNodesDfs {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 3, 4);
        Set<Integer> visited = new HashSet<>();
        int count = countReachable(graph, 0, visited);
        System.out.println("Reachable from 0: " + count);
    }
    static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }
    static int countReachable(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {
        visited.add(node);
        int count = 1;
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                count += countReachable(graph, neighbor, visited);
            }
        }
        return count;
    }
}