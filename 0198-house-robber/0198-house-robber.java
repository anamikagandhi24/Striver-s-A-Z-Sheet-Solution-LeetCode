class Solution {
    public int rob(int[] nums) {
        int []dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int start=0;
        return helper(nums,start,dp);
    }
    public int helper(int[]nums,int start,int[]dp){
        if(start>=nums.length)
            return 0;
        if(dp[start]!=-1){
            return dp[start];
        }
        dp[start] = Math.max(nums[start] + helper(nums,start + 2,dp),helper(nums,start + 1,dp));
        return dp[start];
    }
}