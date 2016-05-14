package algorithm.lintcode.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int prev = 0;
        int last = s.length() - 1;
        while (prev < last) {
            if (!isValidChar(s.charAt(prev))) {
                prev++;
                continue;
            }
            if (!isValidChar(s.charAt(last))) {
                last--;
                continue;
            }
            if (equalIgnoreCase(s.charAt(prev), s.charAt(last))) {
                last--;
                prev++;
                continue;
            }
            return false;
        }
        return true;
    }

    private boolean isValidChar(final char c) {
        return isNumberChar(c) || (c > 64 && c < 91) || (c > 96 && c < 123);
    }

    private boolean isNumberChar(final char c) {
        return (c > 46 && c < 58);
    }

    private boolean equalIgnoreCase(final char c1, final char c2) {
        if (c1 == c2) {
            return true;
        }
        if (isNumberChar(c1) || isNumberChar(c2)) {
            return false;
        }
        if (c1 - c2 == 32 || c1 - c2 == -32) {
            return true;
        }
        return false;
    }
}
