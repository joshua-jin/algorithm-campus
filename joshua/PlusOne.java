package com.lintcode;

import java.util.Arrays;

/**
 * @author: Joshua
 * Date:     4/2/16
 */
public class PlusOne {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        // Write your code here
        if (digits.length == 0) {
            return digits;
        }
        int[] result = new int[digits.length + 1];

        int carry = 1;

        for (int i = digits.length - 1; i >= 0 ; i--) {
            int sum = digits[i] + carry;
            if (sum >= 10) {
                result[i + 1] = sum - 10;
                carry = 1;
            } else {
                result[i + 1] = sum;
                carry = 0;
            }
        }

        if (carry == 1) {
            result[0] = 1;
            return result;
        }

        return Arrays.copyOfRange(result, 1, result.length);
    }
}
