package org.robynhan.week10;

public class NumWaysSolution {
    public int numWays(int n, int k) {
        // Write your code here
        int dp[] = new int[n];
        if (n == 0) return 0;
        if (n == 1) return k;
        dp[0] = k;
        dp[1] = k * k;

        for (int i = 2; i < n; i++) {
            dp[i] = (k - 1) * (dp[i - 1] + dp[i - 2]);
        }

        return dp[n - 1];
    }
}
