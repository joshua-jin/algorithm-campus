package org.robynhan.week8;

public class MergeSortedArraySolutionTwo {
    public int[] mergeSortedArray(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int i = m - 1, j = n - 1, index = m + n - 1;
        int[] C = new int[index + 1];
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                C[index--] = A[i--];
            } else {
                C[index--] = B[j--];
            }
        }
        while (i >= 0) {
            C[index--] = A[i--];
        }
        while (j >= 0) {
            C[index--] = B[j--];
        }
        return C;
    }
}
