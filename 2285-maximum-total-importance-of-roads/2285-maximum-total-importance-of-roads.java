class Solution {
    public long maximumImportance(int n, int[][] roads) {

        long [] roadsmap = new long[n];

        for(int i=0; i <roads.length ; i++){
            roadsmap[roads[i][0]]++;
            roadsmap[roads[i][1]]++;
        }

        Arrays.sort(roadsmap);
        long res =0;
        long count=1;
        for(int i=0; i< n; i++){
            res += (roadsmap[i] * count);
            count++;
        }

        return res;
        
    }
}