package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/2/16
 */
public class RemoveDuplicatesFromSortedArray2 {
    /**
     * @param nums: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if (nums.length == 0) {
            return 0;
        }
        int previous = nums[0];
        int dupCount = 0;
        int fitIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == previous) {
                if (dupCount < 1) {
                    fitIndex += 1;
                    nums[fitIndex] = nums[i];
                    dupCount += 1;
                }
            } else {
                fitIndex += 1;
                nums[fitIndex] = nums[i];
                previous = nums[i];
                dupCount = 0;
            }
        }
        return fitIndex + 1;
    }
}
