class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans  = new ArrayList<>();
        getAllPermutations(nums, 0, ans);
        return ans; 
    }

    public void getAllPermutations(int[] nums , int idx, List<List<Integer>> ans){
        if(idx== nums.length ){
            List<Integer> res  = new ArrayList<>();
            for(int val: nums) res.add(val);
            ans.add(res);
            return ;
        }

        for(int i=idx ; i<nums.length ; i++){
            swap(nums, idx , i);
            getAllPermutations(nums, idx +1, ans );
            swap(nums, idx , i);
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}