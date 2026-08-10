class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean []open=new boolean[101];
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<bulbs.size();i++){
            open[bulbs.get(i)]=!open[bulbs.get(i)];
        }
        for(int i=0;i<101;i++){
            if(open[i]==true){
                list.add(i);
            }
        }
        return list;

    }
}