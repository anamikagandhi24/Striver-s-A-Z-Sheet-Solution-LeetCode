class Solution {
    public long hoursNeeded(int []piles,int mid){
        long hours=0;
        for(int pile:piles){
            hours+=(pile+mid-1)/mid;
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int num:piles){
            right=Math.max(right,num);
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            long hn=hoursNeeded(piles,mid);
            if(hn<=h){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
        
    }
}