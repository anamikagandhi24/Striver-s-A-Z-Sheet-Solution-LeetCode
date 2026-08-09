class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Integer.compare(nums1[a[0]]+nums2[a[1]],nums1[b[0]]+nums2[b[1]]));
        Set<String>visited=new HashSet<>();
        pq.offer(new int[]{0,0});
        visited.add("0,0");
        while(k>0 && !pq.isEmpty()){
            int []curr=pq.poll();
            int i=curr[0];
            int j=curr[1];
            ans.add(Arrays.asList(nums1[i],nums2[j]));
            k--;
            if(j+1<nums2.length){
                String key=i+","+(j+1);
                if(!visited.contains(key)){
                    pq.offer(new int[]{i,j+1});
                    visited.add(key);
                }
            }
            if(i+1<nums1.length){
                String key=(i+1)+","+j;
                if(!visited.contains(key)){
                    pq.offer(new int[]{i+1,j});
                    visited.add(key);
                }
            }
        }
        return ans;
    }
}