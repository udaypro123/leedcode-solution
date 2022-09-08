class Solution {
    public int firstMissingPositive(int[] nums) {
        
       Arrays.sort(nums);
     
        int i=1; 
          int n=nums.length;
        
        if( n==0)
             return n+1;
        
        
        
      for( int j=0; j< nums.length; j++){
         
          if(nums[j]==i)
                i++;
        }
        
        return i;
        
    }
    
//    public void swap(int []nums, int i, int j){
//         int temp=nums[i];
//        nums[i]=nums[j];
//        nums[j]=temp;
//     }
        
    
}