package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/29/16
 */
public class TrailingZeros {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
        long count = 0;
        for(int i = 1; Math.pow(5,i) <= n; i++) {
            count += n / (long)Math.pow(5,i);
        }
        return count;
    }
}
