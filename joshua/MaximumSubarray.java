package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/29/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/maximum-subarray/">最大子数组</a>
 */
public class MaximumSubarray {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code
        int max = nums[0];
        int tmp = max;
        for (int i = 1; i < nums.length; i++) {
            tmp = Math.max(tmp + nums[i], nums[i]);
            max = Math.max(max, tmp);
        }
        return max;
    }
}
