class Solution {
    public int search(int[] nums, int target) {

       int ans = -1;
       int i=0;
       int j=nums.length -1;
       while( i <= j){

        int mid = i+ (j-i) /2;
        if(target == nums[mid]) ans= mid;

        if(nums[mid] >= nums[i]){
            if(target >= nums[i] && target < nums[mid]){
                    j = mid-1;
            }else{
                i = mid+1;
            }
        }else{
            if(target > nums[mid] && target <= nums[j]){
                 i = mid+1;
            }else{
                j=mid-1;
            }
        }

       }

        return ans;
        
    }
}