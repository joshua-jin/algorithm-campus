package algorithm.lintcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityNumber {
    public int majorityNumber(ArrayList<Integer> nums) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        for (Integer num : nums) {
            Integer currentCount = numCountMap.get(num);
            int numCount = currentCount == null ? 1 : (currentCount + 1);
            if (numCount * 2 > nums.size()) {
                return num;
            }
            numCountMap.put(num, numCount);
        }
        return -1;
    }
}
