class Solution {
public:
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    int reverseInteger(int n) {
        int out = 0;
        while (n) {
            if (out > INT_MAX / 10 || out < -INT_MAX / 10) return 0;
            out = out * 10 + (n%10);
            n = n / 10;
        }
        return out;
    }
};
