class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>list=new ArrayList<>();
        String[]strs={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if (digits == null || digits.length() == 0) {
            return list;
        }
        backtrack(strs,list,new StringBuilder(),digits,0);
        return list;
    }
    private void backtrack(String[]strs,List<String>list, StringBuilder sb,String digits,int index){
        if(index==digits.length()){
            list.add(sb.toString());
            return;
        }
        int mapIndex=digits.charAt(index)-'2';
        String letters=strs[mapIndex];

        for(char ch:letters.toCharArray()){
            sb.append(ch);
            backtrack(strs,list,sb,digits,index+1);
            sb.deleteCharAt(sb.length()-1);
        }

    }

}