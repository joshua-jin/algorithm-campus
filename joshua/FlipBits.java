package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/20/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/flip-bits/">将整数A转换为B</a>
 */
public class FlipBits {
    /**
     *@param a, b: Two integer
     *return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        // write your code here
        return countOnes(a ^ b);

    }

    private static int countOnes(int num) {
        String binaryStr = Integer.toBinaryString(num);
        binaryStr = binaryStr.replaceAll("0", "");
        return binaryStr.length();
    }
}
