class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        // hashmap help to track to occurance and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        int occurance=0;
        for(int i=0; i< nums.length ; i++ ){
            if(nums[i] == x){
                occurance++;
                map.put(occurance, i); // store in map index and occurance
            }
        }

        for(int i=0; i< queries.length ; i++ ){
            // check queries[i] is present or not in the hashmap then perform action
            if(map.containsKey(queries[i])){
                queries[i] = map.get(queries[i]);
            }else{
                queries[i] =-1;
            }
        }

     return queries;

    }
}