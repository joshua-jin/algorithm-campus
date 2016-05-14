package algorithm.lintcode.easy;

public class TwoStringsAreAnagrams {
    public boolean anagram(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        return anagram(s.toCharArray(), t.toCharArray(), s.length());
    }

    private boolean anagram(final char[] first, final char[] second, final int index) {
        if (index == 0) {
            return true;
        }
        for (int i = 0; i < index; i++) {
            if (first[i] == second[second.length - index]) {
                first[i] = first[index - 1];
                return anagram(first, second, index - 1);
            }
        }
        return false;
    }
}
