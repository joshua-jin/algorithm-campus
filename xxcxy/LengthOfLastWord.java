package algorithm.lintcode.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        if (strs.length < 1) {
            return 0;
        }
        return strs[strs.length - 1].length();
    }
}
