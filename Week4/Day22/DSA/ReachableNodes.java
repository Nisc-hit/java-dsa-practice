import java.util.*;
public class ReachableNodes {
static List<List<Integer>> buildList(int n, int[][] edges) {
List<List<Integer>> graph = new ArrayList<>();
for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
for (int[] e : edges) {
graph.get(e[0]).add(e[1]);
graph.get(e[1]).add(e[0]);
}
return graph;
}
static int countReachable(List<List<Integer>> graph, int source) {
boolean[] visited = new boolean[graph.size()];
Queue<Integer> queue = new ArrayDeque<>();
queue.offer(source);
visited[source] = true;
int count = 0;
while (!queue.isEmpty()) {
int node = queue.poll();
count++;
for (int neighbor : graph.get(node)) {
if (!visited[neighbor]) {
visited[neighbor] = true;
queue.offer(neighbor);
}
}
}
return count;
}
public static void main(String[] args) {
int[][] edges = {{0,1},{0,2},{1,3},{4,5}};
List<List<Integer>> graph = buildList(6, edges);
System.out.println(countReachable(graph, 0));
}
}