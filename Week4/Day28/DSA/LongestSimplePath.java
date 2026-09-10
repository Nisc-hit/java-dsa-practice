import java.util.*;
public class LongestSimplePath {
    static List<Integer> bestPath = new ArrayList<>();
    static void dfs(
            int current,
            int destination,
            Map<Integer, List<Integer>> graph,
            Set<Integer> visited,
            List<Integer> currentPath) {
        visited.add(current);
        currentPath.add(current);
        if (current == destination) {
            if (currentPath.size() > bestPath.size()) {
                bestPath = new ArrayList<>(currentPath);
            }
        } else {
            for (int next : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(next)) {
                    dfs(next, destination, graph, visited, currentPath);
                }
            }
        }
        // Backtrack
        currentPath.remove(currentPath.size() - 1);
        visited.remove(current);
    }
    public static List<Integer> longestPath(
            Map<Integer, List<Integer>> graph, int source, int destination) {
        bestPath.clear();
        dfs(source, destination, graph, new HashSet<>(), new ArrayList<>());
        return bestPath;
    }
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(1, 4, 5));
        graph.put(3, Arrays.asList(1, 5));
        graph.put(4, Arrays.asList(2, 6));
        graph.put(5, Arrays.asList(2, 3, 6));
        graph.put(6, Arrays.asList(4, 5));
        System.out.println(longestPath(graph, 1, 6));
    }
}