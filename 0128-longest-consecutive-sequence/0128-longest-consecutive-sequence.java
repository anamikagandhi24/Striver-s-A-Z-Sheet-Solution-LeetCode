class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int max=0;
        for(int num :nums){
            set.add(num);
        }for(int num:set){
            if(!set.contains(num-1)){
                int curNum=num;
                int curStreak=1;
                while(set.contains(curNum+1)){
                    curNum++;
                    curStreak++;
                }
                max=Math.max(curStreak,max);
            }
        }
        return max;
    }
}