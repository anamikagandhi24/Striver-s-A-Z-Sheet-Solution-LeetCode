class Solution {
    public void sortColors(int[] nums) {
        int x=0,y=0,z=0;
        int []arr=new int[nums.length];
        for(int num:nums){
            if(num==0){
                x++;
            }else if(num==1){
                y++;
            }else{
                z++;
            }
        }
        for(int i=0;i<x;i++){
            nums[i]=0;
        }
        for(int i=x;i<y+x;i++){
            nums[i]=1;
        }
        for(int i=x+y;i<z+x+y;i++){
            nums[i]=2;
        }
        
    }
}