class Solution {
public:
    /**
     * @param dictionary: a vector of strings
     * @return: a vector of strings
     */
    vector<string> longestWords(vector<string> &dictionary) {
        int max_length = 0;
        for (auto &s : dictionary) if (s.length() > max_length) max_length = s.length();
        
        vector<string> out;
        for (auto &s : dictionary) if (s.length() == max_length) out.push_back(s);
        
        return out;
    }
};
