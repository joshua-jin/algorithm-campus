package algorithm.lintcode.easy;

public class StrStr {
    public int strStr(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }
        int result = 0;
        while (source.length() >= target.length() + result) {
            if (source.startsWith(target, result)) {
                return result;
            }
            result++;
        }
        return -1;
    }
}
