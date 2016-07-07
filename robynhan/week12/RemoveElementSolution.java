package org.robynhan.week12;

public class RemoveElementSolution {
    public int removeElement(int[] A, int elem) {
        // write your code here
        int count = A.length;
        int i = 0;
        while (i < count) {
            if (A[i] == elem) {
                System.arraycopy(A, i + 1, A, i, count - 1 - i);
                count--;
            } else {
                i++;
            }
        }

        return count;
    }


}
