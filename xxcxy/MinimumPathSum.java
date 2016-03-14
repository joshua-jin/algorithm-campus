package algorithm.lintcode.easy;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if (grid.length < 1) {
            return 0;
        }
        int[][] minPathSum = new int[grid.length][grid[0].length];
        minPathSum[0][0] = grid[0][0];
        for (int i = 1, len = grid.length; i < len; i++) {
            minPathSum[i][0] = minPathSum[i - 1][0] + grid[i][0];
        }
        for (int i = 1, len = grid[0].length; i < len; i++) {
            minPathSum[0][i] = minPathSum[0][i - 1] + grid[0][i];
        }
        for (int i = 1, len = grid.length; i < len; i++) {
            for (int j = 1, jlen = grid[i].length; j < jlen; j++) {
                minPathSum[i][j] = Math.min(minPathSum[i - 1][j], minPathSum[i][j - 1])
                        + grid[i][j];
            }
        }
        return minPathSum[grid.length - 1][grid[0].length - 1];
    }
}
