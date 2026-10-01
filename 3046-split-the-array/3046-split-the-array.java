class Solution {
    public boolean isPossibleToSplit(int[] nums) {

        Arrays.sort(nums);
        int val= nums[0];
        int count=1;


        for(int i=1; i<nums.length; i++){
                if(nums[i] == val){
                    count++;
                    val = nums[i];
                }else{
                    val= nums[i];
                    count =1;
                }

                if(count > 2) return false ;
        }

        return true;
        
    }
}