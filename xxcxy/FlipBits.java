package algorithm.lintcode.easy;

public class FlipBits {
    public static int bitSwapRequired(int a, int b) {
        int orVal = a ^ b;
        int count = 0;
        while (orVal != 0) {
            if ((orVal & 1) == 1) {
                count++;
            }
            orVal >>>= 1;
        }
        return count;
    }
}
