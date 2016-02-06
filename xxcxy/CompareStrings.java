package algorithm.lintcode.easy;

public class CompareStrings {
    public boolean compareStrings(String A, String B) {
        return contains(A.toCharArray(), B);
    }

    private boolean contains(final char[] chars, final String b) {
        if(b.length() == 0) {
            return true;
        }
        char c = b.charAt(0);
        for (int i = 0; i < chars.length; i++){
            if(chars[i] == c) {
                chars[i] = '0';
                return contains(chars, b.substring(1));
            }
        }
        return false;
    }
}
