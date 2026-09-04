import java.util.*;
public class BFSTraversal {
static List<List<Integer>> buildList(int n, int[][] edges) {
List<List<Integer>> graph = new ArrayList<>();
for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
for (int[] edge : edges) {
graph.get(edge[0]).add(edge[1]);
graph.get(edge[1]).add(edge[0]);
}
return graph;
}
static void bfs(List<List<Integer>> graph, int source) {
boolean[] visited = new boolean[graph.size()];
Queue<Integer> queue = new ArrayDeque<>();
queue.offer(source);
visited[source] = true;
while (!queue.isEmpty()) {
int node = queue.poll();
System.out.print(node + " ");
for (int neighbor : graph.get(node)) {
if (!visited[neighbor]) {
visited[neighbor] = true;
queue.offer(neighbor);
}
}
}
}
public static void main(String[] args) {
int[][] edges = {
{0, 1}, {0, 2}, {1, 3}, {2, 4}, {3, 5}
};
List<List<Integer>> graph = buildList(6, edges);
bfs(graph, 0);
}
}