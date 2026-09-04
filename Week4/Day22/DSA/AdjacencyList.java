import java.util.*;

public class AdjacencyList {

    // Method to build an adjacency list
    static List<List<Integer>> buildList(int n, int[][] edges) {

        // Create a list for every vertex
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        // Since this is an undirected graph,
        // add both directions.
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return graph;
    }

    public static void main(String[] args) {

        // Number of vertices
        int n = 6;

        // Edges
        int[][] edges = {
            {0, 1},
            {0, 2},
            {1, 3},
            {2, 4},
            {3, 5}
        };

        // Build adjacency list
        List<List<Integer>> graph = buildList(n, edges);

        // Print adjacency list
        for (int i = 0; i < n; i++) {
            System.out.println(i + " -> " + graph.get(i));
        }
    }
}