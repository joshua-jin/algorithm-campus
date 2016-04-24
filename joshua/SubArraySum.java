package com.lintcode;

import java.util.ArrayList;

/**
 * @author : Joshua
 * Date:     4/24/16
 */
public class SubArraySum {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (nums.length == 0) {
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            int end = getZeroSumIndex(nums, i, nums[i]);
            if (end != -1) {
                result.add(0, i);
                result.add(1, end);
                return result;
            }
        }

        return result;
    }

    private int getZeroSumIndex(int[] nums, int begin, int sum) {
        if (sum == 0) {
            return begin;
        }

        for (int i = begin + 1; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0) {
                return i;
            }
        }

        return -1;
    }
}
