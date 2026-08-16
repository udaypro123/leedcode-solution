class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;

        for(int i=0; i<grid.length; i++){
            int[] eleArr = grid[i];
            for(int  j=0; j< eleArr.length; j++){
                if (eleArr[j]< 0){
                    count++;
                }
            }
        }
        return count;
    }
}