class Solution {
    public int kthSmallest(int[][] mat, int k) {

        int[] help = { 0 };

        for (int[] arr : mat) {
            PriorityQueue<Integer> maxheap = new PriorityQueue<>((a, b) -> b - a);

            for (int sum : help) {
                for (int val : arr) {
                    int currsum = val + sum;

                    if (maxheap.size() < k) {
                        maxheap.offer(currsum);
                    } else if (currsum < maxheap.peek()) {
                        maxheap.poll();
                        maxheap.offer(currsum);
                    } else {
                        break;
                    }
                }
            }

            int size = maxheap.size();
            help = new int[size];
            for (int i = size - 1; i >= 0; i--) {
                help[i] = maxheap.poll();
            }
        }

        return help[k - 1];

    }
}