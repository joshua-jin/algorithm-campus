package algorithm.lintcode.easy;

public class LeftPad {
    static public String leftPad(String originalStr, int size) {
        return leftPad(originalStr, size, ' ');
    }

    /**
     * @param originalStr the string we want to append to
     * @param size        the target length of the string
     * @param padChar     the character to pad to the left side of the string
     * @return a string
     */
    static public String leftPad(String originalStr, int size, char padChar) {
        return getRepeat(size - originalStr.length(), padChar) + originalStr;
    }

    static private String getRepeat(final int repeatCount, final char padChar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            sb.append(padChar);
        }
        return sb.toString();
    }
}
