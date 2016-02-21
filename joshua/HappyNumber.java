package com.lintcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Joshua
 * Date:     2/20/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/happy-number/">快乐数</a>
 */
public class HappyNumber {
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    public boolean isHappy(int n) {
        // Write your code here
        Map<Integer, Integer> factor = new HashMap<Integer, Integer>();
        boolean isHappy = Boolean.TRUE;

        while (n != 1) {
            String nStr = String.valueOf(n);
            int tmp = 0;
            for (int i = 0; i < nStr.length(); i++) {
                tmp += (int)Math.pow(Double.valueOf(nStr.substring(i, i + 1)), 2);
            }

            if (tmp == 1) {
                break;
            }

            if (factor.containsKey(tmp)) {
                isHappy = Boolean.FALSE;
                break;
            }

            n = tmp;
            factor.put(tmp, tmp);
        }

        return isHappy;
    }
}
