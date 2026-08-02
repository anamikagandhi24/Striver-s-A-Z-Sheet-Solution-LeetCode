class Solution {
    public int numDecodings(String s) {
        int []dp=new int [s.length()];
        Arrays.fill(dp,-1);
        return helper(s,0,dp);
    }
    public int helper(String s,int start,int[]dp){
        if(start==s.length()){
            return 1;
        }
        if(s.charAt(start)=='0'){
            return 0;
        }
        if(dp[start]!=-1){
            return dp[start];
        }
        int ways=helper(s,start+1,dp);
        if(start+1<s.length()){
            int num=(s.charAt(start)-'0')*10 +(s.charAt(start+1)-'0');
            if(num>=10 && num<=26){
                ways+=helper(s,start+2,dp);
            }
        }
        dp[start]=ways;
        return dp[start];
    }
}