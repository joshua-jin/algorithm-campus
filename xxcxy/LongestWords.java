package algorithm.lintcode.easy;

import java.util.ArrayList;

public class LongestWords {
    ArrayList<String> longestWords(String[] dictionary) {
        int longest = 0;
        ArrayList<String> longestList = new ArrayList<>();
        for (String str : dictionary) {
            if (str.length() < longest) {
                continue;
            }
            if (str.length() > longest) {
                longest = str.length();
                longestList = new ArrayList<>();
            }
            longestList.add(str);
        }
        return longestList;
    }
}
