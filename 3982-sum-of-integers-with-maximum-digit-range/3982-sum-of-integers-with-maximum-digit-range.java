class Solution {
    public int maxDigitRange(int[] nums) {
        int n= nums.length;
        int[] digitRange = new int[n];
       
        for(int i=0; i<n ; i++){
                int max =Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                int num = nums[i]; 
                while(num != 0){
                    int rem= num%10;
                    num= num/10;
                     min=Math.min(min, rem);
                     max=Math.max(max, rem);
                }
                int val= max-min;
                digitRange[i] = val;
        }

        int maxVlaue = Integer.MIN_VALUE;
        for(int i=0; i<n ; i++){
            if(digitRange[i] > maxVlaue ){
                maxVlaue= digitRange[i];
            }
        }

        int ans= 0;

        for(int i=0; i<n ; i++){
            if(digitRange[i] == maxVlaue ){
                ans += nums[i];
            }
        }

        return ans;
        
    }
}