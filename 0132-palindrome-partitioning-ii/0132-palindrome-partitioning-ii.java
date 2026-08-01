class Solution {
    public int minCut(String s) {
        int []dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return helper(s,0,dp);
    }
    public int helper(String s, int start,int[]dp){
        int minCuts=Integer.MAX_VALUE;
        if(dp[start]!=-1){
            return dp[start];
        }
        for(int end=start;end<s.length();end++){
            
            if(isPalindrome(s,start,end)){
                int currCuts;

                if(end==s.length()-1){
                    currCuts=0;
                }else{
                    currCuts=1+helper(s,end+1,dp);
                }
                minCuts=Math.min(minCuts,currCuts);
            }
        }
        dp[start]=minCuts;
        return dp[start];
    }
    public boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}