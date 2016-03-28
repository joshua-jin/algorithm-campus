public class LongestIncreasingContinuousSubsequence {
    public int longestIncreasingContinuousSubsequence(int[] A) {
        if (A == null || A.length == 0) return 0;

        int answer = 1;
        int streak = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1])
                streak++;
            else
                streak = 1;
            answer = Math.max(streak, answer);
        }

        streak = 1;
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > A[i + 1])
                streak++;
            else
                streak = 1;
            answer = Math.max(streak, answer);
        }

        return answer;
    }
}