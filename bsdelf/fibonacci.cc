/**
 * @author      Yanhui Shen
 * @version     1.0
 * @since       2016-02-11 
 */

class Solution{
public:
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    int fibonacci(int n) {
        int n_i_1 = 0;
        int n_i_2 = 1;
        for (int i = 3; i < n; ++i) {
            const int n_i = n_i_1 + n_i_2;
            n_i_1 = n_i_2;
            n_i_2 = n_i;
        }
        return n_i_1 + n_i_2;
    }
};