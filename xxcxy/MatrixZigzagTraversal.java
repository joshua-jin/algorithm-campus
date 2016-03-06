package algorithm.lintcode.easy;

public class MatrixZigzagTraversal {
    public int[] printZMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int imax = matrix.length, jmax = matrix[0].length;
        int index = 1, i = 0, j = 0;
        int[] result = new int[imax * jmax];
        result[0] = matrix[0][0];
        while (index < (imax * jmax)) {
            while (i > 0 && j < jmax - 1) {
                result[index++] = matrix[--i][++j];
            }
            if (j < jmax - 1) {
                result[index++] = matrix[i][++j];
            } else if (i < imax - 1) {
                result[index++] = matrix[++i][j];
            }
            while (i < imax - 1 && j > 0) {
                result[index++] = matrix[++i][--j];
            }
            if (i < imax - 1) {
                result[index++] = matrix[++i][j];
            } else if (j < jmax - 1) {
                result[index++] = matrix[i][++j];
            }
        }
        return result;
    }
}
