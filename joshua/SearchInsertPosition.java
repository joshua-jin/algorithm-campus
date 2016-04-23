package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/22/16
 */
public class SearchInsertPosition {
    /**
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if (A.length == 0) {
            return 0;
        }
        return findPosition(0, A.length - 1, A, target);
    }

    private int findPosition(int begin, int end, int[] A, int target) {

        if ((end - begin) == 1) {
            if (target <= A[begin]) {
                return begin;
            } else if (target > A[end]) {
                return end + 1;
            } else {
                return end;
            }
        }

        int mid = (begin + end) / 2;

        if (A[mid] == target) {
            return mid;
        } else if (target > A[mid]) {
            return findPosition(mid, end, A, target);
        } else {
            return findPosition(begin, mid, A, target);
        }
    }
}
