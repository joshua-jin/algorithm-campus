package com.lintcode;

/**
 * @author : Joshua
 * Date:     3/26/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/permutation-index/">排列序号</a>
 */
public class PermutationIndex {
    /**
     * @param A an integer array
     * @return a long integer
     */
    public long permutationIndex(int[] A) {
        // Write your code here
        long index = 0;
        long position = 2;// position 1 is paired with factor 0 and so is skipped
        long factor = 1;
        for (int p = A.length - 2; p >= 0; p--) {
            long successors = 0;
            for (int q = p + 1; q < A.length; q++) {
                if (A[p] > A[q]) {
                    successors++;
                }
            }
            index += (successors * factor);
            factor *= position;
            position++;
        }
        index = index + 1;
        return index;
    }
}
