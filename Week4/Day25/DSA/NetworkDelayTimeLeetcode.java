import java.util.*;
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] t : times) {
            graph.computeIfAbsent(t[0], x -> new ArrayList<>()).add(new int[]{t[1], t[2]});
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{k, 0});
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
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1; // some node unreachable
            maxTime = Math.max(maxTime, dist[i]);
        }
        return maxTime;
    }
}
// Standalone test version
public class NetworkDelayTimeLeetcode {
    public static void main(String[] args) {
        int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4, k = 2;
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] t : times) graph.computeIfAbsent(t[0], x -> new ArrayList<>()).add(new int[]{t[1], t[2]});
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{k, 0});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            if (cur[1] > dist[cur[0]]) continue;
            for (int[] e : graph.getOrDefault(cur[0], new ArrayList<>())) {
                if (dist[cur[0]] + e[1] < dist[e[0]]) {
                    dist[e[0]] = dist[cur[0]] + e[1];
                    pq.add(new int[]{e[0], dist[e[0]]});
                }
            }
        }
        int maxTime = 0;
        boolean allReachable = true;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) { allReachable = false; break; }
            maxTime = Math.max(maxTime, dist[i]);
        }
        System.out.println(allReachable ? maxTime : -1);
    }
}