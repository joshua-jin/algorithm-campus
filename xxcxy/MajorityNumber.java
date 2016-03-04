package algorithm.lintcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityNumber {
    public int majorityNumber(ArrayList<Integer> nums) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        for (Integer num : nums) {
            if (!numCountMap.containsKey(num)) {
                numCountMap.put(num, 0);
            }
            int numCount = numCountMap.get(num) + 1;
            if (numCount * 2 > nums.size()) {
                return num;
            }
            numCountMap.put(num, numCount);
        }
        return -1;
    }
}
