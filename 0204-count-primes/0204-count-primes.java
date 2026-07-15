class Solution {
    public int countPrimes(int n) {
        int count=0;
        if(n==0 ||n==1)return 0;
        boolean []isPrime=new boolean[n];
        for(int i=2;i<n;i++){
            isPrime[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(isPrime[i]==true){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }
            
        }
        for(int i=0;i<n;i++){
            if(isPrime[i]==true){
                count++;
            }
        }
        return count;
    }
}