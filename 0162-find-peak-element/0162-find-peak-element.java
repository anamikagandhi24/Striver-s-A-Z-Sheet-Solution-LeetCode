class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+2];
        arr[0]=Integer.MIN_VALUE;
        arr[n+1]=Integer.MIN_VALUE;
        for(int i=1;i<n+1;i++){
            arr[i]=nums[i-1];
        }

        for(int i=1;i<n+1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                return i-1;
            }
        }
        return 0;
    }
}