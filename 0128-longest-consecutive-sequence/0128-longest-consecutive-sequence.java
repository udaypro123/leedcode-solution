class Solution {
    public int longestConsecutive(int[] nums) {

        HashMap<Integer, Boolean> map = new HashMap<>();
        int maxlen=0;
        for(int num: nums){
            map.put(num, true);
        }

        for(int num: map.keySet()){
            if(!map.containsKey(num-1)){
                int curr= num;
                int count =1;
                while(map.containsKey(curr+1)){
                    count++;
                    curr++;
                }
                maxlen = Math.max(maxlen, count);
            }
        }

        return maxlen;
        
    }
}