class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getAllpermutations(nums, 0, ans );
        return ans;
    }

    public void getAllpermutations(int[] arr, int idx , List<List<Integer>> ans){
        if(idx == arr.length ){
            List<Integer> res = new ArrayList<>();
            for(int val: arr){
                res.add(val);
            }
            ans.add(res);
            return;
        }
        HashSet<Integer> duplicate = new HashSet<>();
        for(int i=idx ; i<arr.length ; i++){
            if(duplicate.contains(arr[i])) continue ;
            duplicate.add(arr[i]);
            swap(arr, i, idx);
            getAllpermutations(arr, idx+1, ans);
            swap(arr, i, idx);
        }
    }
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
}