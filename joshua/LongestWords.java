package com.lintcode;

import java.util.ArrayList;

/**
 * @author : Joshua
 * Date:     2/29/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/longest-words/">最长单词</a>
 */
public class LongestWords {
    ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        int max = 0;
        ArrayList<String> longestWordList = new ArrayList<String>();

        for (String word : dictionary) {
            if (word.length() > max) {
                max = word.length();
                longestWordList.clear();
                longestWordList.add(word);
            }
            else if (word.length() == max) {
                longestWordList.add(word);
            }
        }
        return longestWordList;
    }
}
