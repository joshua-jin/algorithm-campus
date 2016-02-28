package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/28/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/longest-increasing-continuous-subsequence/">最长上升连续子序列</a>
 */
public class LongIncreaseContinuousSubSequence {
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // Write your code here
        if (A == null) {
            return 0;
        }

        if (A.length <= 2) {
            return A.length;
        }

        Boolean isAscend = Boolean.TRUE;
        if (A[1] < A[0]) {
            isAscend = Boolean.FALSE;
        }

        int max = 0;
        int count = 1;
        int lastNum = A[0];

        for (int i = 1; i < A.length; i++) {
            if (isIncreasing(lastNum, A[i], isAscend)) {
                count += 1;
            } else {
                max = Math.max(max, count);
                count = 2;
                isAscend = !isAscend;
            }
            lastNum = A[i];
        }

        return Math.max(max, count);
    }

    private Boolean isIncreasing(int lastNum, int currentNum, Boolean isAscend) {
        if ((isAscend && currentNum >= lastNum) || (!isAscend && currentNum <= lastNum)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
