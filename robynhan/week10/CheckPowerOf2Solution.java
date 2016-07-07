package org.robynhan.week10;

public class CheckPowerOf2Solution {
    public boolean checkPowerOf2(int n) {
        // write your code here
        return n > 0 && (n & (n - 1)) == 0;
    }
}
