class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        int sum=0;
        for(String ch :operations){
            if(ch.equals("+")&& st.size()>=2){
                int first=st.pop();
                int second=st.peek();
                int n=first+second;
                st.push(first);
                st.push(n);
            }else if(ch.equals("D")&& !st.isEmpty()){
                int r=st.peek();
                st.push(2*r);
            }
            else if(ch.equals("C") && !st.isEmpty()){
                st.pop();
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}