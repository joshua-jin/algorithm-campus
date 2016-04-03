package algorithm.lintcode.easy;

public class ReverseInteger {
    public int reverseInteger(int n) {
        return reverseInteger(n, 0);
    }

    private int reverseInteger(int n, int reverse) {
        if (n == 0) {
            return reverse;
        }
        if (reverse > Integer.MAX_VALUE / 10) {
            return 0;
        }
        return reverseInteger(n / 10, reverse * 10 + (n % 10));
    }
}
