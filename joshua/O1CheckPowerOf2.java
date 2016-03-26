package com.lintcode;

/**
 * @author : Joshua
 * Date:     3/25/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/o1-check-power-of-2/">O(1)时间检测2的幂次</a>
 */
public class O1CheckPowerOf2 {
    /*
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        // write your code here
        if (n == 0) {
            return false;
        }
        return ((((n -1) << 1) + 1) ^ n) == n - 1 ;
    }
}
