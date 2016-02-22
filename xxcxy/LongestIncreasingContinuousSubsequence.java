package algorithm.lintcode.easy;

public class LongestIncreasingContinuousSubsequence {
    public int longestIncreasingContinuousSubsequence(int[] A) {
        if (A.length < 2) {
            return A.length;
        }
        int longest = 1;
        int currentCount = 1;
        boolean plus = A[1] > A[0];
        for (int i = 1, len = A.length; i < len; i++) {
            if (plus ^ (A[i] > A[i - 1])) {
                longest = currentCount > longest ? currentCount : longest;
                currentCount = 1;
            }
            currentCount++;
            plus = A[i] > A[i - 1];
        }
        return longest > currentCount ? longest : currentCount;
    }
}
