class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b)-> a[1]<= b[1] ? -1: 1);
        int maxArrow = 1;
        int lastEndArrowHit = points[0][1];

        for(int i=1; i<points.length ; i++){
            if(points[i][0] > lastEndArrowHit){
                maxArrow++;
                lastEndArrowHit = points[i][1];
            }
        }

        return maxArrow;
        
    }
}