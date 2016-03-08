package algorithm.lintcode.easy;

public class MergeSortedArrayII {
    public int[] mergeSortedArray(int[] A, int[] B) {
        int[] result = new int[A.length + B.length];
        int indexA = 0;
        int indexB = 0;
        for (int i = 0, len = result.length; i < len; i++) {
            if (indexA >= A.length ||
                    (indexB < B.length && A[indexA] > B[indexB])) {
                result[i] = B[indexB++];
            } else {
                result[i] = A[indexA++];
            }
        }
        return result;
    }
}
