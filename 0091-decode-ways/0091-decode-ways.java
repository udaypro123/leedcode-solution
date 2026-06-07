class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(s.charAt(0) == '0') return 0;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (s.charAt(i-1) != '0') {
                dp[i] += dp[i - 1];
            }

            char c1 = s.charAt(i-2);
            char c2 = s.charAt(i - 1);

            if (c1 == '1' || c1 == '2' && c2 <= '6') {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}