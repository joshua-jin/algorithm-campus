package com.lintcode;

/**
 * @author : Joshua
 * Date:     3/5/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/matrix-zigzag-traversal/">矩阵的之字型遍历</a>
 */
public class MatrixZigzagTraversal {
    /**
     * @param matrix: a matrix of integers
     * @return: an array of integers
     */
    public int[] printZMatrix(int[][] matrix) {
        // write your code here

        int resultSize = matrix.length * matrix[0].length;
        int[] result = new int[resultSize];

        int i = 0;
        int j = 0;
        while (i < resultSize) {
            if (j % 2 == 0) {
                int x = j;
                int y = 0;
                while (x >= 0) {
                    if (x < matrix.length && y < matrix[0].length) {
                        result[i] = matrix[x][y];
                        i++;
                    }
                    x -= 1;
                    y += 1;
                }
            }
            else {
                int x = 0;
                int y = j;
                while (y >= 0) {
                    if (x < matrix.length && y < matrix[0].length) {
                        result[i] = matrix[x][y];
                        i++;
                    }
                    x += 1;
                    y -= 1;
                }
            }
            j++;
        }
        return result;
    }
}
