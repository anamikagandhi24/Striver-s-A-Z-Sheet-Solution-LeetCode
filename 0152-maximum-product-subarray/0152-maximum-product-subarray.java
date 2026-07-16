class Solution {
    public int maxProduct(int[] nums) {
        int oldMax=nums[0];
        int oldMin=nums[0];
        int global=nums[0];
        for(int i=1;i<nums.length;i++){
            int a=nums[i];
            int b=oldMax*nums[i];
            int c=oldMin*nums[i];
            int newMax=Math.max(a, Math.max(b, c));
            int newMin=Math.min(a, Math.min(b, c));
            oldMax=newMax;
            oldMin=newMin;
            global=Math.max(global,oldMax);
        }
        return global;
    }
}