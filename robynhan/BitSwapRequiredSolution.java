package org.robynhan.week5;

public class BitSwapRequiredSolution {
    public static int bitSwapRequired(int a, int b) {
        // write your code here
        int c = a ^ b;
        int count = 0;
        while (c != 0) {
            count += c & 1;
            c = c >>> 1;
        }
        return count;
    }
}
