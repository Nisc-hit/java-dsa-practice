import java.util.*;
public class DijkstraUnreachableNodes {
    public static void main(String[] args) {
        int n = 4;
        Map<Integer, List<int[]>> graph = new HashMap<>();
        addEdge(graph, 0, 1, 2);
        // Node 2 and 3 are completely disconnected from node 0
        int[] dist = dijkstra(graph, 0, n);
        for (int i = 0; i < n; i++) {
            String display = dist[i] == Integer.MAX_VALUE ? "infinity (unreachable)" : String.valueOf(dist[i]);
            System.out.println("Distance to " + i + ": " + display);
        }
    }
    static void addEdge(Map<Integer, List<int[]>> graph, int u, int v, int w) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, w});
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, w});
    }
    static int[] dijkstra(Map<Integer, List<int[]>> graph, int source, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{source, 0});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            if (cur[1] > dist[cur[0]]) continue;
            for (int[] edge : graph.getOrDefault(cur[0], new ArrayList<>())) {
                if (dist[cur[0]] + edge[1] < dist[edge[0]]) {
                    dist[edge[0]] = dist[cur[0]] + edge[1];
                    pq.add(new int[]{edge[0], dist[edge[0]]});
                }
            }
        }
        return dist;
    }
}