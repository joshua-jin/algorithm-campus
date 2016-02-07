package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/3/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/climbing-stairs/">爬楼梯</a>
 */
public class ClimbingStairs {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        int[] d = new int[n + 1];
        d[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (j + 1 == i || j + 2 == i) {
                    count += d[j];
                }
            }
            d[i] = count;
        }
        return d[n];
    }
}
