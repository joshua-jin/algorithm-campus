package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/23/16
 */
public class SpaceReplacement {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // Write your code here
        int newLength = doReplace(string, length, 0, 0);
        return length + newLength;
    }

    private int doReplace(char[] string, int length, int index, int newLength) {
        if (length == 0) {
            return newLength;
        }

        length -= 1;

        if (string[index] != ' ') {
            return doReplace(string, length, index + 1, newLength);
        } else {
            string[index] = '%';
            newLength += 2;
            doOffset(string, index + 1, new char[] {'2', '0'});
            return doReplace(string, length, index + 3, newLength);
        }
    }

    private void doOffset(char[] string, int index, char[] previous) {
        if (index >= string.length - 1) {
            return;
        }
        char tmp1 = string[index];
        char tmp2 = string[index + 1];
        string[index] = previous[0];
        string[index + 1] = previous[1];
        index += 2;
        doOffset(string, index, new char[] {tmp1, tmp2});
    }
}
