package com.lintcode;

import java.util.Arrays;

/**
 * @author : Joshua
 * Date:     3/8/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/median/">中位数</a>
 */
public class Median {
    /**
     * @param nums: A list of integers.
     * @return: An integer denotes the middle number of the array.
     */
    public int median(int[] nums) {
        // write your code here
        Arrays.sort(nums);

        if (nums.length % 2 == 0) {
            return nums[nums.length / 2 - 1];
        }
        return nums[nums.length / 2];
    }
}
