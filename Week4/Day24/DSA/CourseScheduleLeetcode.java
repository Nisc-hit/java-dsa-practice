import java.util.*;
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] p : prerequisites) {
            graph.computeIfAbsent(p[1], k -> new ArrayList<>()).add(p[0]);
        }
        Set<Integer> visited = new HashSet<>();
        Set<Integer> inStack = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            if (!visited.contains(i) && hasCycle(graph, i, visited, inStack)) {
                return false;
            }
        }
        return true;
    }
    private boolean hasCycle(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited, Set<Integer> inStack) {
        visited.add(node);
        inStack.add(node);
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (inStack.contains(neighbor)) return true;
            if (!visited.contains(neighbor) && hasCycle(graph, neighbor, visited, inStack)) return true;
        }
        inStack.remove(node);
        return false;
    }
}
// Standalone test version - identical to Hands-On Question 7
public class CourseScheduleLeetcode {
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}, {0,1}}; // cycle: 0 needs 1, 1 needs 0
        System.out.println("Can finish? " + new Object() {
            boolean run() {
                Map<Integer, List<Integer>> graph = new HashMap<>();
                for (int[] p : prerequisites) graph.computeIfAbsent(p[1], k -> new ArrayList<>()).add(p[0]);
                Set<Integer> visited = new HashSet<>(), inStack = new HashSet<>();
                for (int i = 0; i < numCourses; i++) {
                    if (!visited.contains(i) && hasCycle(graph, i, visited, inStack)) return false;
                }
                return true;
            }
            boolean hasCycle(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited, Set<Integer> inStack) {
                visited.add(node); inStack.add(node);
                for (int nb : graph.getOrDefault(node, new ArrayList<>())) {
                    if (inStack.contains(nb)) return true;
                    if (!visited.contains(nb) && hasCycle(graph, nb, visited, inStack)) return true;
                }
                inStack.remove(node);
                return false;
            }
        }.run());
    }
}