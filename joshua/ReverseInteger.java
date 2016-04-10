package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/8/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/reverse-integer/">反转整数</a>
 */
public class ReverseInteger {
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public int reverseInteger(int n) {
        // Write your code here
        long m = 0;

        while (Math.abs(n) > 0) {
            m *= 10;
            m += n % 10;
            n = n / 10;
        }

        if (m > Integer.MAX_VALUE) {
            return 0;
        }

        if (n >= 0) {
            return Integer.valueOf(String.valueOf(m));
        }
        return -1 * Integer.valueOf(String.valueOf(m));
    }
}
