package com.lintcode;

/**
 * @author : Joshua
 * Date:     1/25/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/a-b-problem/">A + B 问题</a>
 */
public class APlusB {
    public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
        int carry = a & b;
        int result = a ^ b;

        while (carry != 0) {
            int tmpCarry = carry << 1;
            carry = result & tmpCarry;
            result = result ^ tmpCarry;
        }

        return result;
    }
}
