class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length ==0 || nums.length ==1) return nums.length;

        Arrays.sort(nums);

        int count=1;
        int maxlen=1;
        int val= nums[0];


        for(int i=0; i<nums.length-1; i++){
            int data = val+1;
            if(nums[i] == nums[i+1]) continue;
            if(data == nums[i+1]){
                count++;
                val= nums[i+1];
            }else{
                count=1;
                val= nums[i+1];
            }

            maxlen = Math.max(maxlen, count);
        }

        return maxlen;
        
    }
}