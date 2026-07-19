class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []range=new int[]{-1,-1};
        int n=nums.length;
        
        for(int left=0;left<n;left++){
            if(nums[left]==target){
                range[0]=left;
                break;
            }
        }
        for(int right=n-1;right>=0;right--){
            if(nums[right]==target){
                range[1]=right;
                break;
            }
        }
        return range;
    }
}