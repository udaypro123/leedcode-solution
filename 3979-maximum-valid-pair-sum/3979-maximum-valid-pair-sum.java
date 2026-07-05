class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxvalue = nums[0];
        int maxPairSum = nums[0]+ nums[k];
        
       for(int j=k; j<nums.length ; j++){
           maxvalue = Math.max(maxvalue, nums[j-k]);
           maxPairSum = Math.max(maxPairSum, maxvalue+nums[j]);
       }

        return maxPairSum;
        
    }
}