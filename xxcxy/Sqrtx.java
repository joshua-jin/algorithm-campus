package algorithm.lintcode.easy;

public class Sqrtx {
    public int sqrt(int x) {
        if (x == 0) {
            return 0;
        }
        for (long i = 0; i < x; i++) {
            if ((i + 1) * (i + 1) > x) {
                return (int) i;
            }
        }
        return 1;
    }
}
