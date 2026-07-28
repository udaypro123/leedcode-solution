class Solution {
    public int twoCitySchedCost(int[][] costs) {

        List<int[]> list = new ArrayList<>();
        int ans=0;

        for(int i=0; i<costs.length; i++){
            int diff = costs[i][0]-costs[i][1];
            list.add(new int[]{diff, i});
        }

        Collections.sort(list,(a,b)-> {
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        
        int n=costs.length/2;

        for(int i=0; i<costs.length; i++){
             int val=list.get(i)[1];
             if(i<n){
             ans += costs[val][0];
             }else{
             ans += costs[val][1];
             }
        }

        return ans;
    }
}