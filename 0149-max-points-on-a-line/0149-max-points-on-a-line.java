class Solution {
    public int maxPoints(int[][] points) {
        int n= points.length;
        if(n==1) return 1;
        int maxpoint =0;

        for(int i=0; i< n-1; i++ ){
         for(int j=i+1; j< n; j++ ){
            int dx = points[j][0] - points[i][0];
            int dy = points[j][1] - points[i][1];
            int count =2;
            for(int k= 0; k< n ; k++){
                if( k!= i && k!=j ){
                  int dx_ = points[k][0] - points[i][0];
                  int dy_ = points[k][1] - points[i][1];
                  if(dy * dx_ == dy_ * dx) count++;
                }
            }
            maxpoint = Math.max(maxpoint , count); 
         }
        }  
        return maxpoint;
    }
}

