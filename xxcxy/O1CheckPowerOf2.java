package algorithm.lintcode.easy;

public class O1CheckPowerOf2 {
    public boolean checkPowerOf2(int n) {
        if (n == 0 || n == Integer.MIN_VALUE) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
