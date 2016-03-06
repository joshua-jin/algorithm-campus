package org.robynhan.week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityNumberSolution {
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        Map<Integer, Integer> counts = new HashMap<>();
        for (Integer num : nums) {
            if (counts.containsKey(num)) {
                counts.put(num, counts.get(num) + 1);
            } else {
                counts.put(num, 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : counts.entrySet()){
            if(entry.getValue() > nums.size() /2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
