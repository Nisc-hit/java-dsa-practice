import java.util.*;
class TreeNode {
int val;
TreeNode left, right;
TreeNode(int val) {
this.val = val;
}
}
public class TreeFrequency {
static void countValues(TreeNode root, HashMap<Integer, Integer> map) {
if (root == null) return;
map.put(root.val, map.getOrDefault(root.val, 0) + 1);
countValues(root.left, map);
countValues(root.right, map);
}
public static void main(String[] args) {
TreeNode root = new TreeNode(5);
root.left = new TreeNode(3);
root.right = new TreeNode(5);
root.left.left = new TreeNode(3);
root.left.right = new TreeNode(7);
HashMap<Integer, Integer> map = new HashMap<>();
countValues(root, map);
System.out.println(map);
// Example output: {3=2, 5=2, 7=1}
}
}