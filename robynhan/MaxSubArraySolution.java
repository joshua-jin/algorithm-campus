package org.robynhan.week7;

public class MaxSubArraySolution {
    public int maxSubArray(int[] nums) {
        // write your code
        if (nums == null || nums.length == 0){
            return 0;
        }

        int max = Integer.MIN_VALUE, sum = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
        }

        return max;
    }
}
