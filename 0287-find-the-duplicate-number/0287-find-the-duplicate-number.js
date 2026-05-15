/**
 * @param {number[]} nums
 * @return {number}
 */
var findDuplicate = function(nums) {

    nums=nums.sort()
    let ans=0
    for (let i = 0; i < nums.length; i++) {
        if(nums[i]==nums[i+1]){
            ans=nums[i]
        }
    }
    return ans
    
};