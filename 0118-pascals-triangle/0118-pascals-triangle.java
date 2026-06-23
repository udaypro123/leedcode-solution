class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        if(numRows == 1) {
            ans.add(row1);
            return ans ;
        }
        List<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);

        ans.add(row1);
        ans.add(row2);

        if(numRows == 2) {
            return ans;
        }
        

        for(int i=3 ; i<= numRows ; i++){
            List<Integer> resultant = ans.get(i-2);
            List<Integer> rowAdd = new ArrayList<>();
            for(int j=0; j<i; j++){
                if(j==0) rowAdd.add(1);
                if(j !=0 && j != (i-1) ) rowAdd.add(resultant.get(j) + resultant.get(j-1));
                if(j == (i-1)) rowAdd.add(1);
            }

            ans.add(rowAdd);
        }

        return ans;
        
    }
}