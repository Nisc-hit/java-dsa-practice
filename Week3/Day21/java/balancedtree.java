class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class balancedtree {

    static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);

        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = height(root.right);

        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public static void main(String[] args) {

        // Create a balanced binary tree
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Check whether tree is balanced
        if (isBalanced(root)) {
            System.out.println("Tree is balanced");
        } else {
            System.out.println("Tree is not balanced");
        }
    }
}