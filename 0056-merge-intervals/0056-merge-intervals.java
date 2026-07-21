class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int []curr=intervals[0];
        List<int[]>merged=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=curr[1]){
                curr[1]=Math.max(curr[1],intervals[i][1]);
            }else{
                merged.add(curr);
                curr=intervals[i];
            }
        }
        merged.add(curr);
        return merged.toArray(new int[0][]);
    }
}