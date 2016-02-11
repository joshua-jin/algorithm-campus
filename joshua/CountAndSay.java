package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/8/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/count-and-say/">报数</a>
 */
public class CountAndSay {
    public String countAndSay(int n) {
        // Write your code here
        String result = "1";
        while (n > 1) {
            result = generateNextString(result);
            n--;
        }
        return result;
    }

    private String generateNextString(String s) {
        String nextString = "";
        int charCount = 0;
        Character currentChar = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                charCount++;
            }
            else {
                nextString += (charCount + currentChar.toString());
                charCount = 1;
                currentChar = s.charAt(i);
            }
        }
        if (charCount > 0) {
            nextString += (charCount + currentChar.toString()) ;
        }
        return nextString;
    }
}
