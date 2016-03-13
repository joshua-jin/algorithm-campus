package com.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Joshua
 * Date:     3/9/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/merge-sorted-array/">合并排序数组 II</a>
 */
public class MergeSortedArray2 {
    /**
     * @param A: sorted integer array A which has m elements,
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        if (n == 0) {
            return;
        }
        List<Integer> tmpList = new ArrayList<Integer>();
        int totalSize = m + n;
        int bSize = 0;

        for (int i = 0; i < totalSize; i++) {
            if (i < m && bSize < n) {
                if (tmpList.isEmpty()) {
                    if (A[i] >= B[bSize]) {
                        tmpList.add(A[i]);
                        A[i] = B[bSize];
                        bSize += 1;
                    }
                } else {
                    if (tmpList.get(0) <= B[bSize]) {
                        tmpList.add(A[i]);
                        A[i] = tmpList.remove(0);
                    } else {
                        tmpList.add(A[i]);
                        A[i] = B[bSize];
                        bSize += 1;
                    }
                }
            }
            else if (i >= m && bSize < n) {
                if (tmpList.isEmpty()) {
                    A[i] = B[bSize];
                    bSize += 1;
                } else {
                    if (tmpList.get(0) <= B[bSize]) {
                        A[i] = tmpList.remove(0);
                    } else {
                        A[i] = B[bSize];
                        bSize += 1;
                    }
                }
            }
            else if (i <= m && bSize >= n) {
                tmpList.add(A[i]);
                A[i] = tmpList.remove(0);
            } else {
                if (!tmpList.isEmpty()) {
                    A[i] = tmpList.remove(0);
                }
            }
        }
    }
}
