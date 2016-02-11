package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/11/16
 */
public class BinarySearch {
    public int binarySearch(int[] nums, int target) {
        //write your code here
        return find(nums, 0, nums.length - 1, target);
    }

    private int find(int[] nums, int begin, int end, int target) {
        int mid;
        if (begin + 1 == end || begin == end) {
            if (nums[begin] == target) {
                return begin;
            }
            if (nums[end] == target) {
                return end;
            }
            return -1;
        }
        else {
            mid = (begin + end) / 2;
        }

        if (nums[mid] == target) {
            while (nums[mid] == target && mid >= 0) {
                mid--;
            }
            return mid + 1;
        }
        if(nums[mid] > target) {
            return find(nums, begin, mid -1, target);
        }
        else {
            return find(nums, mid + 1, end, target);
        }
    }
}
