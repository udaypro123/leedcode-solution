class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        // {value, index}
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );

        int index = 0;

        for (int i = 0; i < n; i++) {

            // Current element add karo
            pq.offer(new int[]{nums[i], i});

            // Window ke bahar wale elements hatao
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }

            // Jab first window complete ho jaye
            if (i >= k - 1) {
                ans[index++] = pq.peek()[0];
            }
        }

        return ans;
    }
}