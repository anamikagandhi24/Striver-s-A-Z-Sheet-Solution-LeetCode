class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        Integer []arr=set.toArray(new Integer[0]);
        Arrays.sort(arr);
        int n=arr.length;
        if(n<3)return arr[n-1];
        return arr[n-3];

    }
}