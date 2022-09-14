class Solution {
    public int maximumProduct(int[] nums) {
     
        Arrays.sort(nums);
         int max=Integer.MIN_VALUE;
        int n=nums.length;
      return Math.max(nums[0]*nums[1]*nums[n-1], nums[n-1]*nums[n-2]*nums[n-3]);
    }
}