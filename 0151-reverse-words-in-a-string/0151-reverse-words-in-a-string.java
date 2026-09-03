class Solution {
    public String reverseWords(String s) {
        ArrayList<String>arr=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            while(i<s.length() && s.charAt(i)==' '){
                i++;
            }
            if (i == s.length()) {
                break;
            }
            int start=i;
            while(i<s.length()&& s.charAt(i)!=' '){
                i++;
            }
            arr.add(s.substring(start,i));
        }
        StringBuilder ans=new StringBuilder();
        for(int j=arr.size()-1;j>=0;j--){
            ans.append(arr.get(j));
            if(j!=0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}