class Solution {
    int i=0;
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            pq.offer(new int[]{e.getKey(),e.getValue()});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int [] ans=new int[k];
        while(!pq.isEmpty()){
            int cur[]=pq.poll();
            ans[i++]=cur[0];
        }
        return ans;
    }
}