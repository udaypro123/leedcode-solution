class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

            HashMap<Integer, Integer> map = new HashMap<>();

            int[] ans = new int[nums1.length];

            for(int i=0; i< nums2.length ; i++){
                map.put(nums2[i], i);
            }

            for(int i=0; i< nums1.length ; i++){
                if(map.containsKey(nums1[i])){
                    int index= map.get(nums1[i]);
                    int max=nums2[index];
                    if(index == nums2.length-1 ) ans[i]= -1;
                    for(int j= index+1 ; j < nums2.length ; j++){
                            if(max < nums2[j]){
                                ans[i]=nums2[j];
                                break;
                            }else{
                                ans[i] =-1;
                            }
                    }
                }
            }

            return ans;
        
    }
}