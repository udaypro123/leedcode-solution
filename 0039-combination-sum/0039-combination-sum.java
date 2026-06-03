class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        uniqueCombinations(candidates,target, 0, curr , ans);
        return ans;  
    }

    public void uniqueCombinations(int[]arr, int val , int i, List<Integer> curr, List<List<Integer>> ans ){

        if(val == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(i >= arr.length || val<0){
            return ;
        }

        curr.add(arr[i]);
        uniqueCombinations(arr, val-arr[i], i, curr, ans);
        curr.remove(curr.size()-1);
        uniqueCombinations(arr, val, i+1, curr, ans);
    }
}