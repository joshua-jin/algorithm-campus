package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/23/16
 */
public class SingleNumber {
    /**
     *@param A : an integer array
     *return : a integer
     */
    public int singleNumber(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int n = A[0];
        for(int i = 1; i < A.length; i++) {
            n = n ^ A[i];
        }

        return n;
    }
}
