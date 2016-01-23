package com.lintcode;

/**
 * @author : Joshua
 * Date:     1/23/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/fibonacci/">Fibonacci</a>
 *
 */
public class Fibonacci {
    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        }

        return fibHelper(0, 1, n);
    }

    private int fibHelper(int i, int j, int n) {
        if ( n == 2) {
            return i;
        }
        return fibHelper(j, i + j, n - 1);
    }
}
