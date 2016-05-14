package algorithm.lintcode.easy;

public class UniqueCharacters {
    public boolean isUnique(String str) {
        if (str == null || str.length() < 2) {
            return true;
        }
        for (int i = 0, len = str.length(); i < len - 1; i++) {
            if (str.indexOf(str.charAt(i), i + 1) > -1) {
                return false;
            }
        }
        return true;
    }
}
