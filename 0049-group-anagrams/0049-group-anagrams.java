class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        int n=strs.length;
        for(String s:strs){
            char[]c=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);

            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                ArrayList<String>list=new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}