class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int y=0;
        while( x>0){
            
            int z= x%10;
            x= x/10;
            y=y*10+z;
        }
        return y==n;
    }
}