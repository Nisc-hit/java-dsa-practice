import java.util.*;
public class DijkstraAllNodes {
    public static void main(String[] args) {
        int n = 5;
        Map<Integer, List<int[]>> graph = new HashMap<>();
        addEdge(graph, 0, 1, 4);
        addEdge(graph, 0, 2, 1);
        addEdge(graph, 2, 1, 2);
        addEdge(graph, 1, 3, 1);
        addEdge(graph, 2, 3, 5);
        addEdge(graph, 3, 4, 3);
        int[] dist = dijkstra(graph, 0, n);
        System.out.println("Distances from node 0: " + Arrays.toString(dist));
    }
    static void addEdge(Map<Integer, List<int[]>> graph, int u, int v, int weight) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, weight});
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, weight});
    }
    static int[] dijkstra(Map<Integer, List<int[]>> graph, int source, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]); // min-heap by distance
        pq.add(new int[]{source, 0});
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0], d = current[1];
            if (d > dist[node]) continue; // outdated entry, skip
            for (int[] edge : graph.getOrDefault(node, new ArrayList<>())) {
                int neighbor = edge[0], weight = edge[1];
                if (dist[node] + weight < dist[neighbor]) {
                    dist[neighbor] = dist[node] + weight;
                    pq.add(new int[]{neighbor, dist[neighbor]});
                }
            }
        }
        return dist;
    }
}