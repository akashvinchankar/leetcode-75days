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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> answer = new ArrayList<>();
        rightView(root, answer, 0);
        return answer;
    }
    
    public void rightView(TreeNode curr, List<Integer> answer, int currDepth) {
        if(curr == null) {
            return;
        }
        
        if(currDepth == answer.size()) {
            answer.add(curr.val);
        }
        
        rightView(curr.right, answer, currDepth + 1);
        rightView(curr.left, answer, currDepth + 1);
    }
}