class Solution {
    public boolean isMiddleElementUnique(int[] nums) {

        int count =0;
        int mid = nums.length /2;

        for(int i=0; i< nums.length ; i++){
            if(nums[mid] == nums[i]) count++;
        }


        return count < 2 ? true : false;
        
    }
}