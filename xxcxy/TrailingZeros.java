package algorithm.lintcode.easy;

public class TrailingZeros {
    public long trailingZeros(long n) {
        long result = 0;
        while ((n /= 5) > 0) {
            result += n;
        }
        return result;
    }
}
