package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/16/16
 */
public class RotateString {
    /**
     * @param str: an array of char
     * @param offset: an integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if (str.length == 0 || offset == 0) {
            return;
        }

        offset = offset % str.length;
        for (int i = 0; i < offset; i++) {
            rotate(str, str[0], 1);
        }
    }

    private void rotate(char[] str, char previous, int index) {
        if (index == str.length - 1) {
            str[0] = str[index];
            str[index] = previous;
        } else {
            char tmp = str[index];
            str[index] = previous;
            previous = tmp;
            rotate(str, previous, ++index);
        }
    }
}
