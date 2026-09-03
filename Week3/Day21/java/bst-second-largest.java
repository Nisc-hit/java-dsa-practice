
class BSTSecondLargest {
static int count = 0;
static Integer answer = null;
static void reverseInorder(TreeNode root) {
if (root == null || answer != null) return;
reverseInorder(root.right);
count++;
if (count == 2) {
answer = root.val;
return;
}
reverseInorder(root.left);
}
static Integer findSecondLargest(TreeNode root) {
count = 0;
answer = null;
reverseInorder(root);
return answer; // null if fewer than 2 nodes
}
}