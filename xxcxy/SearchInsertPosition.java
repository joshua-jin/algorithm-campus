package algorithm.lintcode.easy;

public class SearchInsertPosition {
    public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0) {
            return 0;
        }
        return searchInsert(A, 0, A.length - 1, target);
    }

    private int searchInsert(int[] A, int start, int end, int target) {
        if (A[start] >= target) {
            return start;
        }
        if (A[end] < target) {
            return end + 1;
        }
        int mid = start + (end - start) / 2;
        if (A[mid] > target) {
            return searchInsert(A, start, mid, target);
        } else if (A[mid] < target) {
            return searchInsert(A, mid + 1, end, target);
        }
        return mid;
    }
}
