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
    int preindex=0;
    HashMap<Integer,Integer>map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int n=preorder.length;
        return helper(preorder,0,n-1,map);
    }
    public TreeNode helper(int []preorder,int left,int right,HashMap<Integer,Integer>map){
        if(left>right){
            return null;
        }
        TreeNode node=new TreeNode(preorder[preindex]);
        preindex++;
        int inorderIndex=map.get(node.val);
        node.left=helper(preorder,left,inorderIndex-1,map);
        node.right=helper(preorder,inorderIndex+1,right,map);
        return node;
    }
}