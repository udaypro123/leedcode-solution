class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i=0;
        int j=0;
        int k=0;
        int n=nums2.length, m=nums1.length;
        int[] arr = new int[m+n];

        while(i < nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                arr[k++]=nums1[i];
                i++;
            }else{
                arr[k++]=nums2[j];
                j++;
            }
        }


        while(i< nums1.length){
            arr[k++]=nums1[i];
            i++;
        }

        while(j< nums2.length){
            arr[k++]=nums2[j];
            j++;
        }


        int mid = arr.length;
        double median =0;

        if(mid % 2 == 0 && mid >= 2){
            median = (arr[mid/2-1] + arr[mid /2])/2.0;
        }else{
            median = arr[mid /2];
        }
        return median;
    }
}