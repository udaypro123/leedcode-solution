class NumMatrix {

    int[][]matrix;
    int[][]prefixSum;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        prefixSumMatrix();
    }
    public void prefixSumMatrix(){
        prefixSum= new int [matrix.length][matrix[0].length];
        prefixSum[0][0] = matrix[0][0];

        // for the first row 
        for( int c=1; c<prefixSum[0].length ; c++){
            prefixSum[0][c]= prefixSum[0][c-1]+ matrix[0][c];
        }
        // for the first coloumn 
        for( int r=1; r <prefixSum.length ; r++){
            prefixSum[r][0]= prefixSum[r-1][0]+ matrix[r][0];
        }

        // for general case 

        for(int r=1; r<prefixSum.length; r++ ){
            for(int c=1; c<prefixSum[0].length ; c++){
                prefixSum[r][c]= prefixSum[r-1][c]
                 + prefixSum[r][c-1]
                  - prefixSum[r-1][c-1]
                   + matrix[r][c];
            }
        }
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int s= getSumInRigion(row2, col2);
        int a= getSumInRigion(row1-1,col2);
        int b= getSumInRigion(row2,col1-1);
        int c= getSumInRigion(row1-1,col1-1);  
        return s-a-b+c;  
    }

   public int getSumInRigion(int r, int c){
    if(r <0 || c<0) return 0;
    return prefixSum[r][c];
   }

}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */