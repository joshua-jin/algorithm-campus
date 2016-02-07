package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/5/16
 */
public class CosineSimilarity {
    public double cosineSimilarity(int[] A, int[] B) {
        // write your code here
        if (A.length == B.length && A.length == 0) {
            return 2.0;
        }
        if (isAllZero(A) && isAllZero(B)) {
            return 2.0;
        }

        double dividendA = getDividend(A);
        double dividendB = getDividend(B);
        if (dividendA == 0 || dividendB == 0) {
            return 0;
        }
        return getDivisor(A, B) / (dividendA * dividendB);
    }

    private double getDivisor(int[] A, int[] B) {
        double sum = 0.0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B[i];
        }
        return sum;
    }

    private double getDividend(int[] A) {
        double sum = 0.0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * A[i];
        }
        return Math.sqrt(sum);
    }

    private Boolean isAllZero(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
