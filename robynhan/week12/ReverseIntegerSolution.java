package org.robynhan.week12;

public class ReverseIntegerSolution {
    public int reverseInteger(int n) {
        // Write your code here
        int MAX = Integer.MAX_VALUE;
        int result = 0;
        if (n >= 0) {
            while (n != 0) {
                if (result > MAX / 10) {
                    return 0;
                }
                result = result * 10 + n % 10;
                n = n / 10;
            }
        } else {
            return -reverseInteger(-n);
        }

        return result;
    }
}
