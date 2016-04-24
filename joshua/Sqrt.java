package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/24/16
 */
public class Sqrt {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        float r1 = 0;
        float r2 = 0;

        if (x == 0) {
            return 0;
        }
        else {
            r1 = (float) x / 2;
            r2 = (r1 + (float) x / r1) / 2;

            while (Math.abs(r2 - r1) > 0.01) {
                r1 = r2;
                r2 = (r1 + (float) x / r1) / 2;
            }
        }

        return (int) r2;
    }
}
