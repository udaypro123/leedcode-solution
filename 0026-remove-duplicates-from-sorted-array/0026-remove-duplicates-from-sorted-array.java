class Solution {
    public int removeDuplicates(int[] nums) {
        
        int val=nums[0];
        int count=1; 
         
        for(int i=0; i< nums.length ; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
                val= nums[i];
            }
         }

         return count;
    }
}