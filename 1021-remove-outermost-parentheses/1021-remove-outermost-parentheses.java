class Solution {
    public String removeOuterParentheses(String s) {
       int depth=0;
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            if(depth>0){
                sb.append('(');
            }
            depth++;
        }
        else if(s.charAt(i)==')'){
            depth--;
            if(depth>0){
                sb.append(')');
            }
        }
       }
       return sb.toString();
    }
}