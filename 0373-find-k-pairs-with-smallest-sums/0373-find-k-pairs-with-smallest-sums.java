class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i=0 ; i< Math.min(nums1.length , k); i++) {
            int sum = nums1[i] + nums2[0];
            pq.offer(new int[] { sum, i, 0 });
        }

        while (k > 0 && !pq.isEmpty()) {
            int[] top = pq.poll();
            int i=top[1];
            int j=top[2];
            List<Integer> res = new ArrayList<>();
            res.add(nums1[i]);
            res.add(nums2[j]);
            ans.add(res);
            if(j+1 <  nums2.length ){
                pq.offer(new int[] { nums1[i] + nums2[j+1], i, j+1 });
            }
            k--;
        }

        return ans;
    }
}