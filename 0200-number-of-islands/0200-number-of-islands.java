class Solution {
    int rows;
    int columns;

    public int numIslands(char[][] grid) {
        rows = grid.length;
        columns = grid[0].length;

        boolean [][] visited = new boolean[rows][columns];
        int island =0;
        for(int i=0; i< rows; i++){
            for(int j=0; j< columns; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    solveUsingDFS(i, j,visited, grid);
                    island++;
                }
            }
        }

        return island;
        
    }

    public void solveUsingDFS(int row, int col, boolean[][] visited,  char[][] grid){

            if(row < 0 || row >= rows || col < 0 || col >= columns || grid[row][col]== '0' || visited[row][col] ){
                return;
            }

            visited[row][col]= true;
            int[][] griddirections = {{row-1 , col }, {row, col+1}, {row+1, col} , {row, col-1}};

            for(int[] direction : griddirections){
                int rowt = direction[0];
                int colt = direction[1];
                solveUsingDFS(rowt, colt, visited, grid); 
            }

    }
}