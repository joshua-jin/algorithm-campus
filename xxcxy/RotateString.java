package algorithm.lintcode.easy;

public class RotateString {
    public void rotateString(char[] str, int offset) {
        if (str == null || str.length == 0) {
            return;
        }
        int length = str.length;
        offset %= length;
        if (offset == 0) {
            return;
        }
        reverse(str, 0, length - offset - 1);
        reverse(str, length - offset, length - 1);
        reverse(str, 0, length - 1);
    }

    private void reverse(char[] str, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            char startChar = str[startIndex];
            str[startIndex++] = str[endIndex];
            str[endIndex--] = startChar;
        }
    }
}
