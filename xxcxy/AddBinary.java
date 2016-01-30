package algorithm.lintcode.easy;

public class AddBinary {
    private final static int CHARTOINT = 48;

    public String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            b = fill(b, a.length() - b.length());
        } else {
            a = fill(a, b.length() - a.length());
        }
        String str = new String(addBinary(a.toCharArray(), b.toCharArray()));
        int firstOne = str.indexOf('1');
        return str.substring(firstOne == -1 ? 0 : firstOne);
    }

    public String fill(final String str, final int digit) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < digit; i++) {
            sb.insert(0, '0');
        }
        return sb.toString();
    }

    public char[] addBinary(final char[] a, final char[] b) {
        if (isZeroCharArray(b)) {
            return a;
        }
        char[] calChars = new char[a.length + 1];
        char[] carryChars = new char[a.length + 1];
        calChars[0] = '0';
        carryChars[a.length] = '0';
        for (int i = 1; i < a.length + 1; i++) {
            calChars[a.length + 1 - i] = (char) ((a[a.length - i] - CHARTOINT) ^ (b[b.length - i] - CHARTOINT) + CHARTOINT);
            carryChars[a.length - i] = (char) (((a[a.length - i] - CHARTOINT) & (b[b.length - i] - CHARTOINT)) + CHARTOINT);
        }
        return addBinary(calChars, carryChars);
    }

    private boolean isZeroCharArray(final char[] cs) {
        for (char c : cs) {
            if (c == '1') {
                return false;
            }
        }
        return true;
    }
}
