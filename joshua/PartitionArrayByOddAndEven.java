package com.lintcode;

/**
 * @author : Joshua
 * Date:     3/25/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/partition-array-by-odd-and-even/">奇偶分割数组</a>
 */
public class PartitionArrayByOddAndEven {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here;
        if (nums.length == 0) {
            return;
        }
        int even = 0;
        int loop = 0;
        while (loop < nums.length) {
            if (!isEven(nums[loop])) {
                even = findEven(even, nums);
                if (even != -1 && even < loop) {
                    int tmp = nums[loop];
                    nums[loop] = nums[even];
                    nums[even] = tmp;
                }
            }
            loop += 1;
        }
    }

    private Boolean isEven(int n) {
        return n % 2 == 0;
    }

    private int findEven(int begin, int[] nums) {
        for (int i = begin; i < nums.length; i++) {
            if (isEven(nums[i])) {
                return i;
            }
        }
        return -1;
    }
}
