class Solution {
public:
    /**
     * @param str: a string
     * @param offset: an integer
     * @return: nothing
     */
    void rotateString(string &str, int offset) {
        if (str.empty()) return;
        offset = offset % str.length();
        offset = (str.length() - offset - 1) % str.length();
        reverse(str, 0, offset);
        reverse(str, offset+1, str.length() - 1);
        reverse(str, 0, str.length() - 1);
    }
    void reverse(string &s, int start, int end) {
        while (start < end) {
            char c = s[start];
            s[start] = s[end];
            s[end] = c;
            start++;
            end--;
        }
    }
};
