package com.lintcode;

/**
 * @author : Joshua
 * Date:     3/9/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/merge-sorted-array-ii/">合并排序数组</a>
 */
public class MergeSortedArray {
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // Write your code here
        int i = 0;
        int a = 0;
        int b = 0;
        int totalSize = A.length + B.length;
        int[] result = new int[totalSize];

        while (i < totalSize) {
            if (a == A.length) {
                result[i] = B[b];
                b += 1;
                i += 1;
                continue;
            }
            if (b == B.length) {
                result[i] = A[a];
                a += 1;
                i += 1;
                continue;
            }
            if (A[a] <= B[b]) {
                result[i] = A[a];
                a += 1;
                i += 1;
                continue;
            }
            if (A[a] > B[b]) {
                result[i] = B[b];
                b += 1;
                i += 1;
                continue;
            }
        }
        return result;
    }
}
