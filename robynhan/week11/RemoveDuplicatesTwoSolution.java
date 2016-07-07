package org.robynhan.week11;

public class RemoveDuplicatesTwoSolution {
    public int removeDuplicates(int[] nums) {
        // write your code here
        if (nums == null)
            return 0;
        int cur = 0;
        int i, j;
        for (i = 0; i < nums.length; ) {
            int now = nums[i];
            for (j = i; j < nums.length; j++) {
                if (nums[j] != now)
                    break;
                if (j - i < 2)
                    nums[cur++] = now;
            }
            i = j;
        }
        return cur;
    }
}
