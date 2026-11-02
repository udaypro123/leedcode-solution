class Solution {

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        int island = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    island++;
                }
            }
        }

        return island;

    }

    public void dfs(char[][] grid , int row, int col ) {

        int rows = grid.length;
        int columns = grid[0].length;

        if(row < 0 || col < 0 || row >= rows || col >= columns || grid[row][col] != '1'){
            return ;
        }

        grid[row][col]='0';

        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);

    }
}