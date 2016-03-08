package com.lintcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Joshua
 * Date:     2/29/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/majority-number/">主元素</a>
 */
public class MajorityNumber {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        int half = nums.size() / 2;
        Map<Integer, Integer> numsCount = new HashMap<Integer, Integer>();

        for (Integer num : nums) {
            if (numsCount.containsKey(num)) {
                int count = numsCount.get(num);
                if (count + 1 > half) {
                    return num;
                }
                else {
                    numsCount.put(num, count + 1);
                }
            }
            else {
                numsCount.put(num, 1);
            }
        }

        return 0;
    }
}
