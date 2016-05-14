package algorithm.lintcode.easy;

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }

        int[] is = new int[obstacleGrid[0].length];
        is[0] = 1;
        for (int i = 0, len = obstacleGrid.length; i < len; i++) {
            for (int j = 0, length = is.length; j < length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    is[j] = 0;
                } else if (j > 0) {
                    is[j] += is[j - 1];
                }
            }
        }
        return is[is.length - 1];
    }
}
