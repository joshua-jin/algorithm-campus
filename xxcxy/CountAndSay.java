package algorithm.lintcode.easy;

public class CountAndSay {
    public String countAndSay(int n) {
        return countAndSay("1", n - 1);
    }

    private String countAndSay(final String say, final int time) {
        if (time == 0) {
            return say;
        }
        return countAndSay(sayOnce(say.substring(1), "", say.charAt(0), 1), time - 1);
    }

    private String sayOnce(final String remainStr, String haveSay, final char lastChar, int charCount) {
        if (remainStr.length() == 0) {
            return haveSay + charCount + lastChar;
        }
        if (remainStr.charAt(0) == lastChar) {
            charCount++;
        } else {
            haveSay = haveSay + charCount + lastChar;
            charCount = 1;
        }
        return sayOnce(remainStr.substring(1), haveSay, remainStr.charAt(0), charCount);
    }
}
