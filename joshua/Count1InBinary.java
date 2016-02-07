package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/5/16
 */
public class Count1InBinary {
    public int countOnes(int num) {
        // write your code here
        int count = 0;

        while (num > 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }
}
