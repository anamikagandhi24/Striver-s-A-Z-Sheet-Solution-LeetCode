class Solution {
    public int smallestNumber(int n, int t) {
        int digitproduct=1;
        int i=n;
        while(i!=0){
            digitproduct*=i%10;
            i=i/10;
        }
        i=n;
        if(digitproduct%t!=0){
            return smallestNumber(i+1,t);
        }
        return i;
    }
}