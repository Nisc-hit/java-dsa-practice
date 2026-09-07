import java.util.*;
public class BfsVsDijkstraComparison {
    public static void main(String[] args) {
        // Unweighted graph - every edge treated as weight 1
        Map<Integer, List<Integer>> unweightedGraph = new HashMap<>();
        addUnweightedEdge(unweightedGraph, 0, 1);
        addUnweightedEdge(unweightedGraph, 1, 2);
        addUnweightedEdge(unweightedGraph, 0, 2);
        Map<Integer, List<int[]>> weightedGraph = new HashMap<>();
        addWeightedEdge(weightedGraph, 0, 1, 1);
        addWeightedEdge(weightedGraph, 1, 2, 1);
        addWeightedEdge(weightedGraph, 0, 2, 1);
        System.out.println("BFS distance 0->2: " + bfsDistance(unweightedGraph, 0, 2));
        System.out.println("Dijkstra distance 0->2: " + dijkstraDistance(weightedGraph, 0, 2, 3));
    }
    static void addUnweightedEdge(Map<Integer, List<Integer>> g, int u, int v) {
        g.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        g.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }
    static void addWeightedEdge(Map<Integer, List<int[]>> g, int u, int v, int w) {
        g.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, w});
        g.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, w});
    }
    static int bfsDistance(Map<Integer, List<Integer>> graph, int source, int target) {
        Map<Integer, Integer> dist = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        dist.put(source, 0);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == target) return dist.get(current);
            for (int neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                if (!dist.containsKey(neighbor)) {
                    dist.put(neighbor, dist.get(current) + 1);
                    queue.add(neighbor);
                }
            }
        }
        return -1;
    }
    static int dijkstraDistance(Map<Integer, List<int[]>> graph, int source, int target, int n) {
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
        return dist[target];
    }
}