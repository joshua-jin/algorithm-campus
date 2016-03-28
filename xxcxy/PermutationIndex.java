package algorithm.lintcode.easy;

public class PermutationIndex {
    public long permutationIndex(int[] A) {
        return permutationIndex(A, 0);
    }

    private long permutationIndex(int[] a, int index) {
        int remain = a.length - index - 1;
        if (remain == 0) {
            return 1;
        }
        return getSmallCount(a, index) * factorial(remain) + permutationIndex(a, index + 1);
    }

    private int getSmallCount(int[] a, int index) {
        int smallCount = 0;
        for (int i = index + 1; i < a.length; i++) {
            if (a[i] < a[index]) {
                smallCount++;
            }
        }
        return smallCount;
    }

    private long factorial(int f) {
        long r = 1;
        for (int i = 1; i <= f; i++) {
            r *= i;
        }
        return r;
    }
}
