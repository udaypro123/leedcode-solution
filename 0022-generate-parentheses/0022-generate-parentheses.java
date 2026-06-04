class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateAllParenthesis(0, 0, n , "", ans);
        return ans;  
    }

    public void generateAllParenthesis(int open , int close , int n , String curr, List<String> ans){

        if(curr.length() == 2*n){
            ans.add(curr);
            return;
        }

        if(open < n){
            generateAllParenthesis(open+1 , close , n, curr + "(", ans);
        }
        if(close < open){
            generateAllParenthesis(open , close +1 , n, curr + ")", ans);
        }
    }

}