class Solution {
    public int daysNeeded(int[]weights,int capacity){
        int remaining=capacity;
        int d=1;
        for(int i=0;i<weights.length;i++){
            if(remaining>=weights[i]){
                remaining-=weights[i];
            }
            else{
                d++;
                remaining=capacity-weights[i];
            }
        }
        return d;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left=0,right=0;
        for(int w:weights){
            left=Math.max(w,left);
            right+=w;
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            int reqD=daysNeeded(weights,mid);
            if(reqD<=days){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}