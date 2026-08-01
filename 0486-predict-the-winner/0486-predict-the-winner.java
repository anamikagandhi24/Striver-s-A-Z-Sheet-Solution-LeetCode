class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        Integer [][]dp=new Integer[n][n];
        return helper(nums,0,nums.length-1,dp)>=0;
    }
    public int helper(int []nums,int left,int right,Integer[][]dp){
        if(dp[left][right]!=null)
            return dp[left][right];
        if(left==right){
            return nums[left];
        }else{
            dp[left][right]= Math.max(nums[left]-helper(nums,left+1,right,dp),nums[right]-helper(nums,left,right-1,dp));
        }
        return dp[left][right];
    }
}