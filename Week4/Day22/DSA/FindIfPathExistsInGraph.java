import java.util.*;
public class FindIfPathExistsInGraph {
static boolean validPath(
int n, int[][] edges, int source, int destination) {
List<List<Integer>> graph = new ArrayList<>();
for (int i = 0; i < n; i++) {
graph.add(new ArrayList<>());
}
for (int[] edge : edges) {
graph.get(edge[0]).add(edge[1]);
graph.get(edge[1]).add(edge[0]);
}
boolean[] visited = new boolean[n];
Queue<Integer> queue = new ArrayDeque<>();
queue.offer(source);
visited[source] = true;
while (!queue.isEmpty()) {
int node = queue.poll();
if (node == destination) return true;
for (int neighbor : graph.get(node)) {
if (!visited[neighbor]) {
visited[neighbor] = true;
queue.offer(neighbor);
}
}
}
return false;
}
public static void main(String[] args) {
int n = 6;
int[][] edges = {
{0,1}, {0,2}, {1,3}, {2,4}
};
System.out.println(validPath(n, edges, 0, 4));
System.out.println(validPath(n, edges, 0, 5));
}
}