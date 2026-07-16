class Solution {
    public int findMaxLength(int[] nums) {

        int prefixSum =0;
        int maxlength =0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i=0; i< nums.length ; i++){
            if(nums[i] ==0){
                prefixSum--;
            }else{
                prefixSum++;
            }


            if(map.containsKey(prefixSum)){
                int length  = i- map.get(prefixSum);
                maxlength = Math.max(maxlength , length);
            }else{
                map.put(prefixSum , i);
            }
        }
        
        return maxlength;
    }
}