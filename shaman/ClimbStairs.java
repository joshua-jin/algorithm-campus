public class ClimbStairs {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        for (int i = 1; i < n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
    /**
     * 1
     *
     * 11
     * 2
     *
     *
     *
     * 111
     * 12
     * 21
     *
     *
     * 1111
     * 112
     * 121
     * 211
     * 22
     *
     *
     * 11111
     * 1112
     * 1121
     * 1211
     * 2111
     * 221
     * 212
     * 122
     *
     */
}