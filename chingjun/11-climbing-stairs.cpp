class Solution {
public:
    /**
     * @param n: An integer
     * @return: An integer
     */
    // it's fibonacci
    int climbStairs(int n) {
        int prev1 = 1;
        int prev2 = 1;
        for (int i = 1; i < n; i++) {
            int temp = prev1 + prev2;
            prev2 = prev1;
            prev1 = temp;
        }
        return prev1;
    }
};
