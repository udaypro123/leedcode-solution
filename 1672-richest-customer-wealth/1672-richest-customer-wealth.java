class Solution {
    public int maximumWealth(int[][] accounts) {
        
          int rich =Integer.MIN_VALUE;
        
        for(int i=0; i<accounts.length; i++){
            int n=0;
          for(int j=0; j< accounts[0].length; j++){
              n += accounts[i][j];       
            }
            if(n > rich){
                rich=n;
            }
        }
        return rich;
    }
}