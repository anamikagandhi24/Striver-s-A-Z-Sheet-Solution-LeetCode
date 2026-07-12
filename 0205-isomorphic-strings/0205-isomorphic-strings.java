class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        char sChar;
        char tChar;
        HashMap<Character,Character>hm=new HashMap<>();
        HashMap<Character,Character>mh=new HashMap<>();
        for(int i=0;i<s.length();i++){
            sChar=s.charAt(i);
            tChar=t.charAt(i);
            if(hm.containsKey(sChar)){
                if(hm.get(sChar)!=tChar)return false;
            }else{
                if(mh.containsKey(tChar))return false;

                hm.put(sChar,tChar);
                mh.put(tChar,sChar);
            }
        }
        return true;
    }
}