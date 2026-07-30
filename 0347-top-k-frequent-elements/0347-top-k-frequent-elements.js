/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {

    let obj={};

    for(let i=0; i<nums.length ; i++){
        if(!obj[nums[i]]){
            obj[nums[i]] =0;
        }
            obj[nums[i]]++;
    }

    let arr= Object.entries(obj).sort((a,b)=> b[1]-a[1]);

    let ans = [];

    for(let i=0; i<k; i++){
        ans.push(Number(arr[i][0]));
    }

    return ans;
    
};