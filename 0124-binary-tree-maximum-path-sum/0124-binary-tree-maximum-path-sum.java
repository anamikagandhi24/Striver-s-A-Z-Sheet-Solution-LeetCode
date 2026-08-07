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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    public int helper(TreeNode node){
        if(node==null)return 0;

        int leftGain=helper(node.left);
        int rightGain=helper(node.right);
        leftGain=Math.max(leftGain,0);
        rightGain=Math.max(rightGain,0);

        max=Math.max(max,node.val+leftGain+rightGain);

        return node.val+Math.max(leftGain,rightGain);

    }
}