package com.lintcode;

/**
 * @author : Joshua
 * Date:     3/19/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/number-of-islands/">岛屿的个数</a>
 */
public class NumberOfIslands {
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    public int numIslands(boolean[][] grid) {
        // Write your code here
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]) {
                    grid[i][j] = false;
                    count += 1;
                    if (i > 0 && grid[i - 1][j]) {
                        fillIsland(grid, i -1, j);
                    }
                    if (i < grid.length -1 && grid[i + 1][j]) {
                        fillIsland(grid, i + 1, j);
                    }
                    if (j > 0 && grid[i][j -1]) {
                        fillIsland(grid, i, j - 1);
                    }
                    if (j < grid[0].length -1 && grid[i][j + 1]) {
                        fillIsland(grid, i , j + 1);
                    }
                }
            }
        }
        return count;
    }

    private void fillIsland(boolean[][] grid, int i, int j) {
        grid[i][j] = false;
        if (i > 0 && grid[i - 1][j]) {
            fillIsland(grid, i -1, j);
        }
        if (i < grid.length -1 && grid[i + 1][j]) {
            fillIsland(grid, i + 1, j);
        }
        if (j > 0 && grid[i][j -1]) {
            fillIsland(grid, i, j - 1);
        }
        if (j < grid[0].length -1 && grid[i][j + 1]) {
            fillIsland(grid, i , j + 1);
        }
        return;
    }
}
