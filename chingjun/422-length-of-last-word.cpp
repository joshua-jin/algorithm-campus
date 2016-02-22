class Solution {
public:
    /**
     * @param s A string
     * @return the length of last word
     */
    int lengthOfLastWord(string& s) {
        int count;
        for (char c : s)
            count = (c == ' ')? 0 : count + 1;
        return count;
    }
};
