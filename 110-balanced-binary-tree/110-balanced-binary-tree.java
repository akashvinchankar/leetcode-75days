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
    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        depth(root);
        return result;
    }
    
    public int depth(TreeNode root) {
        if(root == null) return 0;
        
        int left = depth(root.left);
        int right = depth(root.right);
        
        int max = Math.max(left, right) + 1;   // to add 1 on each level of BT
         
        if(Math.abs(left - right) > 1) {
            result = false;
        }
        return max;
    }
}
