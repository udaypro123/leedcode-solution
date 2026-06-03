class Solution {
    public void sortColors(int[] nums) {

        int i=0, j=0, k=nums.length-1;

        while(j<= k){
            if(nums[j]==0){
                swap(nums, i, j);
                i++;
                j++;
            }else if(nums[j]==1) {
                j++;
            }else if(nums[j]==2){
                swap(nums, j, k);
                k--;
            }
        } 
    }

    public void swap(int[] nums, int i, int j){
        int temp=nums[j];
        nums[j] = nums[i];
        nums[i]= temp; 
    }
}