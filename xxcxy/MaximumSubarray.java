package algorithm.lintcode.easy;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(sum, max);
            sum = Math.max(sum, 0);
        }
        return max;
    }
}
