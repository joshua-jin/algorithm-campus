class Solution {
public:
    /**
     * @param s : A string
     * @return : A string
     */
    string reverseWords(string s) {
        int start = 0;
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == ' ') {
                reverse(s, start, i-1);
                start = i+1;
            }
        }
        
        while (s.back() == ' ') s.pop_back();
        
        if (start > 0) {
            reverse(s, start, s.size() - 1);
            reverse(s, 0, s.size() - 1);
        }
        while (s.back() == ' ') s.pop_back();
        return s;
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
