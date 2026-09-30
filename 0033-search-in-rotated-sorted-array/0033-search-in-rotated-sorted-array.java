class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;

        int startPtr = 0;
        int endPtr = nums.length - 1;

        while (startPtr <= endPtr) {
            int mid = startPtr + (endPtr - startPtr) / 2;
            if(target == nums[mid]) ans= mid;

            if (nums[mid] >= nums[startPtr]) {
                if (target >= nums[startPtr] && target < nums[mid]) {
                    endPtr = mid - 1;
                } else {
                    startPtr = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[endPtr]) {
                    startPtr = mid + 1;
                } else {
                    endPtr = mid - 1;
                }
            }
        }

        return ans;

    }
}