class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int i=1;
        int j= position[position.length-1]-position[0];
        int ans =0;
        while(i<= j){
            int mid = i + (j-i)/2;

            if(isPossible(position, m, mid)){
                ans=mid;
                i= mid+1;
            }else{
                j= mid-1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] position, int m , int midDistance){
        int lastBallPosition = position[0];
        int ballplaced= 1;

        for(int i=1; i< position.length ; i++){
            if(position[i]-lastBallPosition >= midDistance ){
                lastBallPosition= position[i];
                ballplaced++;

                if(ballplaced == m) return true;
            }
        }
        return false;
    }
}