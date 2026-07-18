class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int i=n-1;
        if(digits[i]!=9){
            digits[i]+=1;
        }
        else{
            while(i>=0 && digits[i]==9){
                digits[i]=0;
                i--;
            }
            if(i>=0){
                digits[i]+=1;
            }else{
                int[]arr=new int[n+1];
                arr[0]=1;
                for(int x=0;x<n;x++){
                    arr[x+1]=digits[x];
                }
                return arr;
            }
            
        }
        return digits;
    }
}