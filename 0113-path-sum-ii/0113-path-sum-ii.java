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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        if(root==null){
            return ans;
        }
        helper(root,targetSum,ans,list);
        return ans;
    }
    public void helper(TreeNode node,int rem,List<List<Integer>>ans,List<Integer>list){
        if(node==null){
            return;
        }
        list.add(node.val);
        rem-=node.val;
        if(rem==0 && node.left==null&& node.right==null){
            ans.add(new ArrayList<>(list));
        }
        helper(node.left,rem,ans,list);
        helper(node.right,rem,ans,list);
        list.remove(list.size()-1);
    }
}