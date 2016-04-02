package com.lintcode;

import java.util.ArrayList;

/**
 * @author : Joshua
 * Date:     4/2/16
 */
public class ProductOfArrayExcludeItself {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        ArrayList<Long> result = new ArrayList<Long>();

        for (int i = 0; i < A.size(); i++) {
            result.add(i, getProduct(i, A));
        }

        return result;
    }

    private Long getProduct(int i, ArrayList<Integer> l) {
        Long product = 1L;

        for (int j = 0; j < l.size(); j++) {
            if (i != j) {
                product *= l.get(j);
            }
        }

        return product;
    }
}
