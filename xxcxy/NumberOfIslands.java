package algorithm.lintcode.easy;

import java.util.HashSet;
import java.util.Set;

public class NumberOfIslands {
    public int numIslands(boolean[][] grid) {
        int islands = 0;
        Set<Integer> relate = new HashSet<>();
        int[][] gridValue = new int[grid.length][];
        for (int i = 0, len = grid.length; i < len; i++) {
            gridValue[i] = new int[grid[i].length];
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]) {
                    if ((i == 0 || !grid[i - 1][j]) && (j == 0 || !grid[i][j - 1])) {
                        islands++;
                        gridValue[i][j] = islands;
                    } else if (i == 0 || !grid[i - 1][j]) {
                        gridValue[i][j] = gridValue[i][j - 1];
                    } else if (j == 0 || !grid[i][j - 1]) {
                        gridValue[i][j] = gridValue[i - 1][j];
                    } else {
                        if (gridValue[i - 1][j] > gridValue[i][j - 1]) {
                            relate.add(gridValue[i - 1][j]);
                        } else if (gridValue[i - 1][j] < gridValue[i][j - 1]) {
                            relate.add(gridValue[i][j - 1]);
                        }
                        gridValue[i][j] = gridValue[i - 1][j];
                    }
                }
            }
        }
        return islands - relate.size();
    }
}
