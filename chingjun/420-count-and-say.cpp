class Solution {
public:
    /**
     * @param n the nth
     * @return the nth sequence
     */
    string say(const string &str) {
        string out;
        char x = '\0';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str[i] != x && count > 0) {
                out += to_string(count);
                out += x;
                count = 0;
            }
            
            x = str[i];
            count++;
        }
        
        if (count > 0) {
            out += to_string(count);
            out += x;
        }
        
        return out;
    }
    string countAndSay(int n) {
        string str = "1";
        for (int i = 1; i < n; i++) {
            str = say(str);
        }
        return str;
    }
};
