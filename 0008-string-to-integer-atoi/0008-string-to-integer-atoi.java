class Solution {
    public int myAtoi(String s) {
        int i=0;
        long num=0;
        while(i<s.length()&& s.charAt(i)==' '){
            i++;
        }
        if (i == s.length()) {
            return 0;
        }
        int sign =1;
        if(i<s.length()&&s.charAt(i)=='-'){
            sign=-1;
            i++;
        }else if(i<s.length()&&s.charAt(i)=='+'){
            sign=1;
            i++;
        }
        while(i<s.length()&& Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if (num > Integer.MAX_VALUE / 10 ||
    (num == Integer.MAX_VALUE / 10 && digit > (sign == 1 ? 7 : 8))){
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            num=num*10+digit;      
            i++;
        }
        return (int)(sign*num);
    }
}