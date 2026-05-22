class Solution {
    public int[] searchRange(int[] nums, int target) {

        int firstOccurance = findFirstOccurance(nums, target);
        int lastOccurance = findLastOccurance(nums, target);
        return new int[]{firstOccurance, lastOccurance};
    }

    public static int findFirstOccurance(int[] arr, int target){

        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start <= end){
            int mid = start + (end -start)/2;

            if(arr[mid] == target) {
                    ans= mid;
                    end = mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                end= mid-1;
            }
        }

        return ans;

    }
    public static int findLastOccurance(int[] arr, int target){

        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start <= end){
            int mid = start + (end -start)/2;

            if(arr[mid] == target) {
                    ans= mid;
                    start = mid+1;
                  
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                end= mid-1;
            }
        }
        return ans;

    }
  
}