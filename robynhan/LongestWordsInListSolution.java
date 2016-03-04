package org.robynhan.week7;

import java.util.ArrayList;

public class LongestWordsInListSolution {
    ArrayList<String> longestWords(String[] dictionary) {
        ArrayList<String> result = new ArrayList<>();
        result.add("");
        // write your code here
        for (String word : dictionary) {
            if(word.length()>result.get(0).length()){
                result.clear();
                result.add(word);
            }else if(word.length() == result.get(0).length()){
                result.add(word);
            }
        }
        return result;
    }
}
