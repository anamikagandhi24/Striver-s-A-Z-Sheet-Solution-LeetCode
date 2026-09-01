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
    TreeMap<Integer,LinkedList<int[]>>map=new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        dfs(root,0,0);
        for(LinkedList<int[]>list:map.values()){
            Collections.sort(list,(a,b)->{
                if(a[0]!=b[0]){
                    return a[0]-b[0];
                }
                return a[1]-b[1];
            });
            List<Integer>temp=new ArrayList<>();
            for(int []pair:list){
                temp.add(pair[1]);
            }
            ans.add(temp);
        }
        return ans;
    }
    void dfs(TreeNode node, int row,int col){
        if(node==null){
            return;
        }
        if(!map.containsKey(col)){
            map.put(col, new LinkedList<>());
        }
        map.get(col).add(new int []{row,node.val});
        dfs(node.left, row+1, col-1);
        dfs(node.right,row+1,col+1);
    }
}