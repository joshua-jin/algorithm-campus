package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/28/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/length-of-last-word/">最后一个单词的长度</a>
 */
public class LengthOfLastWord {
    /**
     * @param s A string
     * @return the length of last word
     */
    public int lengthOfLastWord(String s) {
        // Write your code here
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
                length += 1;
            }
            else {
                if (i != s.length() - 1) {
                    length = 0;
                }
            }
        }

        return length;
    }
}
