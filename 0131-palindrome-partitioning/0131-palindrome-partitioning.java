class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>curr=new ArrayList<>();
        int start=0;
        helper(start,s,curr,ans);
        return ans;
    }
    public void helper(int start, String s, List<String>curr, List<List<String>>ans){
        if(start==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                curr.add(s.substring(start,end+1));
                helper(end+1,s,curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int start, int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}