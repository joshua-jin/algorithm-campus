package com.lintcode;

/**
 * @author : Joshua
 * Date:     3/26/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/paint-fence/">paint-fence</a>
 */
public class PaintFence {
    /**
     * @param n non-negative integer, n posts
     * @param k non-negative integer, k colors
     * @return an integer, the total number of ways
     */
    public int numWays(int n, int k) {
        // Write your code here
        if (n <= 1 || k <= 0) {
            return n * k;
        }
        int[] dp = new int[n + 1]; //index based : 1
        dp[0] = 0;
        dp[1] = k;
        dp[2] = k + k*(k - 1);
        for (int i = 3; i <= n; i++) {
            dp[i] = (k - 1) * (dp[i - 1] + dp[i - 2]);
        }
        return dp[n];
    }
}
