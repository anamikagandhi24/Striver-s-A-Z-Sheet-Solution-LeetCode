class Solution {
    public String frequencySort(String s) {
        Map <Character, Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            pq.offer(entry);
        }
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer>entry=pq.poll();
            char c=entry.getKey();
            int freq=entry.getValue();
            for(int i=0;i<freq;i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}