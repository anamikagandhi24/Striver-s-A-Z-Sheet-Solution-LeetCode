class Solution {
    public List<String> addOperators(String num, int target) {
        List<String>ans=new ArrayList<>();
        String sb="";
        helper(num,target,ans,sb,0,0,0);
        return ans;
    }
    public void helper(String num,int target,List<String>ans,String sb,int start,long result,long prevOp){
        if(start==num.length()){
            if(result==target){
                ans.add(sb);
            }
            return;
        }
        for(int i=start;i<num.length();i++){
            if(i>start && num.charAt(start)=='0')
                break;
            String part=num.substring(start,i+1);
            long curr=Long.parseLong(part);

            if(start==0){
                helper(num,target,ans,part,i+1,curr,curr);
            }else{
                helper(num,target,ans,sb+"+" +part,i+1,result+ curr,curr);
                helper(num,target,ans,sb+"-" +part,i+1,result- curr,-curr);
                helper(num,target,ans,sb+"*" +part,i+1,result- prevOp+prevOp*curr ,prevOp*curr);
            }
        }

    }
}