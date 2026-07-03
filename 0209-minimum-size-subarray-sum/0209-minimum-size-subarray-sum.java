class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int start =0;
        int track=0;
        int sum=0;
        int min = Integer.MAX_VALUE;
        boolean flag =false;
        for(int i= start ; i< nums.length ; i++){
                sum += nums[i];

                while(sum >= target && track <= i){
                    min = Math.min(min, i-track+1);
                    sum -= nums[track];
                    track++;
                    flag = true;
                }
        }
        
        return flag ? min : 0;
    }
}