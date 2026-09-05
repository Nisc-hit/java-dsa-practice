import java.util.*;
class GraphNode {
    public int val;
    public List<GraphNode> neighbors;
    public GraphNode(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }
}
class Solution {
    private Map<GraphNode, GraphNode> visited = new HashMap<>();
    public GraphNode cloneGraph(GraphNode node) {
        if (node == null) return null;
        if (visited.containsKey(node)) return visited.get(node);
        GraphNode clone = new GraphNode(node.val);
        visited.put(node, clone);
        for (GraphNode neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;
    }
}
// Standalone test version
public class CloneGraphLeetcode {
    static Map<GraphNode, GraphNode> visited = new HashMap<>();
    public static void main(String[] args) {
        GraphNode a = new GraphNode(1);
        GraphNode b = new GraphNode(2);
        a.neighbors.add(b);
        b.neighbors.add(a);
        GraphNode clonedA = cloneGraph(a);
        System.out.println("Clone successful, value = " + clonedA.val);
    }
    static GraphNode cloneGraph(GraphNode node) {
        if (node == null) return null;
        if (visited.containsKey(node)) return visited.get(node);
        GraphNode clone = new GraphNode(node.val);
        visited.put(node, clone);
        for (GraphNode neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;
    }
}