package algorithm.lintcode.easy;

public class ABProblem {
    public int aplusb(int a, int b) {
        return b == 0 ? a : aplusb(a ^ b, (a & b) << 1);
    }

}
