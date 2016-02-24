/**
 * @author      Yanhui Shen
 * @version     1.0
 * @since       2016-02-11 
 */

class Solution {
public:
    /**
     * @param n: An integer
     * @return: An integer
     */
    int climbStairs(int n) {
        vector<int> cache(n+1, 0);
        const std::function<int (int)> climb = [&climb, &cache](int n) -> int {
            if (n < 2) return 1;
            if (cache[n] > 0) return cache[n];
            auto n1 = climb(n-1);
            cache[n-1] = n1;
            auto n2 = climb(n-2);
            cache[n-2] = n2;
            return n2 + n1;
        };
        return climb(n);
    }
};
