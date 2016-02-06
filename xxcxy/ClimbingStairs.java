package algorithm.lintcode.easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 0) {
            return 1;
        }
        if(n < 3) {
            return n;
        }
        return  fb(1,2,n-3);
    }

    public int fb(int lastLast, int last, int n) {
        if(n == 0) {
            return lastLast + last;
        }
        return fb(last, lastLast + last, n -1);
    }
}
