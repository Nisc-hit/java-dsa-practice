class Solution {
    public int findCenter(int[][] edges) {
        // The center node appears in BOTH of the first two edges
        int a = edges[0][0], b = edges[0][1];
        int c = edges[1][0], d = edges[1][1];
        if (a == c || a == d) return a;
        return b;
    }
}
// Standalone test version
public class FindCenterLeetcode {
    public static void main(String[] args) {
        int[][] edges = {{1,2}, {2,3}, {4,2}};
        int a = edges[0][0], b = edges[0][1];
        int c = edges[1][0], d = edges[1][1];
        int center = (a == c || a == d) ? a : b;
        System.out.println("Center = " + center);
    }
}