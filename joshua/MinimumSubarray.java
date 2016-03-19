package com.lintcode;

import java.util.ArrayList;

/**
 * @author : Joshua
 * Date:     3/19/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/minimum-subarray/">最小子数组</a>
 */
public class MinimumSubarray {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
        // write your code
        int sum = nums.get(0);
        int currentSum = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            currentSum = Math.min(nums.get(i), currentSum + nums.get(i));
            sum = Math.min(sum, currentSum);
        }
        return sum;
    }
}
