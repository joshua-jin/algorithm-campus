package org.robynhan.week9;

import java.util.ArrayList;

public class MinSubArraySolution {
    public int minSubArray(ArrayList<Integer> nums) {
        if (nums == null)
            return 0;
        int len = nums.size();
        int[] localmin = new int[len];
        int[] globalmin = new int[len];
        for (int i = 0; i < len; i++) {
            if (i == 0)
                globalmin[i] = localmin[i] = nums.get(i);
            else {
                localmin[i] = Math.min(localmin[i - 1] + nums.get(i), nums.get(i));
                globalmin[i] = Math.min(globalmin[i - 1], localmin[i]);
            }

        }
        return globalmin[len - 1];
    }
}
