package org.robynhan.week4;

public class CosineSimilaritySolution {
    public double cosineSimilarity(int[] A, int[] B) {
        double result = 0.0;

        //运算因子
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        if (A == null || B == null) {
            return 0.0;
        }

        if (A.length != B.length) {
            return 0.0;
        }

        if (A.length == 0 || (A.length == 1 && A[0] == 0 && B[0] == 0)) {
            return 2.0;
        }

        for (int i = 0; i < A.length; i++) {
            a += A[i] * B[i];
            b += Math.pow(A[i], 2);//等同于b+=A[i]*A[i];
            c += Math.pow(B[i], 2);//等同于c+=B[i]*B[i];
        }

        if (b == 0 || c == 0) {
            return 2.0;
        }

        result = a / (Math.sqrt(b) * Math.sqrt(c));

        return result;
    }
}
