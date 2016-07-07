package org.robynhan.week11;

public class PlusOneSolution {
    public int[] plusOne(int[] digits) {
        // Write your code here
        int carries = 1;
        for (int i = digits.length - 1; i >= 0 && carries > 0; i--) {  // fast break when carries equals zero
            int sum = digits[i] + carries;
            digits[i] = sum % 10;
            carries = sum / 10;
        }
        if (carries == 0)
            return digits;

        int[] rst = new int[digits.length + 1];
        rst[0] = 1;
        System.arraycopy(digits, 0, rst, 1, rst.length - 1);
        return rst;
    }
}
