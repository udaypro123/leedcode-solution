class Solution {
    public int findPairs(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int val: nums){
            if(map.containsKey(val)){
                map.put(val, map.get(val)+1);
            }else{
                map.put(val, 1);
            }
        }
        

        for(int val : map.keySet()){
            int sum = val+k;

            if(k==0){
                if(map.get(val) > 1) count++;
            }else{
                if(map.containsKey(sum)) count++;
            }
        }

        return count;
    }
}