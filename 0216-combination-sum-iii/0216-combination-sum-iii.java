class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        helper(1,k,n,curr,ans);
        return ans;
    }
    public void helper(int start,int k, int remaining,List<Integer>curr,List<List<Integer>>ans){
        if(curr.size()==k && remaining==0){
            ans.add(new ArrayList(curr));
            return;
        }
        for(int i=start;i<10;i++){
            curr.add(i);
            helper(i+1,k,remaining-i,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}