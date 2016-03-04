package org.robynhan.week7;

public class PrintZMatrixSolution {
    public int[] printZMatrix(int[][] matrix) {
        // write your code here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return null;
        int count = matrix.length * matrix[0].length;
        int[] result = new int[count];
        int row = 0, col = 0;
        result[0] = matrix[0][0];
        for (int i = 1; i < count; ) {
            //斜上走到顶
            while (i < count && row - 1 >= 0 && col + 1 < matrix[0].length) {
                result[i++] = matrix[--row][++col];
            }
            //横右走一步，不可横右走时竖下走一步
            if (i < count && col + 1 < matrix[0].length) {
                result[i++] = matrix[row][++col];
            } else if (i < count && row + 1 < matrix.length) {
                result[i++] = matrix[++row][col];
            }
            //斜下走到底
            while (i < count && row + 1 < matrix.length && col - 1 >= 0) {
                result[i++] = matrix[++row][--col];
            }
            //竖下走一步，不可竖下走时横右走一步
            if (i < count && row + 1 < matrix.length) {
                result[i++] = matrix[++row][col];
            } else if (i < count && col + 1 < matrix[0].length) {
                result[i++] = matrix[row][++col];
            }
        }
        return result;
    }
}
