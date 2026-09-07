import java.util.*;
public class WeightedGraphDemo {
    public static void main(String[] args) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        addEdge(graph, 0, 1, 4);
        addEdge(graph, 0, 2, 1);
        addEdge(graph, 2, 1, 2);
        addEdge(graph, 1, 3, 1);
        for (int node : graph.keySet()) {
            System.out.print(node + " -> ");
            for (int[] edge : graph.get(node)) {
                System.out.print("(" + edge[0] + ", w=" + edge[1] + ") ");
            }
            System.out.println();
        }
    }
    static void addEdge(Map<Integer, List<int[]>> graph, int u, int v, int weight) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, weight});
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, weight});
    }
}