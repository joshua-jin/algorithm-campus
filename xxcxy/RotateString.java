package algorithm.lintcode.easy;

public class RotateString {
    public void rotateString(char[] str, int offset) {
        if (str == null || str.length == 0) {
            return;
        }
        offset %= str.length;
        if (offset == 0) {
            return;
        }
        ratateOne(str);
        rotateString(str, offset - 1);
    }

    private void ratateOne(char[] str) {
        char t = str[str.length - 1];
        for (int i = str.length - 1; i > 0; i--) {
            str[i] = str[i - 1];
        }
        str[0] = t;
    }
}
