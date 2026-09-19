class Node {
    int value;
    Node left, right;
    Node(int value) { this.value = value; }
}
public class MaxPathSumTree {
    static int maxSum = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        maxPathSum(root);
        System.out.println("Max path sum = " + maxSum);
    }
    static int maxPathSum(Node node) {
        if (node == null) return 0;
        // Ignore negative contributions - just use 0 instead of going negative
        int leftGain = Math.max(maxPathSum(node.left), 0);
        int rightGain = Math.max(maxPathSum(node.right), 0);
        // Best path THROUGH this node (as the "peak") - candidate for the global answer
        int priceThroughNode = node.value + leftGain + rightGain;
        maxSum = Math.max(maxSum, priceThroughNode);
        // But what we RETURN to the parent can only extend ONE side (can't branch twice)
        return node.value + Math.max(leftGain, rightGain);
    }
}