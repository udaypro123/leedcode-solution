class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n= nums.length/3;

        for(int val :nums){
            if(map.containsKey(val)){
                map.put(val, map.get(val)+1);
            }else{
                map.put(val, 1);
            }
        }

        for(int val : map.keySet()){
            if(map.get(val) > n ){
                ans.add(val);
            }
        }

        return ans;
        
    }
}