package com.lintcode;

/**
 * @author : Joshua
 * Date:     1/25/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/add-binary/">二进制求和</a>
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        // Write your code here
        int result = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(result);
    }
}
