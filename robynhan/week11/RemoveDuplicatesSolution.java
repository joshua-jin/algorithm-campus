package org.robynhan.week11;

public class RemoveDuplicatesSolution {
    public int removeDuplicates(int[] nums) {
        // write your code here
        int res = 0;
        if(nums.length == 0)
            return res;
        for(int i = 1 ; i < nums.length; i++) {
            if(nums[res] != nums[i]){
                nums[++res] = nums[i];
            }
        }
        return res+1;
    }
}
