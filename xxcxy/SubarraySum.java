package algorithm.lintcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public ArrayList<Integer> subarraySum(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 0);
        int sum = 0;
        for (int i = 0, len = nums.length; i < len; i++) {
            sum += nums[i];
            if (sumMap.get(sum) != null) {
                result.add(sumMap.get(sum));
                result.add(i);
                break;
            }
            sumMap.put(sum, i + 1);
        }
        return result;
    }
}
