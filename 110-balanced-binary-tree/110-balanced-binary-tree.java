/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        isBalanced = true;
        depth(root);
        return isBalanced;
    }

    public int depth(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = depth(root.left);
        int rightHeight = depth(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            isBalanced = false;
        }

        // to add 1 on each level of BT and calculate max height at that level
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
