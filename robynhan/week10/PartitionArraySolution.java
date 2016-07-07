package org.robynhan.week10;

public class PartitionArraySolution {
    public void partitionArray(int[] nums) {
        // write your code here;
        int start = 0, end = nums.length - 1;

        while (start < end) {
            while (start < end && nums[start] % 2 == 1) {
                start++;
            }
            while (start < end && nums[end] % 2 == 0) {
                end--;
            }

            if (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }
}
