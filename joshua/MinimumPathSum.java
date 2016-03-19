package com.lintcode;

/**
 * @author : Joshua
 * Date:     3/19/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/minimum-path-sum/">最小路径和</a>
 */
public class MinimumPathSum {
    /**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        int m = grid.length;
        int n = grid[0].length;

        if (m == 0 || n == 0) {
            return 0;
        }

        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        for (int i = 1; i < n; i++) {
            grid[0][i] += grid[0][i - 1];
        }

        for(int i=1; i< m ; i++){
            for(int j = 1;j< n; j++){
                grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }
}
