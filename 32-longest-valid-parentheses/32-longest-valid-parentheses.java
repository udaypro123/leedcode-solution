class Solution {
    public int longestValidParentheses(String s) {
       Stack<Integer> st= new Stack<>();
        st.push(-1);
        int max=0;
        for( int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            if(c=='(')
                st.push(i);
            else{
                st.pop();
                if(st.isEmpty())
                    st.push(i);
                else{
                       int len= i - st.peek();
                max=Math.max(max,len);
                }
                 
            }
        }
        return max;

    }
}





//         int count=0;
        
//         if(s.length()==0)
//             return 0;
        
//        for(int i=0; i < s.length(); i++){
//            char c = s.charAt(i);
//             if(c=='(') {
//                 st.push(c);
//             }else{
//                 if(st.isEmpty())
//                     st.push(c);
//                 if(c==')' && st.peek()=='(' )
//                     st.pop();
//                count+=2; 
//             }
                
//         }
//         return count;