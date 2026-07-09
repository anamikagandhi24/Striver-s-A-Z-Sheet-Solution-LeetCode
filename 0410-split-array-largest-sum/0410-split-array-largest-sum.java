class Solution {
    boolean ifPossible(int[]nums,int limit,int k){
        int subarrays=1;
        int remaining=limit;
        for(int num:nums){
            if(num<=remaining){
                remaining-=num;
            }
            else{
                subarrays++;
                remaining=limit-num;
            }
        }
        if(subarrays<=k)return true;
        return false;
    }
    public int splitArray(int[] nums, int k) {
        int ans=-1;
        int left=nums[0];
        int right=0;
        for(int num:nums){
            left=Math.max(left,num);
            right+=num;
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(ifPossible(nums,mid,k)){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}