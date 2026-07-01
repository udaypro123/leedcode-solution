class Solution {
    public int searchInsert(int[] nums, int target) {
     int i =0;
     int j= nums.length -1;
     if(nums.length == 1  && nums[0] >= target) return 0;
     if(nums.length == 1  && nums[0] < target) return 1;
     if(target < nums[0]) return 0;
    //  if(target > nums[nums.length-1]) return nums.length+1;

     while( i <= j){
        int mid = i+ (j-i)/2;
        if(nums[mid ] == target) return mid;

        if(nums[mid] < target){
             i= mid+1;   
        }else{
            j= mid-1;
        }

     }
    return i;
        
    }
}