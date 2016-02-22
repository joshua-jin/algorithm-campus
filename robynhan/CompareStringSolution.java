package org.robynhan.week4;

public class CompareStringSolution {

    public boolean compareStrings(String A, String B) {
        if (A.length() < B.length()) {
            return false;
        }
        int alphabetCount[] = new int[26];
        for (int index = 0; index < A.length(); index++) {
            alphabetCount[A.charAt(index) - 'A']++;
        }
        for (int index = 0; index < B.length(); index++) {
            alphabetCount[B.charAt(index) - 'A']--;
            if (alphabetCount[B.charAt(index) - 'A'] < 0) {
                return false;
            }
        }
        return true;
    }
}
