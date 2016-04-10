package algorithm.lintcode.easy;

public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        int length = A.length;
        int i = 0;
        while (i < length) {
            if (A[i] == elem) {
                A[i] = A[length - 1];
                length--;
            } else {
                i++;
            }
        }
        return length;
    }
}
