class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;
        Stack<Integer> st = new Stack<>();

        int[] arr = new int[n];

        for( int i= 0 ; i < n ; i++ ){
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                int index = st.pop();
                arr[index] = i-index;
            }
            st.push(i);
        }

        return arr;
        
    }
}