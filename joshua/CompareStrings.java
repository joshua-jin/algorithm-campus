package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/4/16
 */
public class CompareStrings {
    public boolean compareStrings(String A, String B) {
        // write your code here
        char[] chars = B.toCharArray();
        for (char c : chars) {
            if (!A.contains(String.valueOf(c))) {
                return false;
            }
            A = A.replaceFirst(String.valueOf(c), "a");
        }
        return true;
    }
}
