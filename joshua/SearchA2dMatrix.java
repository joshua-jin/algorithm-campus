package com.lintcode;

import java.util.Arrays;

/**
 * @author : Joshua
 * Date:     4/23/16
 */
public class SearchA2dMatrix {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix.length == 0) {
            return false;
        }
        int row = findRowIndex(0, matrix.length - 1, matrix, target);

        if (row == -1) {
            return true;
        }

        return Arrays.binarySearch(matrix[row], target) >= 0;
    }

    private int findRowIndex(int begin, int end, int[][] matrix, int target) {
        if ((end - begin) <= 1) {
            if (target < matrix[end][0]) {
                return begin;
            } else {
                return end;
            }
        }

        int mid = (begin + end) / 2;

        if (matrix[mid][0] == target) {
            return -1;
        } else if (target > matrix[mid][0]) {
            return findRowIndex(mid, end, matrix, target);
        } else {
            return findRowIndex(begin, mid, matrix, target);
        }
    }
}
