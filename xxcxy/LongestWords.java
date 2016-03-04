package algorithm.lintcode.easy;

import java.util.ArrayList;

public class LongestWords {
    ArrayList<String> longestWords(String[] dictionary) {
        int longest = 0;
        ArrayList<String> longestList = new ArrayList<>();
        for (String str : dictionary) {
            if (str.length() == longest) {
                longestList.add(str);
            } else if (str.length() > longest) {
                longestList.clear();
                longestList.add(str);
                longest = str.length();
            }
        }
        return longestList;
    }
}
