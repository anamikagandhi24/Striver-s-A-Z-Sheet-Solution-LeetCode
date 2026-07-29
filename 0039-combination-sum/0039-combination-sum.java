class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        int start=0;
        Arrays.sort(candidates);
        helper(candidates,target,start,ans,curr);
        return ans;
    }
    public void helper(int[] candidates, int target,int start,List<List<Integer>>ans,List<Integer>curr){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(candidates[i]>target){
                break;
            }
            curr.add(candidates[i]);
            helper(candidates,target-candidates[i],i,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
}