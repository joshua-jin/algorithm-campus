package algorithm.lintcode.easy;

import java.util.ArrayList;

public class MinimumSubarray {
    public int minSubArray(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;
        int prev = 0;
        for (Integer num : nums) {
            current = Math.min(prev + num, num);
            min = Math.min(min, current);
            prev = Math.min(0, current);
        }
        return min;
    }
}
