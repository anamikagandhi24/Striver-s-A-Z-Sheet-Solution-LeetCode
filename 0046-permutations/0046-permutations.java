class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        boolean []visited=new boolean [nums.length];

        helper(nums,visited,curr,ans);
        return ans;
    }
    public void helper(int []nums,boolean []visited,List<Integer>curr, List<List<Integer>>ans){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                curr.add(nums[i]);
                visited[i]=true;
                helper(nums,visited,curr,ans);
                curr.remove(curr.size()-1);
                visited[i]=false;
            }
        }
    }
}