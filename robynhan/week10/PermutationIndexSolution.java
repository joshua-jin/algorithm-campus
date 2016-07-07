package org.robynhan.week10;

public class PermutationIndexSolution {
    public long permutationIndex(int[] A) {
        // Write your code here
        long index = 0;

        int p;
        for (int i = 0; i < A.length; i++) {
            long count = 0;
            long factor = 1;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[i]) {
                    count++;
                }
            }

            if (count > 0) {
                p = A.length - i - 1;
                for (int q = 1; q <= p; q++) {
                    factor = factor * q;
                }
            }
            index = index + (count * factor);
        }
        index = index + 1;
        return index;
    }
}
