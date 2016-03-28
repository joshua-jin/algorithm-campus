package algorithm.lintcode.easy;

public class PaintFence {
    public int numWays(int n, int k) {
        if (n == 0) {
            return 0;
        }
        int[] ways = new int[]{0, k, k};
        for (int i = 2; i <= n; i++) {
            int nowWays = ways[2] * k - ways[0];
            ways[0] = ways[1];
            ways[1] = ways[2] * (k - 1);
            ways[2] = nowWays;
        }
        return ways[2];
    }
}
