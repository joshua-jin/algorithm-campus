package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/2/16
 */
public class RemoveDuplicatesFromSortedArray {
    /**
     * @param nums: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if (nums.length == 0) {
            return 0;
        }
        int fitIndex = 0;
        int previous = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != previous) {
                fitIndex += 1;
                nums[fitIndex] = nums[i];
                previous = nums[i];
            }
        }

        return fitIndex + 1;
    }
}
