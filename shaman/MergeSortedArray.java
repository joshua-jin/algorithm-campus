public class MergeSortedArray {
    public int[] mergeSortedArray(int[] A, int[] B) {
        int[] result = new int[A.length + B.length - 1];
        for (int i = 0; i < A.length; i++) {
            result[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            result[i + A.length - 1] = B[i];
        }

        Arrays.sort(result);
        return result;
    }
}