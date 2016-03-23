class Solution {
public:
    /**
     * @param n non-negative integer, n posts
     * @param k non-negative integer, k colors
     * @return an integer, the total number of ways
     */
    int numWays(int n, int k) {
        int oneColor = k;
        int twoColor = 0;
        for (int i = 2; i <= n; i++) {
            int newOneColor = (oneColor + twoColor) * (k-1);
            twoColor = oneColor;
            oneColor = newOneColor;
        }
        return oneColor + twoColor;
    }
};
