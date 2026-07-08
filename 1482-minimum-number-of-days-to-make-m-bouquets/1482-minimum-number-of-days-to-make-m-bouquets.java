class Solution {
    static int noOfBouquets(int []bloomDay,int day, int k){
        int count=0;
        int bouquets=0;
        for( int bloom : bloomDay){
            if(bloom<=day){
                count++;
            }else{
                bouquets+=count/k;
                count=0;
            }
        }
        bouquets+=count/k;
        return bouquets;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k>n)return -1;
        int left=bloomDay[0];
        int right=bloomDay[0];
        for(int bloom:bloomDay){
            right=Math.max(bloom,right);
            left=Math.min(bloom,left);
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            int b=noOfBouquets(bloomDay,mid,k);
            if(b>=m){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}