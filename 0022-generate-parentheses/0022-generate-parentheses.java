class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list=new ArrayList<>();
        helper(0,0,"",n,list);
        return list;
    }
    public void helper(int open, int close,String curr,int n,List<String>list){
        if(open==n && close==n){
            list.add(curr);
            return;
        }
        if(open<n){
            helper(open+1,close,curr +"(",n,list);
        }
        if(close<open){
            helper(open,close+1,curr +")",n,list);
        }
    }
}