class Solution {
    public boolean rotateString(String s, String goal) {
        String r=s+s;
        if(s.length()!=goal.length()){
            return false;
        }
        if(r.contains(goal)){
            return true;
        }
        return false;
    }
}