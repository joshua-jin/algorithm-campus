package algorithm.lintcode.easy;

import java.util.ArrayList;

public class RecoverRotatedSortedArray {
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        boolean rotate = false;
        int rotateIndex = 0;
        for (int i = 1, len = nums.size(); i < len; i++) {
            if (!rotate) {
                if (nums.get(i) < nums.get(i - 1)) {
                    rotate = true;
                    rotateIndex = i;
                }
            }
            if (rotate) {
                nums.add(i - rotateIndex, nums.remove(i));
            }
        }
    }
}
