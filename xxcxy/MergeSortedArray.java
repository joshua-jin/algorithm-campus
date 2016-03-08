package algorithm.lintcode.easy;

public class MergeSortedArray {
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        int aIndex = 0;
        int bIndex = 0;
        while ((n - bIndex) > 0) {
            if (A[aIndex] > B[bIndex] || A[aIndex] == 0) {
                moveAfter(A, aIndex, m + bIndex);
                A[aIndex] = B[bIndex++];
            }
            aIndex++;
        }
    }

    private void moveAfter(int[] a, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            a[i + 1] = a[i];
        }
    }
}
