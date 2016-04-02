package com.lintcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Joshua
 * Date:     4/2/16
 */
public class RecoverRotatedSortedArray {
    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code
        int firstBorder = getBorder(nums);
        if (firstBorder == 0) {
            return;
        }

        int secondBorder = nums.size() - firstBorder;

        Integer tmp = null;

        int beginIndex = 0;
        int count = 0;
        int originalIndex = 0;

        while (count < nums.size() && beginIndex < nums.size()) {
            Map<String, Integer> swapResult = swapInteger(beginIndex, nums, firstBorder, secondBorder, tmp);
            if (swapResult.get("swap").equals(1)) {
                tmp = swapResult.get("tmp");
                beginIndex = swapResult.get("index");
                count += 1;
            } else {
                originalIndex += 1;
                tmp = null;
                beginIndex = originalIndex;
            }
        }
    }

    private int getBorder(ArrayList<Integer> nums) {
        Integer first = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < first) {
                return i;
            }
        }
        return 0;
    }

    private Map<String, Integer> swapInteger(int i, ArrayList<Integer> nums,
                                             int firstBorder, int secondBorder,
                                             Integer tmpValue) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        Integer v = tmpValue == null ? nums.get(i) : tmpValue;
        int newIndex;
        if (i < firstBorder) {
            newIndex = secondBorder + i;
        } else {
            newIndex = i - firstBorder;
        }
        Integer target = nums.get(newIndex);
        if (!v.equals(target)) {
            result.put("tmp", nums.get(newIndex));
            result.put("index", newIndex);
            result.put("swap", 1);
            nums.set(newIndex, v);
        } else {
            result.put("swap", 0);
        }

        return result;
    }
}
