package algorithm.lintcode.easy;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] is = new int[n];
        is[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                is[j] += is[j - 1];
            }
        }
        return is[is.length - 1];
    }
}
