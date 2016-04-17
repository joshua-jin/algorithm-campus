package algorithm.lintcode.easy;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        return searchMatrix(matrix, 0, matrix.length, target);
    }

    private boolean searchMatrix(final int[][] matrix, final int startIndex, final int endIndex, final int target) {
        if (matrix[startIndex][0] > target) {
            return false;
        }
        if (endIndex - startIndex == 1) {
            return searchArray(matrix[startIndex], 0, matrix[startIndex].length - 1, target);
        }
        int m = (startIndex + endIndex) / 2;
        if (matrix[m][0] > target) {
            return searchMatrix(matrix, startIndex, m, target);
        }
        return searchMatrix(matrix, m, endIndex, target);
    }

    private boolean searchArray(final int[] values, final int startIndex, final int endIndex, final int target) {
        if (values[startIndex] == target || values[endIndex] == target) {
            return true;
        }
        if (values[startIndex] > target || values[endIndex] < target) {
            return false;
        }
        int m = (startIndex + endIndex) / 2;
        if (values[m] == target) {
            return true;
        } else if (values[m] > target) {
            return searchArray(values, startIndex + 1, m - 1, target);
        } else {
            return searchArray(values, m + 1, endIndex - 1, target);
        }
    }
}
